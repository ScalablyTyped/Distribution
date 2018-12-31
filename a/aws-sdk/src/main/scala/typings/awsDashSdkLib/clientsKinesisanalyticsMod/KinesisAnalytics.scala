package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisAnalytics
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_KinesisAnalytics: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ClientConfiguration = js.native
  /**
    * Adds a CloudWatch log stream to monitor application configuration errors. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
    */
  def addApplicationCloudWatchLoggingOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationCloudWatchLoggingOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a CloudWatch log stream to monitor application configuration errors. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
    */
  def addApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Adds a streaming source to your Amazon Kinesis application. For conceptual information, see Configuring Application Input.  You can add a streaming source either when you create an application or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.  This operation requires permissions to perform the kinesisanalytics:AddApplicationInput action.
    */
  def addApplicationInput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Adds a streaming source to your Amazon Kinesis application. For conceptual information, see Configuring Application Input.  You can add a streaming source either when you create an application or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.  This operation requires permissions to perform the kinesisanalytics:AddApplicationInput action.
    */
  def addApplicationInput(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInput(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an InputProcessingConfiguration to an application. An input processor preprocesses records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
    */
  def addApplicationInputProcessingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInputProcessingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an InputProcessingConfiguration to an application. An input processor preprocesses records on the input stream before the application's SQL code executes. Currently, the only input processor available is AWS Lambda.
    */
  def addApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an external destination to your Amazon Kinesis Analytics application. If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors. For more information, see Understanding Application Output (Destination).   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. For the limits on the number of application inputs and outputs you can configure, see Limits. This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action.
    */
  def addApplicationOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an external destination to your Amazon Kinesis Analytics application. If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors. For more information, see Understanding Application Output (Destination).   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. For the limits on the number of application inputs and outputs you can configure, see Limits. This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action.
    */
  def addApplicationOutput(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationOutput(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a reference data source to an existing application. Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object maps to columns in the resulting in-application table.  For conceptual information, see Configuring Application Input. For the limits on data sources you can add to your application, see Limits.   This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action. 
    */
  def addApplicationReferenceDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationReferenceDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a reference data source to an existing application. Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object maps to columns in the resulting in-application table.  For conceptual information, see Configuring Application Input. For the limits on data sources you can add to your application, see Limits.   This operation requires permissions to perform the kinesisanalytics:AddApplicationOutput action. 
    */
  def addApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.AddApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as input, application code to process the input, and up to three destinations where you want Amazon Kinesis Analytics to write the output data from your application. For an overview, see How it Works.  In the input configuration, you map the streaming source to an in-application stream, which you can think of as a constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each data column in the in-application stream to a data element in the streaming source. Your application code is one or more SQL statements that read input data, transform it, and generate output. Your application code can create one or more SQL artifacts like SQL streams or pumps. In the output configuration, you can configure the application to write data from in-application streams created in your applications to up to three destinations.  To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform the kinesisanalytics:CreateApplication action.   For introductory exercises to create an Amazon Kinesis Analytics application, see Getting Started. 
    */
  def createApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as input, application code to process the input, and up to three destinations where you want Amazon Kinesis Analytics to write the output data from your application. For an overview, see How it Works.  In the input configuration, you map the streaming source to an in-application stream, which you can think of as a constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each data column in the in-application stream to a data element in the streaming source. Your application code is one or more SQL statements that read input data, transform it, and generate output. Your application code can create one or more SQL artifacts like SQL streams or pumps. In the output configuration, you can configure the application to write data from in-application streams created in your applications to up to three destinations.  To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform the kinesisanalytics:CreateApplication action.   For introductory exercises to create an Amazon Kinesis Analytics application, see Getting Started. 
    */
  def createApplication(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.CreateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the application, including any application artifacts (such as in-application streams, reference table, and application code). This operation requires permissions to perform the kinesisanalytics:DeleteApplication action.
    */
  def deleteApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the application, including any application artifacts (such as in-application streams, reference table, and application code). This operation requires permissions to perform the kinesisanalytics:DeleteApplication action.
    */
  def deleteApplication(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
    */
  def deleteApplicationCloudWatchLoggingOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationCloudWatchLoggingOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with Amazon Kinesis Analytics applications, see Working with Amazon CloudWatch Logs.
    */
  def deleteApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationCloudWatchLoggingOption(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationCloudWatchLoggingOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an InputProcessingConfiguration from an input.
    */
  def deleteApplicationInputProcessingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationInputProcessingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an InputProcessingConfiguration from an input.
    */
  def deleteApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationInputProcessingConfiguration(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationInputProcessingConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no longer write data from the corresponding in-application stream to the external output destination. This operation requires permissions to perform the kinesisanalytics:DeleteApplicationOutput action.
    */
  def deleteApplicationOutput(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationOutput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no longer write data from the corresponding in-application stream to the external output destination. This operation requires permissions to perform the kinesisanalytics:DeleteApplicationOutput action.
    */
  def deleteApplicationOutput(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationOutput(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationOutputResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a reference data source configuration from the specified application configuration. If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation.  This operation requires permissions to perform the kinesisanalytics.DeleteApplicationReferenceDataSource action.
    */
  def deleteApplicationReferenceDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationReferenceDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a reference data source configuration from the specified application configuration. If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation.  This operation requires permissions to perform the kinesisanalytics.DeleteApplicationReferenceDataSource action.
    */
  def deleteApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteApplicationReferenceDataSource(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DeleteApplicationReferenceDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific Amazon Kinesis Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation. This operation requires permissions to perform the kinesisanalytics:DescribeApplication action. You can use DescribeApplication to get the current application versionId, which you need to call other operations such as Update. 
    */
  def describeApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific Amazon Kinesis Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation. This operation requires permissions to perform the kinesisanalytics:DescribeApplication action. You can use DescribeApplication to get the current application versionId, which you need to call other operations such as Update. 
    */
  def describeApplication(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DescribeApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. For conceptual information, see Configuring Application Input. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses this operation to infer a schema and show it in the console user interface.   This operation requires permissions to perform the kinesisanalytics:DiscoverInputSchema action. 
    */
  def discoverInputSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def discoverInputSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. For conceptual information, see Configuring Application Input. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses this operation to infer a schema and show it in the console user interface.   This operation requires permissions to perform the kinesisanalytics:DiscoverInputSchema action. 
    */
  def discoverInputSchema(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def discoverInputSchema(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.DiscoverInputSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status. If the response returns the HasMoreApplications value as true, you can send another request by adding the ExclusiveStartApplicationName in the request body, and set the value of this to the last application name from the previous response.  If you want detailed information about a specific application, use DescribeApplication. This operation requires permissions to perform the kinesisanalytics:ListApplications action.
    */
  def listApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status. If the response returns the HasMoreApplications value as true, you can send another request by adding the ExclusiveStartApplicationName in the request body, and set the value of this to the last application name from the previous response.  If you want detailed information about a specific application, use DescribeApplication. This operation requires permissions to perform the kinesisanalytics:ListApplications action.
    */
  def listApplications(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listApplications(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.ListApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively call this operation to start your application. After the application starts, it begins consuming the input data, processes it, and writes the output to the configured destination.  The application status must be READY for you to start an application. You can get the application status in the console or using the DescribeApplication operation. After you start the application, you can stop the application from processing the input by calling the StopApplication operation. This operation requires permissions to perform the kinesisanalytics:StartApplication action.
    */
  def startApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively call this operation to start your application. After the application starts, it begins consuming the input data, processes it, and writes the output to the configured destination.  The application status must be READY for you to start an application. You can get the application status in the console or using the DescribeApplication operation. After you start the application, you can stop the application from processing the input by calling the StopApplication operation. This operation requires permissions to perform the kinesisanalytics:StartApplication action.
    */
  def startApplication(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StartApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the application from processing input data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. After the application is stopped, Amazon Kinesis Analytics stops reading data from the input, the application stops processing data, and there is no output written to the destination.  This operation requires permissions to perform the kinesisanalytics:StopApplication action.
    */
  def stopApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the application from processing input data. You can stop an application only if it is in the running state. You can use the DescribeApplication operation to find the application state. After the application is stopped, Amazon Kinesis Analytics stops reading data from the input, the application stops processing data, and there is no output written to the destination.  This operation requires permissions to perform the kinesisanalytics:StopApplication action.
    */
  def stopApplication(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.StopApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input configuration, and output configuration.  Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each time you update your application.  This operation requires permission for the kinesisanalytics:UpdateApplication action.
    */
  def updateApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input configuration, and output configuration.  Note that Amazon Kinesis Analytics updates the CurrentApplicationVersionId each time you update your application.  This operation requires permission for the kinesisanalytics:UpdateApplication action.
    */
  def updateApplication(params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateApplication(
    params: awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKinesisanalyticsMod.KinesisAnalyticsNs.UpdateApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

