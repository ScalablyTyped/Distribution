package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressResult extends StObject {
  
  /**
    * The address that you want the Snow device(s) associated with a specific job to be shipped to.
    */
  var Address: js.UndefOr[typings.awsSdk.clientsSnowballMod.Address] = js.undefined
}
object DescribeAddressResult {
  
  inline def apply(): DescribeAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAddressResult] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
