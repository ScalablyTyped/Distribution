package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCSSMediaList extends js.Object {
  @JSName("MSHTML.HTMLCSSMediaList_typekey")
  var MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList
  val length: Double
  var mediaText: String
  def appendMedium(bstrMedium: String): Unit
  def deleteMedium(bstrMedium: String): Unit
  def item(index: Double): String
}

object HTMLCSSMediaList {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList,
    appendMedium: String => Unit,
    deleteMedium: String => Unit,
    item: Double => String,
    length: Double,
    mediaText: String
  ): HTMLCSSMediaList = {
    val __obj = js.Dynamic.literal(appendMedium = js.Any.fromFunction1(appendMedium), deleteMedium = js.Any.fromFunction1(deleteMedium), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], mediaText = mediaText.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSMediaList_typekey")(MSHTMLDotHTMLCSSMediaList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSMediaList]
  }
}

