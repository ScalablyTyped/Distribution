package typings.angularLoad.angular.load

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAngularLoadService extends js.Object {
  
  def loadCSS(url: String): IPromise[_] = js.native
  
  def loadScript(url: String): IPromise[_] = js.native
}
object IAngularLoadService {
  
  @scala.inline
  def apply(loadCSS: String => IPromise[_], loadScript: String => IPromise[_]): IAngularLoadService = {
    val __obj = js.Dynamic.literal(loadCSS = js.Any.fromFunction1(loadCSS), loadScript = js.Any.fromFunction1(loadScript))
    __obj.asInstanceOf[IAngularLoadService]
  }
  
  @scala.inline
  implicit class IAngularLoadServiceOps[Self <: IAngularLoadService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadCSS(value: String => IPromise[_]): Self = this.set("loadCSS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadScript(value: String => IPromise[_]): Self = this.set("loadScript", js.Any.fromFunction1(value))
  }
}
