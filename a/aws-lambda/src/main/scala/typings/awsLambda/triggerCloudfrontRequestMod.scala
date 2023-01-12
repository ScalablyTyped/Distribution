package typings.awsLambda

import typings.awsLambda.anon.CloudFrontEventrequestClo
import typings.awsLambda.commonCloudfrontMod.CloudFrontHeaders
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCloudfrontRequestMod {
  
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  
  trait CloudFrontRequestEvent extends StObject {
    
    var Records: js.Array[CloudFrontRequestEventRecord]
  }
  object CloudFrontRequestEvent {
    
    inline def apply(Records: js.Array[CloudFrontRequestEventRecord]): CloudFrontRequestEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequestEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontRequestEvent] (val x: Self) extends AnyVal {
      
      inline def setRecords(value: js.Array[CloudFrontRequestEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: CloudFrontRequestEventRecord*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  trait CloudFrontRequestEventRecord extends StObject {
    
    var cf: CloudFrontEventrequestClo
  }
  object CloudFrontRequestEventRecord {
    
    inline def apply(cf: CloudFrontEventrequestClo): CloudFrontRequestEventRecord = {
      val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequestEventRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontRequestEventRecord] (val x: Self) extends AnyVal {
      
      inline def setCf(value: CloudFrontEventrequestClo): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - scala.Null
    - typings.awsLambda.commonCloudfrontMod.CloudFrontResultResponse
    - typings.awsLambda.commonCloudfrontMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[_CloudFrontRequestResult | Null]
  
  trait _CloudFrontRequestResult extends StObject
  object _CloudFrontRequestResult {
    
    inline def CloudFrontRequest(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): typings.awsLambda.commonCloudfrontMod.CloudFrontRequest = {
      val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.commonCloudfrontMod.CloudFrontRequest]
    }
    
    inline def CloudFrontResultResponse(status: String): typings.awsLambda.commonCloudfrontMod.CloudFrontResultResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.commonCloudfrontMod.CloudFrontResultResponse]
    }
  }
}
