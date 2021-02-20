package typings.appBuilderLib

import typings.appBuilderLib.packagerApiMod.PackagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forgeMakerMod {
  
  @JSImport("app-builder-lib/out/forge-maker", "buildForge")
  @js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  
  @js.native
  trait ForgeOptions extends StObject {
    
    val dir: String = js.native
  }
  object ForgeOptions {
    
    @scala.inline
    def apply(dir: String): ForgeOptions = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForgeOptions]
    }
    
    @scala.inline
    implicit class ForgeOptionsMutableBuilder[Self <: ForgeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
}
