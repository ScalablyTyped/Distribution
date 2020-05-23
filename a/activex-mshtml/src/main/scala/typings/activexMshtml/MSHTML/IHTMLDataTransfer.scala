package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLDataTransfer extends js.Object {
  @JSName("MSHTML.IHTMLDataTransfer_typekey")
  var MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer
  var dropEffect: String
  var effectAllowed: String
  def clearData(format: String): Boolean
  def getData(format: String): js.Any
  def setData(format: String, data: js.Any): Boolean
}

object IHTMLDataTransfer {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer,
    clearData: String => Boolean,
    dropEffect: String,
    effectAllowed: String,
    getData: String => js.Any,
    setData: (String, js.Any) => Boolean
  ): IHTMLDataTransfer = {
    val __obj = js.Dynamic.literal(clearData = js.Any.fromFunction1(clearData), dropEffect = dropEffect.asInstanceOf[js.Any], effectAllowed = effectAllowed.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), setData = js.Any.fromFunction2(setData))
    __obj.updateDynamic("MSHTML.IHTMLDataTransfer_typekey")(MSHTMLDotIHTMLDataTransfer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDataTransfer]
  }
}

