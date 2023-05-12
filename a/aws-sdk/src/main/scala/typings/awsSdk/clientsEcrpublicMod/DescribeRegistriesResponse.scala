package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegistriesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future DescribeRepositories request. If the results of a DescribeRepositories request exceed maxResults, you can use this value to retrieve the next page of results. If there are no more results, this value is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object that contains the details for a public registry.
    */
  var registries: RegistryList
}
object DescribeRegistriesResponse {
  
  inline def apply(registries: RegistryList): DescribeRegistriesResponse = {
    val __obj = js.Dynamic.literal(registries = registries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRegistriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegistries(value: RegistryList): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
    
    inline def setRegistriesVarargs(value: Registry*): Self = StObject.set(x, "registries", js.Array(value*))
  }
}
