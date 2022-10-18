package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodesRequest extends StObject {
  
  /**
    * Search for nodes by category.
    */
  var Category: js.UndefOr[NodeCategory] = js.undefined
  
  /**
    * The maximum number of nodes to return in one page of results.
    */
  var MaxResults: js.UndefOr[MaxSize25] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Search for nodes by the account ID of the nodes' owner.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
  
  /**
    * Search for nodes by name.
    */
  var PackageName: js.UndefOr[NodePackageName] = js.undefined
  
  /**
    * Search for nodes by version.
    */
  var PackageVersion: js.UndefOr[NodePackageVersion] = js.undefined
  
  /**
    * Search for nodes by patch version.
    */
  var PatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
}
object ListNodesRequest {
  
  inline def apply(): ListNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodesRequest]
  }
  
  extension [Self <: ListNodesRequest](x: Self) {
    
    inline def setCategory(value: NodeCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setMaxResults(value: MaxSize25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersionUndefined: Self = StObject.set(x, "PatchVersion", js.undefined)
  }
}
