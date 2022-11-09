package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceTypeLimitsRequest extends StObject {
  
  /**
    * The name of the domain. Only specify if you need the limits for an existing domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest version of OpenSearch.
    */
  var EngineVersion: VersionString
  
  /**
    * The OpenSearch Service instance type for which you need limit information.
    */
  var InstanceType: OpenSearchPartitionInstanceType
}
object DescribeInstanceTypeLimitsRequest {
  
  inline def apply(EngineVersion: VersionString, InstanceType: OpenSearchPartitionInstanceType): DescribeInstanceTypeLimitsRequest = {
    val __obj = js.Dynamic.literal(EngineVersion = EngineVersion.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceTypeLimitsRequest]
  }
  
  extension [Self <: DescribeInstanceTypeLimitsRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEngineVersion(value: VersionString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
  }
}
