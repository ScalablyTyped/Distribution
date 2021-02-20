package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angularUiBootstrap.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IDatepickerPopupConfigMutableBuilder[Self <: IDatepickerPopupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltInputFormats(value: js.Array[String]): Self = StObject.set(x, "altInputFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltInputFormatsUndefined: Self = StObject.set(x, "altInputFormats", js.undefined)
    
    @scala.inline
    def setAltInputFormatsVarargs(value: String*): Self = StObject.set(x, "altInputFormats", js.Array(value :_*))
    
    @scala.inline
    def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
    
    @scala.inline
    def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    @scala.inline
    def setCloseOnDateSelection(value: Boolean): Self = StObject.set(x, "closeOnDateSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnDateSelectionUndefined: Self = StObject.set(x, "closeOnDateSelection", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    @scala.inline
    def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
    
    @scala.inline
    def setDatepickerPopup(value: String): Self = StObject.set(x, "datepickerPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatepickerPopupTemplateUrl(value: String): Self = StObject.set(x, "datepickerPopupTemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatepickerPopupTemplateUrlUndefined: Self = StObject.set(x, "datepickerPopupTemplateUrl", js.undefined)
    
    @scala.inline
    def setDatepickerPopupUndefined: Self = StObject.set(x, "datepickerPopup", js.undefined)
    
    @scala.inline
    def setDatepickerTemplateUrl(value: String): Self = StObject.set(x, "datepickerTemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatepickerTemplateUrlUndefined: Self = StObject.set(x, "datepickerTemplateUrl", js.undefined)
    
    @scala.inline
    def setHtml5Types(value: Date): Self = StObject.set(x, "html5Types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml5TypesUndefined: Self = StObject.set(x, "html5Types", js.undefined)
    
    @scala.inline
    def setOnOpenFocus(value: Boolean): Self = StObject.set(x, "onOpenFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenFocusUndefined: Self = StObject.set(x, "onOpenFocus", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setShowButtonBar(value: Boolean): Self = StObject.set(x, "showButtonBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowButtonBarUndefined: Self = StObject.set(x, "showButtonBar", js.undefined)
  }
}
