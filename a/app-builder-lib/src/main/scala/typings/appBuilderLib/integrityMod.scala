package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrityMod {
  
  @JSImport("app-builder-lib/out/asar/integrity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeData(resourcesPath: String): js.Promise[AsarIntegrity] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeData")(resourcesPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AsarIntegrity]]
  inline def computeData(resourcesPath: String, options: AsarIntegrityOptions): js.Promise[AsarIntegrity] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeData")(resourcesPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AsarIntegrity]]
  
  trait AsarIntegrity
    extends StObject
       with AsarIntegrityOptions {
    
    var checksums: StringDictionary[String]
  }
  object AsarIntegrity {
    
    inline def apply(checksums: StringDictionary[String]): AsarIntegrity = {
      val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsarIntegrity]
    }
    
    extension [Self <: AsarIntegrity](x: Self) {
      
      inline def setChecksums(value: StringDictionary[String]): Self = StObject.set(x, "checksums", value.asInstanceOf[js.Any])
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
    
    inline def apply(): AsarIntegrityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsarIntegrityOptions]
    }
    
    extension [Self <: AsarIntegrityOptions](x: Self) {
      
      inline def setExternalAllowed(value: Boolean): Self = StObject.set(x, "externalAllowed", value.asInstanceOf[js.Any])
      
      inline def setExternalAllowedUndefined: Self = StObject.set(x, "externalAllowed", js.undefined)
    }
  }
}
