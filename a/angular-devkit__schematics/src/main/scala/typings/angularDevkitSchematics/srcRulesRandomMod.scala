package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesRandomMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: RandomOptions): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Source]
  
  trait RandomOptions extends StObject {
    
    var multi: js.UndefOr[Boolean | Double] = js.undefined
    
    var multiFiles: js.UndefOr[Boolean | Double] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object RandomOptions {
    
    inline def apply(): RandomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomOptions] (val x: Self) extends AnyVal {
      
      inline def setMulti(value: Boolean | Double): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiFiles(value: Boolean | Double): Self = StObject.set(x, "multiFiles", value.asInstanceOf[js.Any])
      
      inline def setMultiFilesUndefined: Self = StObject.set(x, "multiFiles", js.undefined)
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
