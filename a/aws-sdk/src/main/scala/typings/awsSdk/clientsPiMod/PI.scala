package typings.awsSdk.clientsPiMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PI extends Service {
  
  @JSName("config")
  var config_PI: ConfigBase & ClientConfiguration = js.native
  
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.   Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first 500 bytes are returned. 
    */
  def describeDimensionKeys(): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  def describeDimensionKeys(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionKeysResponse, Unit]): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.   Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first 500 bytes are returned. 
    */
  def describeDimensionKeys(params: DescribeDimensionKeysRequest): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  def describeDimensionKeys(
    params: DescribeDimensionKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDimensionKeysResponse, Unit]
  ): Request[DescribeDimensionKeysResponse, AWSError] = js.native
  
  /**
    * Get the attributes of the specified dimension group for a DB instance or data source. For example, if you specify a SQL ID, GetDimensionKeyDetails retrieves the full text of the dimension db.sql.statement associated with this ID. This operation is useful because GetResourceMetrics and DescribeDimensionKeys don't support retrieval of large SQL statement text.
    */
  def getDimensionKeyDetails(): Request[GetDimensionKeyDetailsResponse, AWSError] = js.native
  def getDimensionKeyDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetDimensionKeyDetailsResponse, Unit]): Request[GetDimensionKeyDetailsResponse, AWSError] = js.native
  /**
    * Get the attributes of the specified dimension group for a DB instance or data source. For example, if you specify a SQL ID, GetDimensionKeyDetails retrieves the full text of the dimension db.sql.statement associated with this ID. This operation is useful because GetResourceMetrics and DescribeDimensionKeys don't support retrieval of large SQL statement text.
    */
  def getDimensionKeyDetails(params: GetDimensionKeyDetailsRequest): Request[GetDimensionKeyDetailsResponse, AWSError] = js.native
  def getDimensionKeyDetails(
    params: GetDimensionKeyDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDimensionKeyDetailsResponse, Unit]
  ): Request[GetDimensionKeyDetailsResponse, AWSError] = js.native
  
  /**
    * Retrieve the metadata for different features. For example, the metadata might indicate that a feature is turned on or off on a specific DB instance. 
    */
  def getResourceMetadata(): Request[GetResourceMetadataResponse, AWSError] = js.native
  def getResourceMetadata(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetadataResponse, Unit]): Request[GetResourceMetadataResponse, AWSError] = js.native
  /**
    * Retrieve the metadata for different features. For example, the metadata might indicate that a feature is turned on or off on a specific DB instance. 
    */
  def getResourceMetadata(params: GetResourceMetadataRequest): Request[GetResourceMetadataResponse, AWSError] = js.native
  def getResourceMetadata(
    params: GetResourceMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetadataResponse, Unit]
  ): Request[GetResourceMetadataResponse, AWSError] = js.native
  
  /**
    * Retrieve Performance Insights metrics for a set of data sources over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.  Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first 500 bytes are returned. 
    */
  def getResourceMetrics(): Request[GetResourceMetricsResponse, AWSError] = js.native
  def getResourceMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetricsResponse, Unit]): Request[GetResourceMetricsResponse, AWSError] = js.native
  /**
    * Retrieve Performance Insights metrics for a set of data sources over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.  Each response element returns a maximum of 500 bytes. For larger elements, such as SQL statements, only the first 500 bytes are returned. 
    */
  def getResourceMetrics(params: GetResourceMetricsRequest): Request[GetResourceMetricsResponse, AWSError] = js.native
  def getResourceMetrics(
    params: GetResourceMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceMetricsResponse, Unit]
  ): Request[GetResourceMetricsResponse, AWSError] = js.native
  
  /**
    * Retrieve the dimensions that can be queried for each specified metric type on a specified DB instance.
    */
  def listAvailableResourceDimensions(): Request[ListAvailableResourceDimensionsResponse, AWSError] = js.native
  def listAvailableResourceDimensions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableResourceDimensionsResponse, Unit]
  ): Request[ListAvailableResourceDimensionsResponse, AWSError] = js.native
  /**
    * Retrieve the dimensions that can be queried for each specified metric type on a specified DB instance.
    */
  def listAvailableResourceDimensions(params: ListAvailableResourceDimensionsRequest): Request[ListAvailableResourceDimensionsResponse, AWSError] = js.native
  def listAvailableResourceDimensions(
    params: ListAvailableResourceDimensionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableResourceDimensionsResponse, Unit]
  ): Request[ListAvailableResourceDimensionsResponse, AWSError] = js.native
  
  /**
    * Retrieve metrics of the specified types that can be queried for a specified DB instance. 
    */
  def listAvailableResourceMetrics(): Request[ListAvailableResourceMetricsResponse, AWSError] = js.native
  def listAvailableResourceMetrics(callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableResourceMetricsResponse, Unit]): Request[ListAvailableResourceMetricsResponse, AWSError] = js.native
  /**
    * Retrieve metrics of the specified types that can be queried for a specified DB instance. 
    */
  def listAvailableResourceMetrics(params: ListAvailableResourceMetricsRequest): Request[ListAvailableResourceMetricsResponse, AWSError] = js.native
  def listAvailableResourceMetrics(
    params: ListAvailableResourceMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableResourceMetricsResponse, Unit]
  ): Request[ListAvailableResourceMetricsResponse, AWSError] = js.native
}
