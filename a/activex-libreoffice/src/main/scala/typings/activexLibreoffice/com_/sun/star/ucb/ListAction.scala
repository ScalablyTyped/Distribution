package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct contains information needed in the notifications of a {@link XDynamicResultSet} .
  * @see ListEvent
  */
@js.native
trait ListAction extends StObject {
  
  /**
    * depending on the content of {@link ListAction.ListActionType} the {@link ListAction.ActionInfo} could contain additional information about the changes
    * happened (see table above).
    */
  var ActionInfo: js.Any = js.native
  
  /** The count of involved rows. */
  var Count: Double = js.native
  
  /**
    * specifies the kind of modification happened to all assigned rows.
    *
    * The value of the other members of this struct depend on the value of this member:
    *
    * {{table here, see documentation}}
    */
  var ListActionType: Double = js.native
  
  /**
    * The position where something has happened (index begins with `1` as usual with JDBC ).
    *
    * Its value does not necessary indicate the new position in the new {@link com.sun.star.sdbc.XResultSet} , but a position while doing the changes step
    * by step beginning with the old {@link com.sun.star.sdbc.XResultSet} .
    */
  var Position: Double = js.native
}
object ListAction {
  
  @scala.inline
  def apply(ActionInfo: js.Any, Count: Double, ListActionType: Double, Position: Double): ListAction = {
    val __obj = js.Dynamic.literal(ActionInfo = ActionInfo.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ListActionType = ListActionType.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAction]
  }
  
  @scala.inline
  implicit class ListActionMutableBuilder[Self <: ListAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionInfo(value: js.Any): Self = StObject.set(x, "ActionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListActionType(value: Double): Self = StObject.set(x, "ListActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
