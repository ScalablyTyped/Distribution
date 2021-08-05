package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IServiceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModalProvider
  extends StObject
     with IServiceProvider {
  
  /**
    * Default options all modals will use.
    */
  var options: IModalSettings
}
object IModalProvider {
  
  inline def apply($get: js.Any, options: IModalSettings): IModalProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalProvider]
  }
  
  extension [Self <: IModalProvider](x: Self) {
    
    inline def setOptions(value: IModalSettings): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
