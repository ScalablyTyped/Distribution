package typings.activexLibreoffice.com_.sun.star.ui.test

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XUIObject extends js.Object {
  val Children: SafeArray[String] = js.native
  val State: PropertyValues = js.native
  val Type: String = js.native
  def executeAction(action: String, propValues: PropertyValues): Unit = js.native
  def getChild(id: String): XUIObject = js.native
  def getChildren(): SafeArray[String] = js.native
  def getState(): PropertyValues = js.native
  def getType(): String = js.native
}

object XUIObject {
  @scala.inline
  def apply(
    Children: SafeArray[String],
    State: PropertyValues,
    Type: String,
    executeAction: (String, PropertyValues) => Unit,
    getChild: String => XUIObject,
    getChildren: () => SafeArray[String],
    getState: () => PropertyValues,
    getType: () => String
  ): XUIObject = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], executeAction = js.Any.fromFunction2(executeAction), getChild = js.Any.fromFunction1(getChild), getChildren = js.Any.fromFunction0(getChildren), getState = js.Any.fromFunction0(getState), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[XUIObject]
  }
  @scala.inline
  implicit class XUIObjectOps[Self <: XUIObject] (val x: Self) extends AnyVal {
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
    def setChildren(value: SafeArray[String]): Self = this.set("Children", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateVarargs(value: PropertyValue*): Self = this.set("State", js.Array(value :_*))
    @scala.inline
    def setState(value: PropertyValues): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecuteAction(value: (String, PropertyValues) => Unit): Self = this.set("executeAction", js.Any.fromFunction2(value))
    @scala.inline
    def setGetChild(value: String => XUIObject): Self = this.set("getChild", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildren(value: () => SafeArray[String]): Self = this.set("getChildren", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => PropertyValues): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
  }
  
}

