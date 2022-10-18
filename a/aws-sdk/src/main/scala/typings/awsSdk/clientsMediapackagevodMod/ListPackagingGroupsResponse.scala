package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagingGroupsResponse extends StObject {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of MediaPackage VOD PackagingGroup resources.
    */
  var PackagingGroups: js.UndefOr[listOfPackagingGroup] = js.undefined
}
object ListPackagingGroupsResponse {
  
  inline def apply(): ListPackagingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingGroupsResponse]
  }
  
  extension [Self <: ListPackagingGroupsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackagingGroups(value: listOfPackagingGroup): Self = StObject.set(x, "PackagingGroups", value.asInstanceOf[js.Any])
    
    inline def setPackagingGroupsUndefined: Self = StObject.set(x, "PackagingGroups", js.undefined)
    
    inline def setPackagingGroupsVarargs(value: PackagingGroup*): Self = StObject.set(x, "PackagingGroups", js.Array(value*))
  }
}
