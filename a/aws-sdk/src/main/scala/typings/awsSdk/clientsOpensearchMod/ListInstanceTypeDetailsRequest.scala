package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceTypeDetailsRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    * The version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest version of OpenSearch.
    */
  var EngineVersion: VersionString
  
  /**
    * An optional parameter that lists information for a given instance type.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.undefined
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * If your initial ListInstanceTypeDetails operation returns a nextToken, you can include the returned nextToken in subsequent ListInstanceTypeDetails operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
  
  /**
    * An optional parameter that specifies the Availability Zones for the domain.
    */
  var RetrieveAZs: js.UndefOr[Boolean] = js.undefined
}
object ListInstanceTypeDetailsRequest {
  
  inline def apply(EngineVersion: VersionString): ListInstanceTypeDetailsRequest = {
    val __obj = js.Dynamic.literal(EngineVersion = EngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceTypeDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstanceTypeDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEngineVersion(value: VersionString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: InstanceTypeString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRetrieveAZs(value: Boolean): Self = StObject.set(x, "RetrieveAZs", value.asInstanceOf[js.Any])
    
    inline def setRetrieveAZsUndefined: Self = StObject.set(x, "RetrieveAZs", js.undefined)
  }
}
