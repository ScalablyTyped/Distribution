package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CUR
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CUR: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCurMod.CURNs.ClientConfiguration = js.native
  /**
    * Deletes the specified report.
    */
  def deleteReportDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReportDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified report.
    */
  def deleteReportDefinition(params: awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReportDefinition(
    params: awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the AWS Cost and Usage reports available to this account.
    */
  def describeReportDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReportDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the AWS Cost and Usage reports available to this account.
    */
  def describeReportDefinitions(params: awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReportDefinitions(
    params: awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new report using the description that you provide.
    */
  def putReportDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putReportDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new report using the description that you provide.
    */
  def putReportDefinition(params: awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putReportDefinition(
    params: awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

