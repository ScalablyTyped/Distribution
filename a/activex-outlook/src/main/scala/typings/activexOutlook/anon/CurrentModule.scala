package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.NavigationModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentModule extends StObject {
  
  val CurrentModule: NavigationModule
}
object CurrentModule {
  
  inline def apply(CurrentModule: NavigationModule): CurrentModule = {
    val __obj = js.Dynamic.literal(CurrentModule = CurrentModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentModule]
  }
  
  extension [Self <: CurrentModule](x: Self) {
    
    inline def setCurrentModule(value: NavigationModule): Self = StObject.set(x, "CurrentModule", value.asInstanceOf[js.Any])
  }
}
