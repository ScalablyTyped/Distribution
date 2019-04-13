package typings
package awsDashSdkLib.clientsMarketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceCommerceAnalytics
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MarketplaceCommerceAnalytics: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Given a data set type and data set publication date, asynchronously publishes the requested data set to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
    */
  def generateDataSet(): awsDashSdkLib.libRequestMod.Request[GenerateDataSetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateDataSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GenerateDataSetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GenerateDataSetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a data set type and data set publication date, asynchronously publishes the requested data set to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
    */
  def generateDataSet(params: GenerateDataSetRequest): awsDashSdkLib.libRequestMod.Request[GenerateDataSetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateDataSet(
    params: GenerateDataSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GenerateDataSetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GenerateDataSetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a data set type and a from date, asynchronously publishes the requested customer support data to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
    */
  def startSupportDataExport(): awsDashSdkLib.libRequestMod.Request[StartSupportDataExportResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSupportDataExport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSupportDataExportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSupportDataExportResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a data set type and a from date, asynchronously publishes the requested customer support data to the specified S3 bucket and notifies the specified SNS topic once the data is available. Returns a unique request identifier that can be used to correlate requests with notifications from the SNS topic. Data sets will be published in comma-separated values (CSV) format with the file name {data_set_type}_YYYY-MM-DD'T'HH-mm-ss'Z'.csv. If a file with the same name already exists (e.g. if the same data set is requested twice), the original file will be overwritten by the new file. Requires a Role with an attached permissions policy providing Allow permissions for the following actions: s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish, iam:GetRolePolicy.
    */
  def startSupportDataExport(params: StartSupportDataExportRequest): awsDashSdkLib.libRequestMod.Request[StartSupportDataExportResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSupportDataExport(
    params: StartSupportDataExportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSupportDataExportResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSupportDataExportResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

