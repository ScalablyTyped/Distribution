package typings.asana.mod.resources

import typings.asana.anon.AsanaBaseUrl
import typings.asana.anon.Nextpage
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceList[T /* <: AnonymousResource */] extends StObject {
  
  var _dispatcher: AsanaBaseUrl
  
  var _response: Nextpage[T]
  
  var data: js.Array[T]
  
  /**
    * Get the next page of results in a collection.
    *
    * @returns {Promise<Collection?>} Resolves to either a collection representing
    *     the next page of results, or null if no more pages.
    */
  def nextPage(): ^[ResourceList[T] | Null]
  
  def stream(): ResourceStream[T]
}
object ResourceList {
  
  inline def apply[T /* <: AnonymousResource */](
    _dispatcher: AsanaBaseUrl,
    _response: Nextpage[T],
    data: js.Array[T],
    nextPage: () => ^[ResourceList[T] | Null],
    stream: () => ResourceStream[T]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), stream = js.Any.fromFunction0(stream))
    __obj.asInstanceOf[ResourceList[T]]
  }
  
  extension [Self <: ResourceList[?], T /* <: AnonymousResource */](x: Self & ResourceList[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setNextPage(value: () => ^[ResourceList[T] | Null]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
    
    inline def setStream(value: () => ResourceStream[T]): Self = StObject.set(x, "stream", js.Any.fromFunction0(value))
    
    inline def set_dispatcher(value: AsanaBaseUrl): Self = StObject.set(x, "_dispatcher", value.asInstanceOf[js.Any])
    
    inline def set_response(value: Nextpage[T]): Self = StObject.set(x, "_response", value.asInstanceOf[js.Any])
  }
}
