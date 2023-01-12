package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuthorizerResponse extends StObject {
  
  /**
    * The authorizer description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
}
object DescribeAuthorizerResponse {
  
  inline def apply(): DescribeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuthorizerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAuthorizerResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerDescription(value: AuthorizerDescription): Self = StObject.set(x, "authorizerDescription", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerDescriptionUndefined: Self = StObject.set(x, "authorizerDescription", js.undefined)
  }
}
