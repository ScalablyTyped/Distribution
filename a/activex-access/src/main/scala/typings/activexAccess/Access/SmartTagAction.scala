package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagAction extends js.Object {
  @JSName("Access.SmartTagAction_typekey")
  var AccessDotSmartTagAction_typekey: SmartTagAction
  val Application: typings.activexAccess.Access.Application
  val Name: String
  val Parent: js.Any
  def Execute(): Unit
  def IsMemberSafe(dispid: Double): Boolean
}

object SmartTagAction {
  @scala.inline
  def apply(
    AccessDotSmartTagAction_typekey: SmartTagAction,
    Application: Application,
    Execute: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagAction_typekey")(AccessDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
}

