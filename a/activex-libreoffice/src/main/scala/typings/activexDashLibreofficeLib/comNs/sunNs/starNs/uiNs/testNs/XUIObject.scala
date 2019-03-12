package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIObject extends js.Object {
  val Children: stdLib.SafeArray[java.lang.String]
  val State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  val Type: java.lang.String
  def executeAction(
    action: java.lang.String,
    propValues: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Unit
  def getChild(id: java.lang.String): XUIObject
  def getChildren(): stdLib.SafeArray[java.lang.String]
  def getState(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  def getType(): java.lang.String
}

object XUIObject {
  @scala.inline
  def apply(
    Children: stdLib.SafeArray[java.lang.String],
    State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    Type: java.lang.String,
    executeAction: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => scala.Unit,
    getChild: java.lang.String => XUIObject,
    getChildren: () => stdLib.SafeArray[java.lang.String],
    getState: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    getType: () => java.lang.String
  ): XUIObject = {
    val __obj = js.Dynamic.literal(Children = Children, State = State.asInstanceOf[js.Any], Type = Type, executeAction = js.Any.fromFunction2(executeAction), getChild = js.Any.fromFunction1(getChild), getChildren = js.Any.fromFunction0(getChildren), getState = js.Any.fromFunction0(getState), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[XUIObject]
  }
}

