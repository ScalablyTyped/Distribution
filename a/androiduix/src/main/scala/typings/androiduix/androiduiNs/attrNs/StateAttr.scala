package typings.androiduix.androiduiNs.attrNs

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.StateAttr")
@js.native
class StateAttr protected () extends js.Object {
  def this(state: js.Array[Double]) = this()
  var attributes: js.Any = js.native
  var stateSpec: js.Any = js.native
  def createDiffKeyAsNullValueAttrMap(another: StateAttr): Map[String, String] = js.native
  def getAttrMap(): Map[String, String] = js.native
  def hasAttr(name: String): Boolean = js.native
  def isDefaultState(): Boolean = js.native
  def isStateEquals(state: js.Array[Double]): Boolean = js.native
  def isStateMatch(state: js.Array[Double]): Boolean = js.native
  def putAll(stateAttr: StateAttr): Unit = js.native
  def setAttr(name: String, value: String): Unit = js.native
}

