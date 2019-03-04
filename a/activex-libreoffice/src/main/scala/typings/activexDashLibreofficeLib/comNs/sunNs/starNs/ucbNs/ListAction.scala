package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct contains information needed in the notifications of a {@link XDynamicResultSet} .
  * @see ListEvent
  */
trait ListAction extends js.Object {
  /**
    * depending on the content of {@link ListAction.ListActionType} the {@link ListAction.ActionInfo} could contain additional information about the changes
    * happened (see table above).
    */
  var ActionInfo: js.Any
  /** The count of involved rows. */
  var Count: scala.Double
  /**
    * specifies the kind of modification happened to all assigned rows.
    *
    * The value of the other members of this struct depend on the value of this member:
    *
    * {{table here, see documentation}}
    */
  var ListActionType: scala.Double
  /**
    * The position where something has happened (index begins with `1` as usual with JDBC ).
    *
    * Its value does not necessary indicate the new position in the new {@link com.sun.star.sdbc.XResultSet} , but a position while doing the changes step
    * by step beginning with the old {@link com.sun.star.sdbc.XResultSet} .
    */
  var Position: scala.Double
}

object ListAction {
  @scala.inline
  def apply(ActionInfo: js.Any, Count: scala.Double, ListActionType: scala.Double, Position: scala.Double): ListAction = {
    val __obj = js.Dynamic.literal(ActionInfo = ActionInfo, Count = Count, ListActionType = ListActionType, Position = Position)
  
    __obj.asInstanceOf[ListAction]
  }
}

