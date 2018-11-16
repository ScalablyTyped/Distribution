package typings
package androiduixLib.androiduiNs.attrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.StateAttr")
@js.native
class StateAttr protected () extends js.Object {
  def this(state: js.Array[scala.Double]) = this()
  var attributes: js.Any = js.native
  var stateSpec: js.Any = js.native
  def createDiffKeyAsNullValueAttrMap(another: StateAttr): stdLib.Map[java.lang.String, java.lang.String] = js.native
  def getAttrMap(): stdLib.Map[java.lang.String, java.lang.String] = js.native
  def hasAttr(name: java.lang.String): scala.Boolean = js.native
  def isDefaultState(): scala.Boolean = js.native
  def isStateEquals(state: js.Array[scala.Double]): scala.Boolean = js.native
  def isStateMatch(state: js.Array[scala.Double]): scala.Boolean = js.native
  def putAll(stateAttr: StateAttr): scala.Unit = js.native
  def setAttr(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

