package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementResponse extends StObject {
  
  /**
    * The name of the placement group that the instance is in.
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.undefined
}
object PlacementResponse {
  
  inline def apply(): PlacementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacementResponse] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
