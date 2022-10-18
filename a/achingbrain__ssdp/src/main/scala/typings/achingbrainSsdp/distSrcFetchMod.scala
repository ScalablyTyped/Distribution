package typings.achingbrainSsdp

import typings.achingbrainSsdp.achingbrainSsdpStrings.GET
import typings.achingbrainSsdp.achingbrainSsdpStrings.POST
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFetchMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetch(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def fetch(url: String, init: RequestInit): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait RequestInit extends StObject {
    
    var body: js.UndefOr[Buffer | String] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var method: js.UndefOr[POST | GET] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setBody(value: Buffer | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: POST | GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
