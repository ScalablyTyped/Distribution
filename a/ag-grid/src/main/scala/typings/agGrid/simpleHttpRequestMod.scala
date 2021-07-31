package typings.agGrid

import typings.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleHttpRequestMod {
  
  @JSImport("ag-grid/dist/lib/misc/simpleHttpRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def simpleHttpRequest(params: SimpleHttpRequestParams): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleHttpRequest")(params.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
  
  trait SimpleHttpRequestParams extends StObject {
    
    var url: String
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
