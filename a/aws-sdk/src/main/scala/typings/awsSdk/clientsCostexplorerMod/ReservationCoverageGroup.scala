package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationCoverageGroup extends StObject {
  
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Attributes] = js.undefined
  
  /**
    * How much instance usage this group of reservations covered.
    */
  var Coverage: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Coverage] = js.undefined
}
object ReservationCoverageGroup {
  
  inline def apply(): ReservationCoverageGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationCoverageGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservationCoverageGroup] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setCoverage(value: Coverage): Self = StObject.set(x, "Coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "Coverage", js.undefined)
  }
}
