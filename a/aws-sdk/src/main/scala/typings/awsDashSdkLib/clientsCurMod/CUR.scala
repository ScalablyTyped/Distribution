package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CUR
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CUR: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the specified report.
    */
  def deleteReportDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReportDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified report.
    */
  def deleteReportDefinition(params: DeleteReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReportDefinition(
    params: DeleteReportDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the AWS Cost and Usage reports available to this account.
    */
  def describeReportDefinitions(): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReportDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReportDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the AWS Cost and Usage reports available to this account.
    */
  def describeReportDefinitions(params: DescribeReportDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReportDefinitions(
    params: DescribeReportDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReportDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReportDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new report using the description that you provide.
    */
  def putReportDefinition(): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putReportDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new report using the description that you provide.
    */
  def putReportDefinition(params: PutReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putReportDefinition(
    params: PutReportDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutReportDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

