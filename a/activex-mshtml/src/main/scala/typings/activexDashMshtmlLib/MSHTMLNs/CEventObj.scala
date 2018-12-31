package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.CEventObj")
@js.native
class CEventObj protected () extends js.Object {
  var `MSHTML.CEventObj_typekey`: CEventObj = js.native
  val actionURL: java.lang.String = js.native
  var altKey: scala.Boolean = js.native
  var altLeft: scala.Boolean = js.native
  val behaviorCookie: scala.Double = js.native
  val behaviorPart: scala.Double = js.native
  @JSName("bookmarks")
  var bookmarks_Original: IHTMLBookmarkCollection = js.native
  @JSName("boundElements")
  var boundElements_Original: IHTMLElementCollection = js.native
  var button: scala.Double = js.native
  val buttonID: scala.Double = js.native
  var cancelBubble: scala.Boolean = js.native
  var clientX: scala.Double = js.native
  var clientY: scala.Double = js.native
  val constructor: js.Any = js.native
  val contentOverflow: scala.Boolean = js.native
  var ctrlKey: scala.Boolean = js.native
  var ctrlLeft: scala.Boolean = js.native
  var data: java.lang.String = js.native
  var dataFld: java.lang.String = js.native
  val dataTransfer: IHTMLDataTransfer = js.native
  var fromElement: IHTMLElement = js.native
  var keyCode: scala.Double = js.native
  val nextPage: java.lang.String = js.native
  var offsetX: scala.Double = js.native
  var offsetY: scala.Double = js.native
  var origin: java.lang.String = js.native
  var propertyName: java.lang.String = js.native
  var qualifier: java.lang.String = js.native
  var reason: scala.Double = js.native
  var recordset: js.Any = js.native
  var repeat: scala.Boolean = js.native
  var returnValue: js.Any = js.native
  var screenX: scala.Double = js.native
  var screenY: scala.Double = js.native
  var shiftKey: scala.Boolean = js.native
  var shiftLeft: scala.Boolean = js.native
  val source: js.Any = js.native
  var srcElement: IHTMLElement = js.native
  var srcFilter: js.Any = js.native
  var srcUrn: java.lang.String = js.native
  var toElement: IHTMLElement = js.native
  var `type`: java.lang.String = js.native
  var url: java.lang.String = js.native
  val wheelDelta: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def bookmarks(index: scala.Double): js.Any = js.native
  def boundElements(): js.Any = js.native
  def boundElements(name: js.Any): js.Any = js.native
  def boundElements(name: js.Any, index: js.Any): js.Any = js.native
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: java.lang.String): js.Any = js.native
  def getAttribute(strAttributeName: java.lang.String, lFlags: scala.Double): js.Any = js.native
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: java.lang.String): scala.Boolean = js.native
  def removeAttribute(strAttributeName: java.lang.String, lFlags: scala.Double): scala.Boolean = js.native
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: java.lang.String, AttributeValue: js.Any): scala.Unit = js.native
  def setAttribute(strAttributeName: java.lang.String, AttributeValue: js.Any, lFlags: scala.Double): scala.Unit = js.native
}

