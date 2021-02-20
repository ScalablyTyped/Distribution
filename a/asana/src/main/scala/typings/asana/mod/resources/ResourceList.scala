package typings.asana.mod.resources

import typings.asana.anon.AsanaBaseUrl
import typings.asana.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceList[T /* <: typings.asana.mod.resources.Resource */] extends StObject {
  
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
  def apply[T /* <: typings.asana.mod.resources.Resource */](
    _dispatcher: AsanaBaseUrl,
    _response: Data[T],
    data: js.Array[T],
    nextPage: () => typings.bluebird.mod.^[ResourceList[T] | Null]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[ResourceList[T]]
  }
  
  @scala.inline
  implicit class ResourceListMutableBuilder[Self <: ResourceList[_], T /* <: typings.asana.mod.resources.Resource */] (val x: Self with ResourceList[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setNextPage(value: () => typings.bluebird.mod.^[ResourceList[T] | Null]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_dispatcher(value: AsanaBaseUrl): Self = StObject.set(x, "_dispatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_response(value: Data[T]): Self = StObject.set(x, "_response", value.asInstanceOf[js.Any])
  }
}
