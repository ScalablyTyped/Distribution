package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserPoolClientResponse extends StObject {
  
  /**
    * The user pool client from a server response to describe the user pool client.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
}
object DescribeUserPoolClientResponse {
  
  inline def apply(): DescribeUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolClientResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserPoolClientResponse] (val x: Self) extends AnyVal {
    
    inline def setUserPoolClient(value: UserPoolClientType): Self = StObject.set(x, "UserPoolClient", value.asInstanceOf[js.Any])
    
    inline def setUserPoolClientUndefined: Self = StObject.set(x, "UserPoolClient", js.undefined)
  }
}
