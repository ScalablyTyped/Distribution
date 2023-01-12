package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlacementGroupResult extends StObject {
  
  /**
    * Information about the placement group.
    */
  var PlacementGroup: js.UndefOr[typings.awsSdk.clientsEc2Mod.PlacementGroup] = js.undefined
}
object CreatePlacementGroupResult {
  
  inline def apply(): CreatePlacementGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlacementGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePlacementGroupResult] (val x: Self) extends AnyVal {
    
    inline def setPlacementGroup(value: PlacementGroup): Self = StObject.set(x, "PlacementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "PlacementGroup", js.undefined)
  }
}
