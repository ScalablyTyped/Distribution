package typings.awsSdk.applicationcostprofilerMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCostProfiler extends Service {
  
  @JSName("config")
  var config_ApplicationCostProfiler: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the specified report definition in AWS Application Cost Profiler. This stops the report from being generated.
    */
  def deleteReportDefinition(): Request[DeleteReportDefinitionResult, AWSError] = js.native
  def deleteReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportDefinitionResult, Unit]): Request[DeleteReportDefinitionResult, AWSError] = js.native
  /**
    * Deletes the specified report definition in AWS Application Cost Profiler. This stops the report from being generated.
    */
  def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResult, AWSError] = js.native
  def deleteReportDefinition(
    params: DeleteReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReportDefinitionResult, Unit]
  ): Request[DeleteReportDefinitionResult, AWSError] = js.native
  
  /**
    * Retrieves the definition of a report already configured in AWS Application Cost Profiler.
    */
  def getReportDefinition(): Request[GetReportDefinitionResult, AWSError] = js.native
  def getReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ GetReportDefinitionResult, Unit]): Request[GetReportDefinitionResult, AWSError] = js.native
  /**
    * Retrieves the definition of a report already configured in AWS Application Cost Profiler.
    */
  def getReportDefinition(params: GetReportDefinitionRequest): Request[GetReportDefinitionResult, AWSError] = js.native
  def getReportDefinition(
    params: GetReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReportDefinitionResult, Unit]
  ): Request[GetReportDefinitionResult, AWSError] = js.native
  
  /**
    * Ingests application usage data from Amazon Simple Storage Service (Amazon S3). The data must already exist in the S3 location. As part of the action, AWS Application Cost Profiler copies the object from your S3 bucket to an S3 bucket owned by Amazon for processing asynchronously.
    */
  def importApplicationUsage(): Request[ImportApplicationUsageResult, AWSError] = js.native
  def importApplicationUsage(callback: js.Function2[/* err */ AWSError, /* data */ ImportApplicationUsageResult, Unit]): Request[ImportApplicationUsageResult, AWSError] = js.native
  /**
    * Ingests application usage data from Amazon Simple Storage Service (Amazon S3). The data must already exist in the S3 location. As part of the action, AWS Application Cost Profiler copies the object from your S3 bucket to an S3 bucket owned by Amazon for processing asynchronously.
    */
  def importApplicationUsage(params: ImportApplicationUsageRequest): Request[ImportApplicationUsageResult, AWSError] = js.native
  def importApplicationUsage(
    params: ImportApplicationUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportApplicationUsageResult, Unit]
  ): Request[ImportApplicationUsageResult, AWSError] = js.native
  
  /**
    * Retrieves a list of all reports and their configurations for your AWS account. The maximum number of reports is one.
    */
  def listReportDefinitions(): Request[ListReportDefinitionsResult, AWSError] = js.native
  def listReportDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListReportDefinitionsResult, Unit]): Request[ListReportDefinitionsResult, AWSError] = js.native
  /**
    * Retrieves a list of all reports and their configurations for your AWS account. The maximum number of reports is one.
    */
  def listReportDefinitions(params: ListReportDefinitionsRequest): Request[ListReportDefinitionsResult, AWSError] = js.native
  def listReportDefinitions(
    params: ListReportDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReportDefinitionsResult, Unit]
  ): Request[ListReportDefinitionsResult, AWSError] = js.native
  
  /**
    * Creates the report definition for a report in Application Cost Profiler.
    */
  def putReportDefinition(): Request[PutReportDefinitionResult, AWSError] = js.native
  def putReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ PutReportDefinitionResult, Unit]): Request[PutReportDefinitionResult, AWSError] = js.native
  /**
    * Creates the report definition for a report in Application Cost Profiler.
    */
  def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResult, AWSError] = js.native
  def putReportDefinition(
    params: PutReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutReportDefinitionResult, Unit]
  ): Request[PutReportDefinitionResult, AWSError] = js.native
  
  /**
    * Updates existing report in AWS Application Cost Profiler.
    */
  def updateReportDefinition(): Request[UpdateReportDefinitionResult, AWSError] = js.native
  def updateReportDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReportDefinitionResult, Unit]): Request[UpdateReportDefinitionResult, AWSError] = js.native
  /**
    * Updates existing report in AWS Application Cost Profiler.
    */
  def updateReportDefinition(params: UpdateReportDefinitionRequest): Request[UpdateReportDefinitionResult, AWSError] = js.native
  def updateReportDefinition(
    params: UpdateReportDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReportDefinitionResult, Unit]
  ): Request[UpdateReportDefinitionResult, AWSError] = js.native
}
