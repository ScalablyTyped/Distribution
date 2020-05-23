package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLFrameBase extends js.Object {
  @JSName("MSHTML.IHTMLFrameBase_typekey")
  var MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase
  var border: js.Any
  var frameBorder: String
  var frameSpacing: js.Any
  var marginHeight: js.Any
  var marginWidth: js.Any
  var name: String
  var noResize: Boolean
  var scrolling: String
  var src: String
}

object IHTMLFrameBase {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase,
    border: js.Any,
    frameBorder: String,
    frameSpacing: js.Any,
    marginHeight: js.Any,
    marginWidth: js.Any,
    name: String,
    noResize: Boolean,
    scrolling: String,
    src: String
  ): IHTMLFrameBase = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], frameBorder = frameBorder.asInstanceOf[js.Any], frameSpacing = frameSpacing.asInstanceOf[js.Any], marginHeight = marginHeight.asInstanceOf[js.Any], marginWidth = marginWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noResize = noResize.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLFrameBase_typekey")(MSHTMLDotIHTMLFrameBase_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLFrameBase]
  }
}

