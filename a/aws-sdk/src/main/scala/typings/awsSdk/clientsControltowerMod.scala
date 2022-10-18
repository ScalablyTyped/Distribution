package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsControltowerMod {
  
  @JSImport("aws-sdk/clients/controltower", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends ControlTower {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsControltowerMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type ControlIdentifier = java.lang.String
  
  trait ControlOperation extends StObject {
    
    /**
      * The time that the operation finished.
      */
    var endTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * One of ENABLE_CONTROL or DISABLE_CONTROL.
      */
    var operationType: js.UndefOr[ControlOperationType] = js.undefined
    
    /**
      * The time that the operation began.
      */
    var startTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * One of IN_PROGRESS, SUCEEDED, or FAILED.
      */
    var status: js.UndefOr[ControlOperationStatus] = js.undefined
    
    /**
      * If the operation result is FAILED, this string contains a message explaining why the operation failed.
      */
    var statusMessage: js.UndefOr[String] = js.undefined
  }
  object ControlOperation {
    
    inline def apply(): ControlOperation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlOperation]
    }
    
    extension [Self <: ControlOperation](x: Self) {
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setOperationType(value: ControlOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setStatus(value: ControlOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type ControlOperationStatus = _ControlOperationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLE_CONTROL
    - typings.awsSdk.awsSdkStrings.DISABLE_CONTROL
    - java.lang.String
  */
  type ControlOperationType = _ControlOperationType | java.lang.String
  
  @js.native
  trait ControlTower extends Service {
    
    @JSName("config")
    var config_ControlTower: ConfigBase & ClientConfiguration = js.native
    
    /**
      * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the specified organizational unit and the accounts it contains. The resources will vary according to the control that you specify.
      */
    def disableControl(): Request[DisableControlOutput, AWSError] = js.native
    def disableControl(callback: js.Function2[/* err */ AWSError, /* data */ DisableControlOutput, Unit]): Request[DisableControlOutput, AWSError] = js.native
    /**
      * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the specified organizational unit and the accounts it contains. The resources will vary according to the control that you specify.
      */
    def disableControl(params: DisableControlInput): Request[DisableControlOutput, AWSError] = js.native
    def disableControl(
      params: DisableControlInput,
      callback: js.Function2[/* err */ AWSError, /* data */ DisableControlOutput, Unit]
    ): Request[DisableControlOutput, AWSError] = js.native
    
    /**
      * This API call activates a control. It starts an asynchronous operation that creates AWS resources on the specified organizational unit and the accounts it contains. The resources created will vary according to the control that you specify.
      */
    def enableControl(): Request[EnableControlOutput, AWSError] = js.native
    def enableControl(callback: js.Function2[/* err */ AWSError, /* data */ EnableControlOutput, Unit]): Request[EnableControlOutput, AWSError] = js.native
    /**
      * This API call activates a control. It starts an asynchronous operation that creates AWS resources on the specified organizational unit and the accounts it contains. The resources created will vary according to the control that you specify.
      */
    def enableControl(params: EnableControlInput): Request[EnableControlOutput, AWSError] = js.native
    def enableControl(
      params: EnableControlInput,
      callback: js.Function2[/* err */ AWSError, /* data */ EnableControlOutput, Unit]
    ): Request[EnableControlOutput, AWSError] = js.native
    
    /**
      * Returns the status of a particular EnableControl or DisableControl operation. Displays a message in case of error. Details for an operation are available for 90 days.
      */
    def getControlOperation(): Request[GetControlOperationOutput, AWSError] = js.native
    def getControlOperation(callback: js.Function2[/* err */ AWSError, /* data */ GetControlOperationOutput, Unit]): Request[GetControlOperationOutput, AWSError] = js.native
    /**
      * Returns the status of a particular EnableControl or DisableControl operation. Displays a message in case of error. Details for an operation are available for 90 days.
      */
    def getControlOperation(params: GetControlOperationInput): Request[GetControlOperationOutput, AWSError] = js.native
    def getControlOperation(
      params: GetControlOperationInput,
      callback: js.Function2[/* err */ AWSError, /* data */ GetControlOperationOutput, Unit]
    ): Request[GetControlOperationOutput, AWSError] = js.native
    
    /**
      * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it contains.
      */
    def listEnabledControls(): Request[ListEnabledControlsOutput, AWSError] = js.native
    def listEnabledControls(callback: js.Function2[/* err */ AWSError, /* data */ ListEnabledControlsOutput, Unit]): Request[ListEnabledControlsOutput, AWSError] = js.native
    /**
      * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it contains.
      */
    def listEnabledControls(params: ListEnabledControlsInput): Request[ListEnabledControlsOutput, AWSError] = js.native
    def listEnabledControls(
      params: ListEnabledControlsInput,
      callback: js.Function2[/* err */ AWSError, /* data */ ListEnabledControlsOutput, Unit]
    ): Request[ListEnabledControlsOutput, AWSError] = js.native
  }
  
  trait DisableControlInput extends StObject {
    
    /**
      * The ARN of the control. Only Strongly recommended and Elective controls are permitted, with the exception of the Region deny guardrail.
      */
    var controlIdentifier: ControlIdentifier
    
    /**
      * The ARN of the organizational unit.
      */
    var targetIdentifier: TargetIdentifier
  }
  object DisableControlInput {
    
    inline def apply(controlIdentifier: ControlIdentifier, targetIdentifier: TargetIdentifier): DisableControlInput = {
      val __obj = js.Dynamic.literal(controlIdentifier = controlIdentifier.asInstanceOf[js.Any], targetIdentifier = targetIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableControlInput]
    }
    
    extension [Self <: DisableControlInput](x: Self) {
      
      inline def setControlIdentifier(value: ControlIdentifier): Self = StObject.set(x, "controlIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTargetIdentifier(value: TargetIdentifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisableControlOutput extends StObject {
    
    /**
      * The ID of the asynchronous operation, which is used to track status. The operation is available for 90 days.
      */
    var operationIdentifier: OperationIdentifier
  }
  object DisableControlOutput {
    
    inline def apply(operationIdentifier: OperationIdentifier): DisableControlOutput = {
      val __obj = js.Dynamic.literal(operationIdentifier = operationIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableControlOutput]
    }
    
    extension [Self <: DisableControlOutput](x: Self) {
      
      inline def setOperationIdentifier(value: OperationIdentifier): Self = StObject.set(x, "operationIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnableControlInput extends StObject {
    
    /**
      * The ARN of the control. Only Strongly recommended and Elective controls are permitted, with the exception of the Region deny guardrail.
      */
    var controlIdentifier: ControlIdentifier
    
    /**
      * The ARN of the organizational unit.
      */
    var targetIdentifier: TargetIdentifier
  }
  object EnableControlInput {
    
    inline def apply(controlIdentifier: ControlIdentifier, targetIdentifier: TargetIdentifier): EnableControlInput = {
      val __obj = js.Dynamic.literal(controlIdentifier = controlIdentifier.asInstanceOf[js.Any], targetIdentifier = targetIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableControlInput]
    }
    
    extension [Self <: EnableControlInput](x: Self) {
      
      inline def setControlIdentifier(value: ControlIdentifier): Self = StObject.set(x, "controlIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTargetIdentifier(value: TargetIdentifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnableControlOutput extends StObject {
    
    /**
      * The ID of the asynchronous operation, which is used to track status. The operation is available for 90 days.
      */
    var operationIdentifier: OperationIdentifier
  }
  object EnableControlOutput {
    
    inline def apply(operationIdentifier: OperationIdentifier): EnableControlOutput = {
      val __obj = js.Dynamic.literal(operationIdentifier = operationIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableControlOutput]
    }
    
    extension [Self <: EnableControlOutput](x: Self) {
      
      inline def setOperationIdentifier(value: OperationIdentifier): Self = StObject.set(x, "operationIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnabledControlSummary extends StObject {
    
    /**
      * The ARN of the control. Only Strongly recommended and Elective controls are permitted, with the exception of the Region deny guardrail.
      */
    var controlIdentifier: js.UndefOr[ControlIdentifier] = js.undefined
  }
  object EnabledControlSummary {
    
    inline def apply(): EnabledControlSummary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnabledControlSummary]
    }
    
    extension [Self <: EnabledControlSummary](x: Self) {
      
      inline def setControlIdentifier(value: ControlIdentifier): Self = StObject.set(x, "controlIdentifier", value.asInstanceOf[js.Any])
      
      inline def setControlIdentifierUndefined: Self = StObject.set(x, "controlIdentifier", js.undefined)
    }
  }
  
  type EnabledControls = js.Array[EnabledControlSummary]
  
  trait GetControlOperationInput extends StObject {
    
    /**
      * The ID of the asynchronous operation, which is used to track status. The operation is available for 90 days.
      */
    var operationIdentifier: OperationIdentifier
  }
  object GetControlOperationInput {
    
    inline def apply(operationIdentifier: OperationIdentifier): GetControlOperationInput = {
      val __obj = js.Dynamic.literal(operationIdentifier = operationIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetControlOperationInput]
    }
    
    extension [Self <: GetControlOperationInput](x: Self) {
      
      inline def setOperationIdentifier(value: OperationIdentifier): Self = StObject.set(x, "operationIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetControlOperationOutput extends StObject {
    
    /**
      * 
      */
    var controlOperation: ControlOperation
  }
  object GetControlOperationOutput {
    
    inline def apply(controlOperation: ControlOperation): GetControlOperationOutput = {
      val __obj = js.Dynamic.literal(controlOperation = controlOperation.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetControlOperationOutput]
    }
    
    extension [Self <: GetControlOperationOutput](x: Self) {
      
      inline def setControlOperation(value: ControlOperation): Self = StObject.set(x, "controlOperation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListEnabledControlsInput extends StObject {
    
    /**
      * How many results to return per API call.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    
    /**
      * The token to continue the list from a previous API call with the same parameters.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of the organizational unit.
      */
    var targetIdentifier: TargetIdentifier
  }
  object ListEnabledControlsInput {
    
    inline def apply(targetIdentifier: TargetIdentifier): ListEnabledControlsInput = {
      val __obj = js.Dynamic.literal(targetIdentifier = targetIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListEnabledControlsInput]
    }
    
    extension [Self <: ListEnabledControlsInput](x: Self) {
      
      inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setTargetIdentifier(value: TargetIdentifier): Self = StObject.set(x, "targetIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListEnabledControlsOutput extends StObject {
    
    /**
      * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it contains.
      */
    var enabledControls: EnabledControls
    
    /**
      * Retrieves the next page of results. If the string is empty, the current response is the end of the results.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object ListEnabledControlsOutput {
    
    inline def apply(enabledControls: EnabledControls): ListEnabledControlsOutput = {
      val __obj = js.Dynamic.literal(enabledControls = enabledControls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListEnabledControlsOutput]
    }
    
    extension [Self <: ListEnabledControlsOutput](x: Self) {
      
      inline def setEnabledControls(value: EnabledControls): Self = StObject.set(x, "enabledControls", value.asInstanceOf[js.Any])
      
      inline def setEnabledControlsVarargs(value: EnabledControlSummary*): Self = StObject.set(x, "enabledControls", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
  
  type MaxResults = Double
  
  type OperationIdentifier = java.lang.String
  
  type String = java.lang.String
  
  type SyntheticTimestampDateTime = js.Date
  
  type TargetIdentifier = java.lang.String
  
  trait _ControlOperationStatus extends StObject
  
  trait _ControlOperationType extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
