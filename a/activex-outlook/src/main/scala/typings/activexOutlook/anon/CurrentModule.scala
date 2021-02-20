package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.NavigationModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentModule extends StObject {
  
  val CurrentModule: NavigationModule = js.native
}
object CurrentModule {
  
  @scala.inline
  def apply(CurrentModule: NavigationModule): CurrentModule = {
    val __obj = js.Dynamic.literal(CurrentModule = CurrentModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentModule]
  }
  
  @scala.inline
  implicit class CurrentModuleMutableBuilder[Self <: CurrentModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentModule(value: NavigationModule): Self = StObject.set(x, "CurrentModule", value.asInstanceOf[js.Any])
  }
}
