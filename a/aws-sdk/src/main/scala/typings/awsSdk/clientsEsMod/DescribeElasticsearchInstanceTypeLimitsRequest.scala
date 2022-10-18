package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchInstanceTypeLimitsRequest extends StObject {
  
  /**
    *  DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for Elasticsearch  Limits  for existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsEsMod.DomainName] = js.undefined
  
  /**
    *  Version of Elasticsearch for which  Limits  are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString
  
  /**
    *  The instance type for an Elasticsearch cluster for which Elasticsearch  Limits  are needed. 
    */
  var InstanceType: ESPartitionInstanceType
}
object DescribeElasticsearchInstanceTypeLimitsRequest {
  
  inline def apply(ElasticsearchVersion: ElasticsearchVersionString, InstanceType: ESPartitionInstanceType): DescribeElasticsearchInstanceTypeLimitsRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
  }
  
  extension [Self <: DescribeElasticsearchInstanceTypeLimitsRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setElasticsearchVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: ESPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
  }
}
