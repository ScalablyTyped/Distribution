package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceTypeDetailsRequest extends StObject {
  
  /**
    * Name of the domain to list instance type details for.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    * Version of OpenSearch or Elasticsearch, in the format Elasticsearch_X.Y or OpenSearch_X.Y. Defaults to the latest version of OpenSearch.
    */
  var EngineVersion: VersionString
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * If your initial ListInstanceTypeDetails operation returns a nextToken, you can include the returned nextToken in subsequent ListInstanceTypeDetails operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object ListInstanceTypeDetailsRequest {
  
  inline def apply(EngineVersion: VersionString): ListInstanceTypeDetailsRequest = {
    val __obj = js.Dynamic.literal(EngineVersion = EngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceTypeDetailsRequest]
  }
  
  extension [Self <: ListInstanceTypeDetailsRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEngineVersion(value: VersionString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
