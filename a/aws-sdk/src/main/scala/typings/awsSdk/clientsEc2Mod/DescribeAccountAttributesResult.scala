package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesResult extends StObject {
  
  /**
    * Information about the account attributes.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.undefined
}
object DescribeAccountAttributesResult {
  
  inline def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    
    inline def setAccountAttributes(value: AccountAttributeList): Self = StObject.set(x, "AccountAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccountAttributesUndefined: Self = StObject.set(x, "AccountAttributes", js.undefined)
    
    inline def setAccountAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "AccountAttributes", js.Array(value*))
  }
}
