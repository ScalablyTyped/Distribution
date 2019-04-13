package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DLM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DLM: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

