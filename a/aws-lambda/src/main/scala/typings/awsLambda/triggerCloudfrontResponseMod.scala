package typings.awsLambda

import typings.awsLambda.anon.Cf
import typings.awsLambda.commonCloudfrontMod.CloudFrontResultResponse
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCloudfrontResponseMod {
  
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  
  trait CloudFrontResponseEvent extends StObject {
    
    var Records: js.Array[Cf]
  }
  object CloudFrontResponseEvent {
    
    inline def apply(Records: js.Array[Cf]): CloudFrontResponseEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontResponseEvent] (val x: Self) extends AnyVal {
      
      inline def setRecords(value: js.Array[Cf]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: Cf*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  
  type CloudFrontResponseResult = js.UndefOr[Null | CloudFrontResultResponse]
}
