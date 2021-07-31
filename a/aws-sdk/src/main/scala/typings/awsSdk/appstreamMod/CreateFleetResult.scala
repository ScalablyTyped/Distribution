package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetResult extends StObject {
  
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsSdk.appstreamMod.Fleet] = js.undefined
}
object CreateFleetResult {
  
  @scala.inline
  def apply(): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResult]
  }
  
  @scala.inline
  implicit class CreateFleetResultMutableBuilder[Self <: CreateFleetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: Fleet): Self = StObject.set(x, "Fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "Fleet", js.undefined)
  }
}
