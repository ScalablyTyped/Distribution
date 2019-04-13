package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cloud9
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Cloud9: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
    */
  def createEnvironmentEC2(): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEnvironmentEC2(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEnvironmentEC2Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
    */
  def createEnvironmentEC2(params: CreateEnvironmentEC2Request): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEnvironmentEC2(
    params: CreateEnvironmentEC2Request,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEnvironmentEC2Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentEC2Result, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an environment member to an AWS Cloud9 development environment.
    */
  def createEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEnvironmentMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an environment member to an AWS Cloud9 development environment.
    */
  def createEnvironmentMembership(params: CreateEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createEnvironmentMembership(
    params: CreateEnvironmentMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
    */
  def deleteEnvironment(): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an environment member from an AWS Cloud9 development environment.
    */
  def deleteEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEnvironmentMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an environment member from an AWS Cloud9 development environment.
    */
  def deleteEnvironmentMembership(params: DeleteEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEnvironmentMembership(
    params: DeleteEnvironmentMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about environment members for an AWS Cloud9 development environment.
    */
  def describeEnvironmentMemberships(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEnvironmentMemberships(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEnvironmentMembershipsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about environment members for an AWS Cloud9 development environment.
    */
  def describeEnvironmentMemberships(params: DescribeEnvironmentMembershipsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEnvironmentMemberships(
    params: DescribeEnvironmentMembershipsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEnvironmentMembershipsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentMembershipsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets status information for an AWS Cloud9 development environment.
    */
  def describeEnvironmentStatus(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEnvironmentStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEnvironmentStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets status information for an AWS Cloud9 development environment.
    */
  def describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEnvironmentStatus(
    params: DescribeEnvironmentStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEnvironmentStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about AWS Cloud9 development environments.
    */
  def describeEnvironments(): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about AWS Cloud9 development environments.
    */
  def describeEnvironments(params: DescribeEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEnvironments(
    params: DescribeEnvironmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of AWS Cloud9 development environment identifiers.
    */
  def listEnvironments(): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of AWS Cloud9 development environment identifiers.
    */
  def listEnvironments(params: ListEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEnvironmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the settings of an existing AWS Cloud9 development environment.
    */
  def updateEnvironment(): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the settings of an existing AWS Cloud9 development environment.
    */
  def updateEnvironment(params: UpdateEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
    */
  def updateEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEnvironmentMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
    */
  def updateEnvironmentMembership(params: UpdateEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateEnvironmentMembership(
    params: UpdateEnvironmentMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateEnvironmentMembershipResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

