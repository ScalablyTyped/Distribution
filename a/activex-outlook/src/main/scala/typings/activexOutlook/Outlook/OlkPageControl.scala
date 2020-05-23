package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkPageControl extends js.Object {
  @JSName("Outlook.OlkPageControl_typekey")
  var OutlookDotOlkPageControl_typekey: OlkPageControl
  var Page: OlPageType
}

object OlkPageControl {
  @scala.inline
  def apply(OutlookDotOlkPageControl_typekey: OlkPageControl, Page: OlPageType): OlkPageControl = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkPageControl_typekey")(OutlookDotOlkPageControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkPageControl]
  }
}

