package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CEventObj extends js.Object {
  @JSName("MSHTML.CEventObj_typekey")
  var MSHTMLDotCEventObj_typekey: CEventObj = js.native
  val actionURL: String = js.native
  var altKey: Boolean = js.native
  var altLeft: Boolean = js.native
  val behaviorCookie: Double = js.native
  val behaviorPart: Double = js.native
  @JSName("bookmarks")
  var bookmarks_Original: IHTMLBookmarkCollection = js.native
  @JSName("boundElements")
  var boundElements_Original: IHTMLElementCollection = js.native
  var button: Double = js.native
  val buttonID: Double = js.native
  var cancelBubble: Boolean = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  val constructor: js.Any = js.native
  val contentOverflow: Boolean = js.native
  var ctrlKey: Boolean = js.native
  var ctrlLeft: Boolean = js.native
  var data: String = js.native
  var dataFld: String = js.native
  val dataTransfer: IHTMLDataTransfer = js.native
  var fromElement: IHTMLElement = js.native
  var keyCode: Double = js.native
  val nextPage: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var origin: String = js.native
  var propertyName: String = js.native
  var qualifier: String = js.native
  var reason: Double = js.native
  var recordset: js.Any = js.native
  var repeat: Boolean = js.native
  var returnValue: js.Any = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var shiftKey: Boolean = js.native
  var shiftLeft: Boolean = js.native
  val source: js.Any = js.native
  var srcElement: IHTMLElement = js.native
  var srcFilter: js.Any = js.native
  var srcUrn: String = js.native
  var toElement: IHTMLElement = js.native
  var `type`: String = js.native
  var url: String = js.native
  val wheelDelta: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def bookmarks(index: Double): js.Any = js.native
  def boundElements(): js.Any = js.native
  def boundElements(name: js.Any): js.Any = js.native
  def boundElements(name: js.Any, index: js.Any): js.Any = js.native
  /** @param lFlags [lFlags=0] */
  def getAttribute(strAttributeName: String): js.Any = js.native
  def getAttribute(strAttributeName: String, lFlags: Double): js.Any = js.native
  /** @param lFlags [lFlags=1] */
  def removeAttribute(strAttributeName: String): Boolean = js.native
  def removeAttribute(strAttributeName: String, lFlags: Double): Boolean = js.native
  /** @param lFlags [lFlags=1] */
  def setAttribute(strAttributeName: String, AttributeValue: js.Any): Unit = js.native
  def setAttribute(strAttributeName: String, AttributeValue: js.Any, lFlags: Double): Unit = js.native
}

