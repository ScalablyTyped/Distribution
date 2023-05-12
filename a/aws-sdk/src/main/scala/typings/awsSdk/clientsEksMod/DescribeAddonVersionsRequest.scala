package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddonVersionsRequest extends StObject {
  
  /**
    * The name of the add-on. The name must match one of the names returned by  ListAddons .
    */
  var addonName: js.UndefOr[String] = js.undefined
  
  /**
    * The Kubernetes versions that you can use the add-on with.
    */
  var kubernetesVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[DescribeAddonVersionsRequestMaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeAddonVersionsRequest where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the add-on. For valid owners, don't specify a value for this property.
    */
  var owners: js.UndefOr[StringList] = js.undefined
  
  /**
    * The publisher of the add-on. For valid publishers, don't specify a value for this property.
    */
  var publishers: js.UndefOr[StringList] = js.undefined
  
  /**
    * The type of the add-on. For valid types, don't specify a value for this property.
    */
  var types: js.UndefOr[StringList] = js.undefined
}
object DescribeAddonVersionsRequest {
  
  inline def apply(): DescribeAddonVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddonVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAddonVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonNameUndefined: Self = StObject.set(x, "addonName", js.undefined)
    
    inline def setKubernetesVersion(value: String): Self = StObject.set(x, "kubernetesVersion", value.asInstanceOf[js.Any])
    
    inline def setKubernetesVersionUndefined: Self = StObject.set(x, "kubernetesVersion", js.undefined)
    
    inline def setMaxResults(value: DescribeAddonVersionsRequestMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOwners(value: StringList): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: String*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setPublishers(value: StringList): Self = StObject.set(x, "publishers", value.asInstanceOf[js.Any])
    
    inline def setPublishersUndefined: Self = StObject.set(x, "publishers", js.undefined)
    
    inline def setPublishersVarargs(value: String*): Self = StObject.set(x, "publishers", js.Array(value*))
    
    inline def setTypes(value: StringList): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
