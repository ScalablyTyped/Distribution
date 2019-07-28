package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.testNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIObject extends js.Object {
  val Children: SafeArray[String]
  val State: PropertyValues
  val Type: String
  def executeAction(action: String, propValues: PropertyValues): Unit
  def getChild(id: String): XUIObject
  def getChildren(): SafeArray[String]
  def getState(): PropertyValues
  def getType(): String
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
    val __obj = js.Dynamic.literal(Children = Children, State = State.asInstanceOf[js.Any], Type = Type, executeAction = js.Any.fromFunction2(executeAction), getChild = js.Any.fromFunction1(getChild), getChildren = js.Any.fromFunction0(getChildren), getState = js.Any.fromFunction0(getState), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[XUIObject]
  }
}

