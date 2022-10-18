package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.DictKey
import typings.awsLambda.awsLambdaStrings.Create
import typings.awsLambda.awsLambdaStrings.Delete
import typings.awsLambda.awsLambdaStrings.FAILED
import typings.awsLambda.awsLambdaStrings.SUCCESS
import typings.awsLambda.awsLambdaStrings.Update
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCloudformationCustomResourceMod {
  
  trait CloudFormationCustomResourceCreateEvent
    extends StObject
       with CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var RequestType: Create
  }
  object CloudFormationCustomResourceCreateEvent {
    
    inline def apply(
      LogicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceCreateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Create", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceCreateEvent]
    }
    
    extension [Self <: CloudFormationCustomResourceCreateEvent](x: Self) {
      
      inline def setRequestType(value: Create): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFormationCustomResourceDeleteEvent
    extends StObject
       with CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var PhysicalResourceId: String
    
    var RequestType: Delete
  }
  object CloudFormationCustomResourceDeleteEvent {
    
    inline def apply(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceDeleteEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Delete", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceDeleteEvent]
    }
    
    extension [Self <: CloudFormationCustomResourceDeleteEvent](x: Self) {
      
      inline def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: Delete): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent
    - typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent
    - typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent
  */
  trait CloudFormationCustomResourceEvent extends StObject
  object CloudFormationCustomResourceEvent {
    
    inline def CloudFormationCustomResourceCreateEvent(
      LogicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Create", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent]
    }
    
    inline def CloudFormationCustomResourceDeleteEvent(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Delete", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent]
    }
    
    inline def CloudFormationCustomResourceUpdateEvent(
      LogicalResourceId: String,
      OldResourceProperties: StringDictionary[Any],
      PhysicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Update", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent]
    }
  }
  
  trait CloudFormationCustomResourceEventCommon extends StObject {
    
    var LogicalResourceId: String
    
    var RequestId: String
    
    var ResourceProperties: DictKey
    
    var ResourceType: String
    
    var ResponseURL: String
    
    var ServiceToken: String
    
    var StackId: String
  }
  object CloudFormationCustomResourceEventCommon {
    
    inline def apply(
      LogicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceEventCommon = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceEventCommon]
    }
    
    extension [Self <: CloudFormationCustomResourceEventCommon](x: Self) {
      
      inline def setLogicalResourceId(value: String): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      inline def setResourceProperties(value: DictKey): Self = StObject.set(x, "ResourceProperties", value.asInstanceOf[js.Any])
      
      inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
      
      inline def setResponseURL(value: String): Self = StObject.set(x, "ResponseURL", value.asInstanceOf[js.Any])
      
      inline def setServiceToken(value: String): Self = StObject.set(x, "ServiceToken", value.asInstanceOf[js.Any])
      
      inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFormationCustomResourceFailedResponse
    extends StObject
       with CloudFormationCustomResourceResponseCommon
       with CloudFormationCustomResourceResponse {
    
    var Reason: String
    
    var Status: FAILED
  }
  object CloudFormationCustomResourceFailedResponse {
    
    inline def apply(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      Reason: String,
      RequestId: String,
      StackId: String
    ): CloudFormationCustomResourceFailedResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "FAILED")
      __obj.asInstanceOf[CloudFormationCustomResourceFailedResponse]
    }
    
    extension [Self <: CloudFormationCustomResourceFailedResponse](x: Self) {
      
      inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FAILED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFormationCustomResourceHandler = Handler[CloudFormationCustomResourceEvent, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse
    - typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse
  */
  trait CloudFormationCustomResourceResponse extends StObject
  object CloudFormationCustomResourceResponse {
    
    inline def CloudFormationCustomResourceFailedResponse(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      Reason: String,
      RequestId: String,
      StackId: String
    ): typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "FAILED")
      __obj.asInstanceOf[typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse]
    }
    
    inline def CloudFormationCustomResourceSuccessResponse(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "SUCCESS")
      __obj.asInstanceOf[typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse]
    }
  }
  
  trait CloudFormationCustomResourceResponseCommon extends StObject {
    
    var Data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var LogicalResourceId: String
    
    var NoEcho: js.UndefOr[Boolean] = js.undefined
    
    var PhysicalResourceId: String
    
    var RequestId: String
    
    var StackId: String
  }
  object CloudFormationCustomResourceResponseCommon {
    
    inline def apply(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): CloudFormationCustomResourceResponseCommon = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceResponseCommon]
    }
    
    extension [Self <: CloudFormationCustomResourceResponseCommon](x: Self) {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setLogicalResourceId(value: String): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
      
      inline def setNoEcho(value: Boolean): Self = StObject.set(x, "NoEcho", value.asInstanceOf[js.Any])
      
      inline def setNoEchoUndefined: Self = StObject.set(x, "NoEcho", js.undefined)
      
      inline def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFormationCustomResourceSuccessResponse
    extends StObject
       with CloudFormationCustomResourceResponseCommon
       with CloudFormationCustomResourceResponse {
    
    var Reason: js.UndefOr[String] = js.undefined
    
    var Status: SUCCESS
  }
  object CloudFormationCustomResourceSuccessResponse {
    
    inline def apply(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): CloudFormationCustomResourceSuccessResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "SUCCESS")
      __obj.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
    }
    
    extension [Self <: CloudFormationCustomResourceSuccessResponse](x: Self) {
      
      inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
      
      inline def setStatus(value: SUCCESS): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFormationCustomResourceUpdateEvent
    extends StObject
       with CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var OldResourceProperties: StringDictionary[Any]
    
    var PhysicalResourceId: String
    
    var RequestType: Update
  }
  object CloudFormationCustomResourceUpdateEvent {
    
    inline def apply(
      LogicalResourceId: String,
      OldResourceProperties: StringDictionary[Any],
      PhysicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceUpdateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Update", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
    }
    
    extension [Self <: CloudFormationCustomResourceUpdateEvent](x: Self) {
      
      inline def setOldResourceProperties(value: StringDictionary[Any]): Self = StObject.set(x, "OldResourceProperties", value.asInstanceOf[js.Any])
      
      inline def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      inline def setRequestType(value: Update): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    }
  }
}
