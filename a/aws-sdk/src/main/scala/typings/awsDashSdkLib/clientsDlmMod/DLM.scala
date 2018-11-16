package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DLM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DLM: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDlmMod.DLMNs.ClientConfiguration = js.native
  /**
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
     */
  def createLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
     */
  def createLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
     */
  def createLifecyclePolicy(params: awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
     */
  def createLifecyclePolicy(
    params: awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.CreateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     */
  def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     */
  def deleteLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     */
  def deleteLifecyclePolicy(params: awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
     */
  def deleteLifecyclePolicy(
    params: awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.DeleteLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
     */
  def getLifecyclePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
     */
  def getLifecyclePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
     */
  def getLifecyclePolicies(params: awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
     */
  def getLifecyclePolicies(
    params: awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information about the specified lifecycle policy.
     */
  def getLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information about the specified lifecycle policy.
     */
  def getLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information about the specified lifecycle policy.
     */
  def getLifecyclePolicy(params: awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets detailed information about the specified lifecycle policy.
     */
  def getLifecyclePolicy(
    params: awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.GetLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified lifecycle policy.
     */
  def updateLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified lifecycle policy.
     */
  def updateLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified lifecycle policy.
     */
  def updateLifecyclePolicy(params: awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified lifecycle policy.
     */
  def updateLifecyclePolicy(
    params: awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDlmMod.DLMNs.UpdateLifecyclePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

