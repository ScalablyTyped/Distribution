package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.BrowseRequestData
import typings.algoliaClientSearch.mod.BrowseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request[TObject] extends StObject {
  
  def request(data: BrowseRequestData): js.Promise[BrowseResponse[TObject]]
  
  def shouldStop(response: BrowseResponse[TObject]): Boolean
}
object Request {
  
  @scala.inline
  def apply[TObject](
    request: BrowseRequestData => js.Promise[BrowseResponse[TObject]],
    shouldStop: BrowseResponse[TObject] => Boolean
  ): Request[TObject] = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request), shouldStop = js.Any.fromFunction1(shouldStop))
    __obj.asInstanceOf[Request[TObject]]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request[?], TObject] (val x: Self & Request[TObject]) extends AnyVal {
    
    @scala.inline
    def setRequest(value: BrowseRequestData => js.Promise[BrowseResponse[TObject]]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldStop(value: BrowseResponse[TObject] => Boolean): Self = StObject.set(x, "shouldStop", js.Any.fromFunction1(value))
  }
}
