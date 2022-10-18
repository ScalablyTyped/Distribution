package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElasticsearchInstanceTypesRequest extends StObject {
  
  /**
    * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for list of available Elasticsearch instance types when modifying existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsEsMod.DomainName] = js.undefined
  
  /**
    * Version of Elasticsearch for which list of supported elasticsearch instance types are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString
  
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEsMod.MaxResults] = js.undefined
  
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
}
object ListElasticsearchInstanceTypesRequest {
  
  inline def apply(ElasticsearchVersion: ElasticsearchVersionString): ListElasticsearchInstanceTypesRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElasticsearchInstanceTypesRequest]
  }
  
  extension [Self <: ListElasticsearchInstanceTypesRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setElasticsearchVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
