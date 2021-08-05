package typings.awsLambda

import typings.awsLambda.anon.Cf
import typings.awsLambda.cloudfrontMod.CloudFrontHeaders
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontRequestMod {
  
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  
  trait CloudFrontRequestEvent extends StObject {
    
    var Records: js.Array[Cf]
  }
  object CloudFrontRequestEvent {
    
    inline def apply(Records: js.Array[Cf]): CloudFrontRequestEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequestEvent]
    }
    
    extension [Self <: CloudFrontRequestEvent](x: Self) {
      
      inline def setRecords(value: js.Array[Cf]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: Cf*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - scala.Null
    - typings.awsLambda.cloudfrontMod.CloudFrontResultResponse
    - typings.awsLambda.cloudfrontMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[_CloudFrontRequestResult | Null]
  
  trait _CloudFrontRequestResult extends StObject
  object _CloudFrontRequestResult {
    
    inline def CloudFrontRequest(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): typings.awsLambda.cloudfrontMod.CloudFrontRequest = {
      val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudfrontMod.CloudFrontRequest]
    }
    
    inline def CloudFrontResultResponse(status: String): typings.awsLambda.cloudfrontMod.CloudFrontResultResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudfrontMod.CloudFrontResultResponse]
    }
  }
}
