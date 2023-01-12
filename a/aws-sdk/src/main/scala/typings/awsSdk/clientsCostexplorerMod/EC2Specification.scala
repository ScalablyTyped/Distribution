package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2Specification extends StObject {
  
  /**
    * Indicates whether you want a recommendation for standard or convertible reservations.
    */
  var OfferingClass: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.OfferingClass] = js.undefined
}
object EC2Specification {
  
  inline def apply(): EC2Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2Specification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EC2Specification] (val x: Self) extends AnyVal {
    
    inline def setOfferingClass(value: OfferingClass): Self = StObject.set(x, "OfferingClass", value.asInstanceOf[js.Any])
    
    inline def setOfferingClassUndefined: Self = StObject.set(x, "OfferingClass", js.undefined)
  }
}
