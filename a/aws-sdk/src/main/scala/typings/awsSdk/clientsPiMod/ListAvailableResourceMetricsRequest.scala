package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableResourceMetricsRequest extends StObject {
  
  /**
    * An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify its DbiResourceId value. For example, specify db-ABCDEFGHIJKLMNOPQRSTU1VWZ. 
    */
  var Identifier: RequestString
  
  /**
    * The maximum number of items to return. If the MaxRecords value is less than the number of existing items, the response includes a pagination token. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPiMod.MaxResults] = js.undefined
  
  /**
    * The types of metrics to return in the response. Valid values in the array include the following:    os (OS counter metrics) - All engines    db (DB load metrics) - All engines except for Amazon DocumentDB    db.sql.stats (per-SQL metrics) - All engines except for Amazon DocumentDB    db.sql_tokenized.stats (per-SQL digest metrics) - All engines except for Amazon DocumentDB  
    */
  var MetricTypes: MetricTypeList
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPiMod.NextToken] = js.undefined
  
  /**
    * The Amazon Web Services service for which Performance Insights returns metrics.
    */
  var ServiceType: typings.awsSdk.clientsPiMod.ServiceType
}
object ListAvailableResourceMetricsRequest {
  
  inline def apply(Identifier: RequestString, MetricTypes: MetricTypeList, ServiceType: ServiceType): ListAvailableResourceMetricsRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], MetricTypes = MetricTypes.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableResourceMetricsRequest]
  }
  
  extension [Self <: ListAvailableResourceMetricsRequest](x: Self) {
    
    inline def setIdentifier(value: RequestString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetricTypes(value: MetricTypeList): Self = StObject.set(x, "MetricTypes", value.asInstanceOf[js.Any])
    
    inline def setMetricTypesVarargs(value: RequestString*): Self = StObject.set(x, "MetricTypes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
  }
}
