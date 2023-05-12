package typings.angularCli

import typings.angularCli.anon.OptionsAnalyticsCommandAr
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsAnalyticsSettingsCliMod {
  
  @JSImport("@angular/cli/src/commands/analytics/settings/cli", "AnalyticsDisableModule")
  @js.native
  open class AnalyticsDisableModule () extends AnalyticsSettingModule {
    
    var aliases: String = js.native
    
    @JSName("describe")
    var describe_AnalyticsDisableModule: String = js.native
  }
  
  @JSImport("@angular/cli/src/commands/analytics/settings/cli", "AnalyticsEnableModule")
  @js.native
  open class AnalyticsEnableModule () extends AnalyticsSettingModule {
    
    var aliases: String = js.native
    
    @JSName("describe")
    var describe_AnalyticsEnableModule: String = js.native
  }
  
  @JSImport("@angular/cli/src/commands/analytics/settings/cli", "AnalyticsPromptModule")
  @js.native
  open class AnalyticsPromptModule () extends AnalyticsSettingModule {
    
    @JSName("describe")
    var describe_AnalyticsPromptModule: String = js.native
  }
  
  trait AnalyticsCommandArgs extends StObject {
    
    var global: Boolean
  }
  object AnalyticsCommandArgs {
    
    inline def apply(global: Boolean): AnalyticsCommandArgs = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnalyticsSettingModule extends CommandModule[AnalyticsCommandArgs] {
    
    def run(param0: OptionsAnalyticsCommandAr): js.Promise[Unit] = js.native
  }
}
