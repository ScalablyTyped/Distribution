package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetResult extends StObject {
  
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsSdk.appstreamMod.Fleet] = js.undefined
}
object UpdateFleetResult {
  
  @scala.inline
  def apply(): UpdateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetResult]
  }
  
  @scala.inline
  implicit class UpdateFleetResultMutableBuilder[Self <: UpdateFleetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: Fleet): Self = StObject.set(x, "Fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "Fleet", js.undefined)
  }
}
