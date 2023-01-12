package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstablishedMultiRegionAccessPointPolicy extends StObject {
  
  /**
    * The details of the last established policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsS3controlMod.Policy] = js.undefined
}
object EstablishedMultiRegionAccessPointPolicy {
  
  inline def apply(): EstablishedMultiRegionAccessPointPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstablishedMultiRegionAccessPointPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EstablishedMultiRegionAccessPointPolicy] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
