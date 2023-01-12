package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The rule for copying shared snapshots across Regions.
    */
  var CrossRegionCopy: CrossRegionCopyActionList
  
  /**
    * A descriptive name for the action.
    */
  var Name: ActionName
}
object Action {
  
  inline def apply(CrossRegionCopy: CrossRegionCopyActionList, Name: ActionName): Action = {
    val __obj = js.Dynamic.literal(CrossRegionCopy = CrossRegionCopy.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setCrossRegionCopy(value: CrossRegionCopyActionList): Self = StObject.set(x, "CrossRegionCopy", value.asInstanceOf[js.Any])
    
    inline def setCrossRegionCopyVarargs(value: CrossRegionCopyAction*): Self = StObject.set(x, "CrossRegionCopy", js.Array(value*))
    
    inline def setName(value: ActionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
