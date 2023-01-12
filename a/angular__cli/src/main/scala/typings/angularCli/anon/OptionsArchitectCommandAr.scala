package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/command-builder/architect-command-module.ArchitectCommandArgs> */
trait OptionsArchitectCommandAr extends StObject {
  
  var configuration: js.UndefOr[String] = js.undefined
  
  var project: js.UndefOr[String] = js.undefined
}
object OptionsArchitectCommandAr {
  
  inline def apply(): OptionsArchitectCommandAr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsArchitectCommandAr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsArchitectCommandAr] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
