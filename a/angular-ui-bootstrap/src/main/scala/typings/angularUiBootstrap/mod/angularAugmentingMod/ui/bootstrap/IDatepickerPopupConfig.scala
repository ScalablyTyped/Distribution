package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angularUiBootstrap.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerPopupConfig extends IDatepickerConfig {
  /**
    * A list of alternate formats acceptable for manual entry.
    *
    * @default []
    */
  var altInputFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Append the datepicker popup element to `body`, rather than inserting after `datepicker-popup`.
    *
    * @default false
    */
  var appendToBody: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the clear button.
    *
    * @default 'Clear'
    */
  var clearText: js.UndefOr[String] = js.native
  /**
    * Whether to close calendar when a date is chosen.
    *
    * @default true
    */
  var closeOnDateSelection: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the close button.
    *
    * @default 'Done'
    */
  var closeText: js.UndefOr[String] = js.native
  /**
    * The text to display for the current day button.
    *
    * @default 'Today'
    */
  var currentText: js.UndefOr[String] = js.native
  /**
    * The format for displayed dates.
    *
    * @default 'yyyy-MM-dd'
    */
  var datepickerPopup: js.UndefOr[String] = js.native
  /**
    * Allows overriding of default template of the popup.
    *
    * @default 'template/datepicker/popup.html'
    */
  var datepickerPopupTemplateUrl: js.UndefOr[String] = js.native
  /**
    * Allows overriding of default template of the datepicker used in popup.
    *
    * @default 'template/datepicker/popup.html'
    */
  var datepickerTemplateUrl: js.UndefOr[String] = js.native
  /**
    * Allows overriding of the default format for html5 date inputs.
    */
  var html5Types: js.UndefOr[Date] = js.native
  /**
    * Whether to focus the datepicker popup upon opening.
    *
    * @default true
    */
  var onOpenFocus: js.UndefOr[Boolean] = js.native
  /**
    * Passing in 'auto' separated by a space before the placement will enable auto positioning, e.g: "auto bottom-left". The popup will attempt to position where it fits in the closest scrollable ancestor.
    *
    * @default 'auto bottom-left'
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * Whether to display a button bar underneath the datepicker.
    *
    * @default true
    */
  var showButtonBar: js.UndefOr[Boolean] = js.native
}

object IDatepickerPopupConfig {
  @scala.inline
  def apply(): IDatepickerPopupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerPopupConfig]
  }
  @scala.inline
  implicit class IDatepickerPopupConfigOps[Self <: IDatepickerPopupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltInputFormatsVarargs(value: String*): Self = this.set("altInputFormats", js.Array(value :_*))
    @scala.inline
    def setAltInputFormats(value: js.Array[String]): Self = this.set("altInputFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltInputFormats: Self = this.set("altInputFormats", js.undefined)
    @scala.inline
    def setAppendToBody(value: Boolean): Self = this.set("appendToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendToBody: Self = this.set("appendToBody", js.undefined)
    @scala.inline
    def setClearText(value: String): Self = this.set("clearText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearText: Self = this.set("clearText", js.undefined)
    @scala.inline
    def setCloseOnDateSelection(value: Boolean): Self = this.set("closeOnDateSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnDateSelection: Self = this.set("closeOnDateSelection", js.undefined)
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    @scala.inline
    def setCurrentText(value: String): Self = this.set("currentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentText: Self = this.set("currentText", js.undefined)
    @scala.inline
    def setDatepickerPopup(value: String): Self = this.set("datepickerPopup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatepickerPopup: Self = this.set("datepickerPopup", js.undefined)
    @scala.inline
    def setDatepickerPopupTemplateUrl(value: String): Self = this.set("datepickerPopupTemplateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatepickerPopupTemplateUrl: Self = this.set("datepickerPopupTemplateUrl", js.undefined)
    @scala.inline
    def setDatepickerTemplateUrl(value: String): Self = this.set("datepickerTemplateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatepickerTemplateUrl: Self = this.set("datepickerTemplateUrl", js.undefined)
    @scala.inline
    def setHtml5Types(value: Date): Self = this.set("html5Types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml5Types: Self = this.set("html5Types", js.undefined)
    @scala.inline
    def setOnOpenFocus(value: Boolean): Self = this.set("onOpenFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenFocus: Self = this.set("onOpenFocus", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setShowButtonBar(value: Boolean): Self = this.set("showButtonBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButtonBar: Self = this.set("showButtonBar", js.undefined)
  }
  
}

