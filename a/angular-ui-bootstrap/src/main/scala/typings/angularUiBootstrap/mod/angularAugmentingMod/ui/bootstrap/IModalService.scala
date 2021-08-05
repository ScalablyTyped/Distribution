package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModalService extends StObject {
  
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[js.Any]
  
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService
}
object IModalService {
  
  inline def apply(getPromiseChain: () => IPromise[js.Any], open: IModalSettings => IModalInstanceService): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IModalService]
  }
  
  extension [Self <: IModalService](x: Self) {
    
    inline def setGetPromiseChain(value: () => IPromise[js.Any]): Self = StObject.set(x, "getPromiseChain", js.Any.fromFunction0(value))
    
    inline def setOpen(value: IModalSettings => IModalInstanceService): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
