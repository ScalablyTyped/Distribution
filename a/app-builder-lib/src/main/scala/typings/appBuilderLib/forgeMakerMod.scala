package typings.appBuilderLib

import typings.appBuilderLib.packagerApiMod.PackagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forgeMakerMod {
  
  @JSImport("app-builder-lib/out/forge-maker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForge")(forgeOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait ForgeOptions extends StObject {
    
    val dir: String
  }
  object ForgeOptions {
    
    inline def apply(dir: String): ForgeOptions = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForgeOptions]
    }
    
    extension [Self <: ForgeOptions](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
}
