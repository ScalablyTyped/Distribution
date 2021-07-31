package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrityMod {
  
  @JSImport("app-builder-lib/out/asar/integrity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeData(resourcesPath: String): js.Promise[AsarIntegrity] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeData")(resourcesPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AsarIntegrity]]
  @scala.inline
  def computeData(resourcesPath: String, options: AsarIntegrityOptions): js.Promise[AsarIntegrity] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeData")(resourcesPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AsarIntegrity]]
  
  trait AsarIntegrity
    extends StObject
       with AsarIntegrityOptions {
    
    var checksums: StringDictionary[String]
  }
  object AsarIntegrity {
    
    @scala.inline
    def apply(checksums: StringDictionary[String]): AsarIntegrity = {
      val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsarIntegrity]
    }
    
    @scala.inline
    implicit class AsarIntegrityMutableBuilder[Self <: AsarIntegrity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecksums(value: StringDictionary[String]): Self = StObject.set(x, "checksums", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsarIntegrityOptions extends StObject {
    
    /**
      * Allows external asar files.
      *
      * @default false
      */
    val externalAllowed: js.UndefOr[Boolean] = js.undefined
  }
  object AsarIntegrityOptions {
    
    @scala.inline
    def apply(): AsarIntegrityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsarIntegrityOptions]
    }
    
    @scala.inline
    implicit class AsarIntegrityOptionsMutableBuilder[Self <: AsarIntegrityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalAllowed(value: Boolean): Self = StObject.set(x, "externalAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalAllowedUndefined: Self = StObject.set(x, "externalAllowed", js.undefined)
    }
  }
}
