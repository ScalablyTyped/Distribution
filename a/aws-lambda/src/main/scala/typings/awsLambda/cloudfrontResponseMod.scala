package typings.awsLambda

import typings.awsLambda.anon.CfCloudFrontEventreadonlyre
import typings.awsLambda.cloudfrontMod.CloudFrontResultResponse
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontResponseMod {
  
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  
  trait CloudFrontResponseEvent extends StObject {
    
    var Records: js.Array[CfCloudFrontEventreadonlyre]
  }
  object CloudFrontResponseEvent {
    
    inline def apply(Records: js.Array[CfCloudFrontEventreadonlyre]): CloudFrontResponseEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponseEvent]
    }
    
    extension [Self <: CloudFrontResponseEvent](x: Self) {
      
      inline def setRecords(value: js.Array[CfCloudFrontEventreadonlyre]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: CfCloudFrontEventreadonlyre*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  
  type CloudFrontResponseResult = js.UndefOr[Null | CloudFrontResultResponse]
}
