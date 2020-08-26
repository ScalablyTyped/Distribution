package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagAction extends js.Object {
  @JSName("Access.SmartTagAction_typekey")
  var AccessDotSmartTagAction_typekey: SmartTagAction = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  def Execute(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
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
  @scala.inline
  implicit class SmartTagActionOps[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessDotSmartTagAction_typekey(value: SmartTagAction): Self = this.set("Access.SmartTagAction_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("Execute", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

