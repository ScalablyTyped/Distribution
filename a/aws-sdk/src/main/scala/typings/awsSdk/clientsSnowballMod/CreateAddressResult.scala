package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddressResult extends StObject {
  
  /**
    * The automatically generated ID for a specific address. You'll use this ID when you create a job to specify which address you want the Snow device for that job shipped to.
    */
  var AddressId: js.UndefOr[String] = js.undefined
}
object CreateAddressResult {
  
  inline def apply(): CreateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAddressResult] (val x: Self) extends AnyVal {
    
    inline def setAddressId(value: String): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
  }
}
