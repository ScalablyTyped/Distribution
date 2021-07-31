package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[D, E] extends StObject {
  
  @JSName("$response")
  var $response: typings.awsSdk.responseMod.Response[D, E]
}
object Response {
  
  @scala.inline
  def apply[D, E]($response: typings.awsSdk.responseMod.Response[D, E]): Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[D, E]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[?, ?], D, E] (val x: Self & (Response[D, E])) extends AnyVal {
    
    @scala.inline
    def set$response(value: typings.awsSdk.responseMod.Response[D, E]): Self = StObject.set(x, "$response", value.asInstanceOf[js.Any])
  }
}
