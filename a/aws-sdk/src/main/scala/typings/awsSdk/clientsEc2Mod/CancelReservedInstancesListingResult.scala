package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReservedInstancesListingResult extends StObject {
  
  /**
    * The Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined
}
object CancelReservedInstancesListingResult {
  
  inline def apply(): CancelReservedInstancesListingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelReservedInstancesListingResult]
  }
  
  extension [Self <: CancelReservedInstancesListingResult](x: Self) {
    
    inline def setReservedInstancesListings(value: ReservedInstancesListingList): Self = StObject.set(x, "ReservedInstancesListings", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesListingsUndefined: Self = StObject.set(x, "ReservedInstancesListings", js.undefined)
    
    inline def setReservedInstancesListingsVarargs(value: ReservedInstancesListing*): Self = StObject.set(x, "ReservedInstancesListings", js.Array(value*))
  }
}
