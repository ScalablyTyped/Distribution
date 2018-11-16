package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDatepickerPopupConfig extends IDatepickerConfig {
  /**
               * A list of alternate formats acceptable for manual entry.
               *
               * @default []
               */
  var altInputFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Append the datepicker popup element to `body`, rather than inserting after `datepicker-popup`.
               *
               * @default false
               */
  var appendToBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The text to display for the clear button.
               *
               * @default 'Clear'
               */
  var clearText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether to close calendar when a date is chosen.
               *
               * @default true
               */
  var closeOnDateSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The text to display for the close button.
               *
               * @default 'Done'
               */
  var closeText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The text to display for the current day button.
               *
               * @default 'Today'
               */
  var currentText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The format for displayed dates.
               *
               * @default 'yyyy-MM-dd'
               */
  var datepickerPopup: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Allows overriding of default template of the popup.
               *
               * @default 'template/datepicker/popup.html'
               */
  var datepickerPopupTemplateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Allows overriding of default template of the datepicker used in popup.
               *
               * @default 'template/datepicker/popup.html'
               */
  var datepickerTemplateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Allows overriding of the default format for html5 date inputs.
               */
  var html5Types: js.UndefOr[angularDashUiDashBootstrapLib.Anon_Date] = js.undefined
  /**
               * Whether to focus the datepicker popup upon opening.
               *
               * @default true
               */
  var onOpenFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Passing in 'auto' separated by a space before the placement will enable auto positioning, e.g: "auto bottom-left". The popup will attempt to position where it fits in the closest scrollable ancestor.
               *
               * @default 'auto bottom-left'
               */
  var placement: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether to display a button bar underneath the datepicker.
               *
               * @default true
               */
  var showButtonBar: js.UndefOr[scala.Boolean] = js.undefined
}

