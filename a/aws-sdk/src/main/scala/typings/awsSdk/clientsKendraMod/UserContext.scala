package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserContext extends StObject {
  
  /**
    * The list of data source groups you want to filter search results based on groups' access to documents in that data source.
    */
  var DataSourceGroups: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceGroups] = js.undefined
  
  /**
    * The list of groups you want to filter search results based on the groups' access to documents.
    */
  var Groups: js.UndefOr[typings.awsSdk.clientsKendraMod.Groups] = js.undefined
  
  /**
    * The user context token for filtering search results for a user. It must be a JWT or a JSON token.
    */
  var Token: js.UndefOr[typings.awsSdk.clientsKendraMod.Token] = js.undefined
  
  /**
    * The identifier of the user you want to filter search results based on their access to documents.
    */
  var UserId: js.UndefOr[PrincipalName] = js.undefined
}
object UserContext {
  
  inline def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  
  extension [Self <: UserContext](x: Self) {
    
    inline def setDataSourceGroups(value: DataSourceGroups): Self = StObject.set(x, "DataSourceGroups", value.asInstanceOf[js.Any])
    
    inline def setDataSourceGroupsUndefined: Self = StObject.set(x, "DataSourceGroups", js.undefined)
    
    inline def setDataSourceGroupsVarargs(value: DataSourceGroup*): Self = StObject.set(x, "DataSourceGroups", js.Array(value*))
    
    inline def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: PrincipalName*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setToken(value: Token): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
    
    inline def setUserId(value: PrincipalName): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
