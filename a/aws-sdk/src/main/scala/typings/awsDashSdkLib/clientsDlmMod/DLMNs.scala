package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dlm", "DLM")
@js.native
object DLMNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateLifecyclePolicyRequest extends js.Object {
    /**
      * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
      */
    var Description: PolicyDescription
    /**
      * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
      */
    var ExecutionRoleArn: awsDashSdkLib.clientsDlmMod.DLMNs.ExecutionRoleArn
    /**
      * The configuration details of the lifecycle policy. Target tags cannot be re-used across lifecycle policies.
      */
    var PolicyDetails: awsDashSdkLib.clientsDlmMod.DLMNs.PolicyDetails
    /**
      * The desired activation state of the lifecycle policy after creation.
      */
    var State: SettablePolicyStateValues
  }
  
  trait CreateLifecyclePolicyResponse extends js.Object {
    /**
      * The identifier of the lifecycle policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
  }
  
  trait CreateRule extends js.Object {
    /**
      * The interval. The supported values are 12 and 24.
      */
    var Interval: awsDashSdkLib.clientsDlmMod.DLMNs.Interval
    /**
      * The interval unit.
      */
    var IntervalUnit: IntervalUnitValues
    /**
      * The time, in UTC, to start the operation. The operation occurs within a one-hour window following the specified time.
      */
    var Times: js.UndefOr[TimesList] = js.undefined
  }
  
  trait DeleteLifecyclePolicyRequest extends js.Object {
    /**
      * The identifier of the lifecycle policy.
      */
    var PolicyId: awsDashSdkLib.clientsDlmMod.DLMNs.PolicyId
  }
  
  trait DeleteLifecyclePolicyResponse extends js.Object
  
  trait GetLifecyclePoliciesRequest extends js.Object {
    /**
      * The identifiers of the data lifecycle policies.
      */
    var PolicyIds: js.UndefOr[PolicyIdList] = js.undefined
    /**
      * The resource type.
      */
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined
    /**
      * The activation state.
      */
    var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
    /**
      * The tags to add to objects created by the policy. Tags are strings in the format key=value. These user-defined tags are added in addition to the AWS-added lifecycle tags.
      */
    var TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.undefined
    /**
      * The target tag for a policy. Tags are strings in the format key=value.
      */
    var TargetTags: js.UndefOr[TargetTagsFilterList] = js.undefined
  }
  
  trait GetLifecyclePoliciesResponse extends js.Object {
    /**
      * Summary information about the lifecycle policies.
      */
    var Policies: js.UndefOr[LifecyclePolicySummaryList] = js.undefined
  }
  
  trait GetLifecyclePolicyRequest extends js.Object {
    /**
      * The identifier of the lifecycle policy.
      */
    var PolicyId: awsDashSdkLib.clientsDlmMod.DLMNs.PolicyId
  }
  
  trait GetLifecyclePolicyResponse extends js.Object {
    /**
      * Detailed information about the lifecycle policy.
      */
    var Policy: js.UndefOr[LifecyclePolicy] = js.undefined
  }
  
  trait LifecyclePolicy extends js.Object {
    /**
      * The local date and time when the lifecycle policy was created.
      */
    var DateCreated: js.UndefOr[Timestamp] = js.undefined
    /**
      * The local date and time when the lifecycle policy was last modified.
      */
    var DateModified: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description of the lifecycle policy.
      */
    var Description: js.UndefOr[PolicyDescription] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
      */
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined
    /**
      * The configuration of the lifecycle policy
      */
    var PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined
    /**
      * The identifier of the lifecycle policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
    /**
      * The activation state of the lifecycle policy.
      */
    var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
  }
  
  trait LifecyclePolicySummary extends js.Object {
    /**
      * The description of the lifecycle policy.
      */
    var Description: js.UndefOr[PolicyDescription] = js.undefined
    /**
      * The identifier of the lifecycle policy.
      */
    var PolicyId: js.UndefOr[PolicyId] = js.undefined
    /**
      * The activation state of the lifecycle policy.
      */
    var State: js.UndefOr[GettablePolicyStateValues] = js.undefined
  }
  
  trait PolicyDetails extends js.Object {
    /**
      * The resource type.
      */
    var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined
    /**
      * The schedule of policy-defined actions.
      */
    var Schedules: js.UndefOr[ScheduleList] = js.undefined
    /**
      * The single tag that identifies targeted resources for this policy.
      */
    var TargetTags: js.UndefOr[TargetTagList] = js.undefined
  }
  
  trait RetainRule extends js.Object {
    /**
      * The number of snapshots to keep for each volume, up to a maximum of 1000.
      */
    var Count: awsDashSdkLib.clientsDlmMod.DLMNs.Count
  }
  
  trait Schedule extends js.Object {
    var CopyTags: js.UndefOr[CopyTags] = js.undefined
    /**
      * The create rule.
      */
    var CreateRule: js.UndefOr[CreateRule] = js.undefined
    /**
      * The name of the schedule.
      */
    var Name: js.UndefOr[ScheduleName] = js.undefined
    /**
      * The retain rule.
      */
    var RetainRule: js.UndefOr[RetainRule] = js.undefined
    /**
      * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle tags.
      */
    var TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The tag key.
      */
    var Key: String
    /**
      * The tag value.
      */
    var Value: String
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
      */
    def createLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[CreateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
      */
    def createLifecyclePolicy(params: CreateLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[CreateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLifecyclePolicy(
      params: CreateLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
      */
    def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
      */
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLifecyclePolicy(
      params: DeleteLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
      */
    def getLifecyclePolicies(): awsDashSdkLib.libRequestMod.Request[GetLifecyclePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
      */
    def getLifecyclePolicies(params: GetLifecyclePoliciesRequest): awsDashSdkLib.libRequestMod.Request[GetLifecyclePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicies(
      params: GetLifecyclePoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets detailed information about the specified lifecycle policy.
      */
    def getLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets detailed information about the specified lifecycle policy.
      */
    def getLifecyclePolicy(params: GetLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getLifecyclePolicy(
      params: GetLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified lifecycle policy.
      */
    def updateLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[UpdateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified lifecycle policy.
      */
    def updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[UpdateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateLifecyclePolicy(
      params: UpdateLifecyclePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateLifecyclePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateLifecyclePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateLifecyclePolicyRequest extends js.Object {
    /**
      * A description of the lifecycle policy.
      */
    var Description: js.UndefOr[PolicyDescription] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
      */
    var ExecutionRoleArn: js.UndefOr[ExecutionRoleArn] = js.undefined
    /**
      * The configuration of the lifecycle policy. Target tags cannot be re-used across policies.
      */
    var PolicyDetails: js.UndefOr[PolicyDetails] = js.undefined
    /**
      * The identifier of the lifecycle policy.
      */
    var PolicyId: awsDashSdkLib.clientsDlmMod.DLMNs.PolicyId
    /**
      * The desired activation state of the lifecycle policy after creation.
      */
    var State: js.UndefOr[SettablePolicyStateValues] = js.undefined
  }
  
  trait UpdateLifecyclePolicyResponse extends js.Object
  
  trait _GettablePolicyStateValues extends js.Object
  
  trait _SettablePolicyStateValues extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CopyTags = scala.Boolean
  type Count = scala.Double
  type ExecutionRoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type GettablePolicyStateValues = _GettablePolicyStateValues | java.lang.String
  type Interval = scala.Double
  type IntervalUnitValues = awsDashSdkLib.awsDashSdkLibStrings.HOURS | java.lang.String
  type LifecyclePolicySummaryList = js.Array[LifecyclePolicySummary]
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyIdList = js.Array[PolicyId]
  type ResourceTypeValues = awsDashSdkLib.awsDashSdkLibStrings.VOLUME | java.lang.String
  type ResourceTypeValuesList = js.Array[ResourceTypeValues]
  type ScheduleList = js.Array[Schedule]
  type ScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type SettablePolicyStateValues = _SettablePolicyStateValues | java.lang.String
  type String = java.lang.String
  type TagFilter = java.lang.String
  type TagsToAddFilterList = js.Array[TagFilter]
  type TagsToAddList = js.Array[Tag]
  type TargetTagList = js.Array[Tag]
  type TargetTagsFilterList = js.Array[TagFilter]
  type Time = java.lang.String
  type TimesList = js.Array[Time]
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-01-12`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

