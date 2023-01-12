package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuthorizerRequest extends StObject {
  
  /**
    * The name of the authorizer to describe.
    */
  var authorizerName: AuthorizerName
}
object DescribeAuthorizerRequest {
  
  inline def apply(authorizerName: AuthorizerName): DescribeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuthorizerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAuthorizerRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
  }
}
