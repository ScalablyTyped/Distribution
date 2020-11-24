package typings.asana.mod.resources

import typings.asana.anon.AsanaBaseUrl
import typings.asana.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceList[T /* <: Resource */] extends js.Object {
  
  var _dispatcher: AsanaBaseUrl = js.native
  
  var _response: Data[T] = js.native
  
  var data: js.Array[T] = js.native
  
  /**
    * Get the next page of results in a collection.
    *
    * @returns {Promise<Collection?>} Resolves to either a collection representing
    *     the next page of results, or null if no more pages.
    */
  def nextPage(): typings.bluebird.mod.^[ResourceList[T] | Null] = js.native
}
object ResourceList {
  
  @scala.inline
  def apply[T /* <: Resource */](
    _dispatcher: AsanaBaseUrl,
    _response: Data[T],
    data: js.Array[T],
    nextPage: () => typings.bluebird.mod.^[ResourceList[T] | Null]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[ResourceList[T]]
  }
  
  @scala.inline
  implicit class ResourceListOps[Self <: ResourceList[_], T /* <: Resource */] (val x: Self with ResourceList[T]) extends AnyVal {
    
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
    def set_dispatcher(value: AsanaBaseUrl): Self = this.set("_dispatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_response(value: Data[T]): Self = this.set("_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPage(value: () => typings.bluebird.mod.^[ResourceList[T] | Null]): Self = this.set("nextPage", js.Any.fromFunction0(value))
  }
}
