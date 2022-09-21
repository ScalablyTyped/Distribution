package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct contains information needed in the notifications of a {@link XDynamicResultSet} .
  * @see ListEvent
  */
trait ListAction extends StObject {
  
  /**
    * depending on the content of {@link ListAction.ListActionType} the {@link ListAction.ActionInfo} could contain additional information about the changes
    * happened (see table above).
    */
  var ActionInfo: Any
  
  /** The count of involved rows. */
  var Count: Double
  
  /**
    * specifies the kind of modification happened to all assigned rows.
    *
    * The value of the other members of this struct depend on the value of this member:
    *
    * {{table here, see documentation}}
    */
  var ListActionType: Double
  
  /**
    * The position where something has happened (index begins with `1` as usual with JDBC ).
    *
    * Its value does not necessary indicate the new position in the new {@link com.sun.star.sdbc.XResultSet} , but a position while doing the changes step
    * by step beginning with the old {@link com.sun.star.sdbc.XResultSet} .
    */
  var Position: Double
}
object ListAction {
  
  inline def apply(ActionInfo: Any, Count: Double, ListActionType: Double, Position: Double): ListAction = {
    val __obj = js.Dynamic.literal(ActionInfo = ActionInfo.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ListActionType = ListActionType.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAction]
  }
  
  extension [Self <: ListAction](x: Self) {
    
    inline def setActionInfo(value: Any): Self = StObject.set(x, "ActionInfo", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setListActionType(value: Double): Self = StObject.set(x, "ListActionType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
