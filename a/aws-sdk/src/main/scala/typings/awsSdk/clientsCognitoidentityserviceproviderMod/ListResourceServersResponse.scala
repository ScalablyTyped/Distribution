package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceServersResponse extends StObject {
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  
  /**
    * The resource servers.
    */
  var ResourceServers: ResourceServersListType
}
object ListResourceServersResponse {
  
  inline def apply(ResourceServers: ResourceServersListType): ListResourceServersResponse = {
    val __obj = js.Dynamic.literal(ResourceServers = ResourceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceServersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceServersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceServers(value: ResourceServersListType): Self = StObject.set(x, "ResourceServers", value.asInstanceOf[js.Any])
    
    inline def setResourceServersVarargs(value: ResourceServerType*): Self = StObject.set(x, "ResourceServers", js.Array(value*))
  }
}
