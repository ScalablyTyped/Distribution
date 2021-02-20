package typings.agGrid

import typings.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleHttpRequestMod {
  
  @JSImport("ag-grid/dist/lib/misc/simpleHttpRequest", "simpleHttpRequest")
  @js.native
  def simpleHttpRequest(params: SimpleHttpRequestParams): Promise[_] = js.native
  
  @js.native
  trait SimpleHttpRequestParams extends StObject {
    
    var url: String = js.native
  }
  object SimpleHttpRequestParams {
    
    @scala.inline
    def apply(url: String): SimpleHttpRequestParams = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleHttpRequestParams]
    }
    
    @scala.inline
    implicit class SimpleHttpRequestParamsMutableBuilder[Self <: SimpleHttpRequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
