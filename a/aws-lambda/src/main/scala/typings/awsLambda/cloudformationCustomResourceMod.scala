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

object cloudformationCustomResourceMod {
  
  trait CloudFormationCustomResourceCreateEvent
    extends StObject
       with CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var RequestType: Create
  }
  object CloudFormationCustomResourceCreateEvent {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CloudFormationCustomResourceCreateEventMutableBuilder[Self <: CloudFormationCustomResourceCreateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestType(value: Create): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CloudFormationCustomResourceDeleteEventMutableBuilder[Self <: CloudFormationCustomResourceDeleteEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestType(value: Delete): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent
    - typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent
    - typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent
  */
  trait CloudFormationCustomResourceEvent extends StObject
  object CloudFormationCustomResourceEvent {
    
    @scala.inline
    def CloudFormationCustomResourceCreateEvent(
      LogicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Create", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent]
    }
    
    @scala.inline
    def CloudFormationCustomResourceDeleteEvent(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Delete", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent]
    }
    
    @scala.inline
    def CloudFormationCustomResourceUpdateEvent(
      LogicalResourceId: String,
      OldResourceProperties: StringDictionary[js.Any],
      PhysicalResourceId: String,
      RequestId: String,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = "Update", ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent]
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CloudFormationCustomResourceEventCommonMutableBuilder[Self <: CloudFormationCustomResourceEventCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogicalResourceId(value: String): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceProperties(value: DictKey): Self = StObject.set(x, "ResourceProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseURL(value: String): Self = StObject.set(x, "ResponseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceToken(value: String): Self = StObject.set(x, "ServiceToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      Reason: String,
      RequestId: String,
      StackId: String
    ): CloudFormationCustomResourceFailedResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "FAILED")
      __obj.asInstanceOf[CloudFormationCustomResourceFailedResponse]
    }
    
    @scala.inline
    implicit class CloudFormationCustomResourceFailedResponseMutableBuilder[Self <: CloudFormationCustomResourceFailedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: FAILED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFormationCustomResourceHandler = Handler[CloudFormationCustomResourceEvent, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse
    - typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse
  */
  trait CloudFormationCustomResourceResponse extends StObject
  object CloudFormationCustomResourceResponse {
    
    @scala.inline
    def CloudFormationCustomResourceFailedResponse(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      Reason: String,
      RequestId: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "FAILED")
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse]
    }
    
    @scala.inline
    def CloudFormationCustomResourceSuccessResponse(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "SUCCESS")
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse]
    }
  }
  
  trait CloudFormationCustomResourceResponseCommon extends StObject {
    
    var Data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var LogicalResourceId: String
    
    var NoEcho: js.UndefOr[Boolean] = js.undefined
    
    var PhysicalResourceId: String
    
    var RequestId: String
    
    var StackId: String
  }
  object CloudFormationCustomResourceResponseCommon {
    
    @scala.inline
    def apply(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): CloudFormationCustomResourceResponseCommon = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceResponseCommon]
    }
    
    @scala.inline
    implicit class CloudFormationCustomResourceResponseCommonMutableBuilder[Self <: CloudFormationCustomResourceResponseCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      @scala.inline
      def setLogicalResourceId(value: String): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEcho(value: Boolean): Self = StObject.set(x, "NoEcho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEchoUndefined: Self = StObject.set(x, "NoEcho", js.undefined)
      
      @scala.inline
      def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): CloudFormationCustomResourceSuccessResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = "SUCCESS")
      __obj.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
    }
    
    @scala.inline
    implicit class CloudFormationCustomResourceSuccessResponseMutableBuilder[Self <: CloudFormationCustomResourceSuccessResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
      
      @scala.inline
      def setStatus(value: SUCCESS): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFormationCustomResourceUpdateEvent
    extends StObject
       with CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var OldResourceProperties: StringDictionary[js.Any]
    
    var PhysicalResourceId: String
    
    var RequestType: Update
  }
  object CloudFormationCustomResourceUpdateEvent {
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      OldResourceProperties: StringDictionary[js.Any],
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
    
    @scala.inline
    implicit class CloudFormationCustomResourceUpdateEventMutableBuilder[Self <: CloudFormationCustomResourceUpdateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldResourceProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "OldResourceProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestType(value: Update): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    }
  }
}
