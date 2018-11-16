package typings
package androiduixLib.androiduiNs.attrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.StateAttrList")
@js.native
class StateAttrList protected () extends js.Object {
  def this(view: androiduixLib.androidNs.viewNs.View) = this()
  var mView: js.Any = js.native
  var matchedStateAttrList: js.Any = js.native
  var originStateAttrList: js.Any = js.native
  def addStatedAttr(attrName: java.lang.String, attrValue: java.lang.String): scala.Unit = js.native
  /* private */ def addStatedAttrImpl(attrName: js.Any, attrValue: js.Any, inParseState: js.Any): js.Any = js.native
  def getMatchedStateAttr(state: js.Array[scala.Double]): StateAttr = js.native
  /* private */ def getOrCreateStateAttr(state: js.Any): js.Any = js.native
  /* private */ def getStateAttr(state: js.Any): js.Any = js.native
  def removeAttrAllState(attrName: java.lang.String): scala.Unit = js.native
}

@JSGlobal("androidui.attr.StateAttrList")
@js.native
object StateAttrList extends js.Object {
  def getViewStateValue(attrName: java.lang.String): scala.Double = js.native
}

