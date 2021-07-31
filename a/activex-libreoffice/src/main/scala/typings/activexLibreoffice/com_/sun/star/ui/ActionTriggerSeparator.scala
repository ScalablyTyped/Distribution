package typings.activexLibreoffice.com_.sun.star.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a separator entry. Such entries are of interest for components rendering an {@link ActionTriggerContainer} . */
trait ActionTriggerSeparator extends StObject {
  
  /** determines the type of the separator using constants from {@link ActionTriggerSeparatorType} . */
  var SeparatorType: Double
}
object ActionTriggerSeparator {
  
  @scala.inline
  def apply(SeparatorType: Double): ActionTriggerSeparator = {
    val __obj = js.Dynamic.literal(SeparatorType = SeparatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTriggerSeparator]
  }
  
  @scala.inline
  implicit class ActionTriggerSeparatorMutableBuilder[Self <: ActionTriggerSeparator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeparatorType(value: Double): Self = StObject.set(x, "SeparatorType", value.asInstanceOf[js.Any])
  }
}
