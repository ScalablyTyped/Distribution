package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalService extends StObject {
  
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[_] = js.native
  
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService = js.native
}
object IModalService {
  
  @scala.inline
  def apply(getPromiseChain: () => IPromise[_], open: IModalSettings => IModalInstanceService): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IModalService]
  }
  
  @scala.inline
  implicit class IModalServiceMutableBuilder[Self <: IModalService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPromiseChain(value: () => IPromise[_]): Self = StObject.set(x, "getPromiseChain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: IModalSettings => IModalInstanceService): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
