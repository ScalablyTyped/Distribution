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
     * Delete a specified report definition
     */
  def deleteReportDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a specified report definition
     */
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
     * Delete a specified report definition
     */
  def deleteReportDefinition(params: awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DeleteReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a specified report definition
     */
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
     * Describe a list of report definitions owned by the account
     */
  def describeReportDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe a list of report definitions owned by the account
     */
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
     * Describe a list of report definitions owned by the account
     */
  def describeReportDefinitions(params: awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.DescribeReportDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe a list of report definitions owned by the account
     */
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
     * Create a new report definition
     */
  def putReportDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new report definition
     */
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
     * Create a new report definition
     */
  def putReportDefinition(params: awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCurMod.CURNs.PutReportDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new report definition
     */
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

