package typings.angularResource.mod.global

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array[T] extends js.Object {
  
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: IPromise[Array[T]] = js.native
  
  @JSName("$resolved")
  var $resolved: Boolean = js.native
}
object Array {
  
  @scala.inline
  def apply[T]($promise: IPromise[Array[T]], $resolved: Boolean): Array[T] = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], $resolved = $resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  
  @scala.inline
  implicit class ArrayOps[Self <: Array[_], T] (val x: Self with Array[T]) extends AnyVal {
    
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
    def set$promise(value: IPromise[Array[T]]): Self = this.set("$promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$resolved(value: Boolean): Self = this.set("$resolved", value.asInstanceOf[js.Any])
  }
}
