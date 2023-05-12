package typings.angularCli

import typings.angularCli.anon.OptionsConfigCommandArgs
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsConfigCliMod {
  
  @JSImport("@angular/cli/src/commands/config/cli", JSImport.Default)
  @js.native
  open class default () extends ConfigCommandModule
  
  trait ConfigCommandArgs extends StObject {
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var `json-path`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ConfigCommandArgs {
    
    inline def apply(): ConfigCommandArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def `setJson-path`(value: String): Self = StObject.set(x, "json-path", value.asInstanceOf[js.Any])
      
      inline def `setJson-pathUndefined`: Self = StObject.set(x, "json-path", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ConfigCommandModule extends CommandModule[ConfigCommandArgs] {
    
    @JSName("describe")
    var describe_ConfigCommandModule: String = js.native
    
    /* private */ var get: Any = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_ConfigCommandModule: String = js.native
    
    def run(options: OptionsConfigCommandArgs): js.Promise[Double | Unit] = js.native
    
    /* private */ var set: Any = js.native
  }
}
