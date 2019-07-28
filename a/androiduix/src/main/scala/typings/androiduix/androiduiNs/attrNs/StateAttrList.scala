package typings.androiduix.androiduiNs.attrNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.attr.StateAttrList")
@js.native
class StateAttrList protected () extends js.Object {
  def this(view: View) = this()
  var mView: js.Any = js.native
  var matchedStateAttrList: js.Any = js.native
  var originStateAttrList: js.Any = js.native
  def addStatedAttr(attrName: String, attrValue: String): Unit = js.native
  /* private */ def addStatedAttrImpl(attrName: js.Any, attrValue: js.Any, inParseState: js.Any): js.Any = js.native
  def getMatchedStateAttr(state: js.Array[Double]): StateAttr = js.native
  /* private */ def getOrCreateStateAttr(state: js.Any): js.Any = js.native
  /* private */ def getStateAttr(state: js.Any): js.Any = js.native
  def removeAttrAllState(attrName: String): Unit = js.native
}

/* static members */
@JSGlobal("androidui.attr.StateAttrList")
@js.native
object StateAttrList extends js.Object {
  def getViewStateValue(attrName: String): Double = js.native
}

