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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudformationCustomResourceMod {
  
  @js.native
  trait CloudFormationCustomResourceCreateEvent
    extends CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var RequestType: Create = js.native
  }
  object CloudFormationCustomResourceCreateEvent {
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      RequestId: String,
      RequestType: Create,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceCreateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFormationCustomResourceCreateEvent]
    }
    
    @scala.inline
    implicit class CloudFormationCustomResourceCreateEventMutableBuilder[Self <: CloudFormationCustomResourceCreateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestType(value: Create): Self = StObject.set(x, "RequestType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloudFormationCustomResourceDeleteEvent
    extends CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var PhysicalResourceId: String = js.native
    
    var RequestType: Delete = js.native
  }
  object CloudFormationCustomResourceDeleteEvent {
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      RequestType: Delete,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceDeleteEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
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
      RequestType: Create,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent]
    }
    
    @scala.inline
    def CloudFormationCustomResourceDeleteEvent(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      RequestType: Delete,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent]
    }
    
    @scala.inline
    def CloudFormationCustomResourceUpdateEvent(
      LogicalResourceId: String,
      OldResourceProperties: StringDictionary[js.Any],
      PhysicalResourceId: String,
      RequestId: String,
      RequestType: Update,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent]
    }
  }
  
  @js.native
  trait CloudFormationCustomResourceEventCommon extends StObject {
    
    var LogicalResourceId: String = js.native
    
    var RequestId: String = js.native
    
    var ResourceProperties: DictKey = js.native
    
    var ResourceType: String = js.native
    
    var ResponseURL: String = js.native
    
    var ServiceToken: String = js.native
    
    var StackId: String = js.native
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
  
  @js.native
  trait CloudFormationCustomResourceFailedResponse
    extends CloudFormationCustomResourceResponseCommon
       with CloudFormationCustomResourceResponse {
    
    var Reason: String = js.native
    
    var Status: FAILED = js.native
  }
  object CloudFormationCustomResourceFailedResponse {
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      Reason: String,
      RequestId: String,
      StackId: String,
      Status: FAILED
    ): CloudFormationCustomResourceFailedResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
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
      StackId: String,
      Status: FAILED
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse]
    }
    
    @scala.inline
    def CloudFormationCustomResourceSuccessResponse(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      StackId: String,
      Status: SUCCESS
    ): typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse]
    }
  }
  
  @js.native
  trait CloudFormationCustomResourceResponseCommon extends StObject {
    
    var Data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var LogicalResourceId: String = js.native
    
    var NoEcho: js.UndefOr[Boolean] = js.native
    
    var PhysicalResourceId: String = js.native
    
    var RequestId: String = js.native
    
    var StackId: String = js.native
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
  
  @js.native
  trait CloudFormationCustomResourceSuccessResponse
    extends CloudFormationCustomResourceResponseCommon
       with CloudFormationCustomResourceResponse {
    
    var Reason: js.UndefOr[String] = js.native
    
    var Status: SUCCESS = js.native
  }
  object CloudFormationCustomResourceSuccessResponse {
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      PhysicalResourceId: String,
      RequestId: String,
      StackId: String,
      Status: SUCCESS
    ): CloudFormationCustomResourceSuccessResponse = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
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
  
  @js.native
  trait CloudFormationCustomResourceUpdateEvent
    extends CloudFormationCustomResourceEventCommon
       with CloudFormationCustomResourceEvent {
    
    var OldResourceProperties: StringDictionary[js.Any] = js.native
    
    var PhysicalResourceId: String = js.native
    
    var RequestType: Update = js.native
  }
  object CloudFormationCustomResourceUpdateEvent {
    
    @scala.inline
    def apply(
      LogicalResourceId: String,
      OldResourceProperties: StringDictionary[js.Any],
      PhysicalResourceId: String,
      RequestId: String,
      RequestType: Update,
      ResourceProperties: DictKey,
      ResourceType: String,
      ResponseURL: String,
      ServiceToken: String,
      StackId: String
    ): CloudFormationCustomResourceUpdateEvent = {
      val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
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
