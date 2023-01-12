package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserPoolResponse extends StObject {
  
  /**
    * The container of metadata returned by the server to describe the pool.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.undefined
}
object DescribeUserPoolResponse {
  
  inline def apply(): DescribeUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserPoolResponse] (val x: Self) extends AnyVal {
    
    inline def setUserPool(value: UserPoolType): Self = StObject.set(x, "UserPool", value.asInstanceOf[js.Any])
    
    inline def setUserPoolUndefined: Self = StObject.set(x, "UserPool", js.undefined)
  }
}
