package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cloud9
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Cloud9: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ClientConfiguration = js.native
  /**
    * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
    */
  def createEnvironmentEC2(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEnvironmentEC2(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
    */
  def createEnvironmentEC2(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Request): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEnvironmentEC2(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Request,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Result, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentEC2Result, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an environment member to an AWS Cloud9 development environment.
    */
  def createEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEnvironmentMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an environment member to an AWS Cloud9 development environment.
    */
  def createEnvironmentMembership(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEnvironmentMembership(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.CreateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
    */
  def deleteEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
    */
  def deleteEnvironment(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEnvironment(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an environment member from an AWS Cloud9 development environment.
    */
  def deleteEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEnvironmentMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an environment member from an AWS Cloud9 development environment.
    */
  def deleteEnvironmentMembership(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEnvironmentMembership(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DeleteEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about environment members for an AWS Cloud9 development environment.
    */
  def describeEnvironmentMemberships(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentMemberships(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about environment members for an AWS Cloud9 development environment.
    */
  def describeEnvironmentMemberships(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentMemberships(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentMembershipsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets status information for an AWS Cloud9 development environment.
    */
  def describeEnvironmentStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets status information for an AWS Cloud9 development environment.
    */
  def describeEnvironmentStatus(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironmentStatus(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about AWS Cloud9 development environments.
    */
  def describeEnvironments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about AWS Cloud9 development environments.
    */
  def describeEnvironments(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEnvironments(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.DescribeEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of AWS Cloud9 development environment identifiers.
    */
  def listEnvironments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of AWS Cloud9 development environment identifiers.
    */
  def listEnvironments(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEnvironments(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.ListEnvironmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the settings of an existing AWS Cloud9 development environment.
    */
  def updateEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the settings of an existing AWS Cloud9 development environment.
    */
  def updateEnvironment(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEnvironment(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
    */
  def updateEnvironmentMembership(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEnvironmentMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
    */
  def updateEnvironmentMembership(params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEnvironmentMembership(
    params: awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloud9Mod.Cloud9Ns.UpdateEnvironmentMembershipResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

