package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceTypeLimitsRequest extends StObject {
  
  /**
    *  The name of the domain you want to modify. Only include this value if you're querying OpenSearch  Limits  for an existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    *  Version of OpenSearch for which  Limits  are needed. 
    */
  var EngineVersion: VersionString
  
  /**
    *  The instance type for an OpenSearch cluster for which OpenSearch  Limits  are needed. 
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
