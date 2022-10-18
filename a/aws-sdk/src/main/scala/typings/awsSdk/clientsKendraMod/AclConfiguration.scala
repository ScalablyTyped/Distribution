package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclConfiguration extends StObject {
  
  /**
    * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is only returned to users that are in one of the groups specified in the UserContext field of the Query API.
    */
  var AllowedGroupsColumnName: ColumnName
}
object AclConfiguration {
  
  inline def apply(AllowedGroupsColumnName: ColumnName): AclConfiguration = {
    val __obj = js.Dynamic.literal(AllowedGroupsColumnName = AllowedGroupsColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclConfiguration]
  }
  
  extension [Self <: AclConfiguration](x: Self) {
    
    inline def setAllowedGroupsColumnName(value: ColumnName): Self = StObject.set(x, "AllowedGroupsColumnName", value.asInstanceOf[js.Any])
  }
}
