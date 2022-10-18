package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserResponse extends StObject {
  
  /**
    * Information about the user account and configuration settings.
    */
  var User: js.UndefOr[typings.awsSdk.clientsConnectMod.User] = js.undefined
}
object DescribeUserResponse {
  
  inline def apply(): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  extension [Self <: DescribeUserResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
