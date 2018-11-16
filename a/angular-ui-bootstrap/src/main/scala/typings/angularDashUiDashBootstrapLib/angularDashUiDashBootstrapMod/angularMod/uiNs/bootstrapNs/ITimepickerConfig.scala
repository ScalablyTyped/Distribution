package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITimepickerConfig extends js.Object {
  /**
               * Whether the user can use up/down arrowkeys inside the hours & minutes input to increase or decrease it's values.
               *
               * @default true
               */
  var arrowkeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Number of hours to increase or decrease when using a button.
               *
               * @default 1
               */
  var hourStep: js.UndefOr[scala.Double] = js.undefined
  /**
               * Meridian labels based on locale. To override you must supply an array like ['AM', 'PM'].
               *
               * @default null
               */
  var meridians: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Number of minutes to increase or decrease when using a button.
               *
               * @default 1
               */
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  /**
               * Whether the user can scroll inside the hours & minutes input to increase or decrease it's values.
               *
               * @default true
               */
  var mousewheel: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether the user can type inside the hours & minutes input.
               *
               * @default false
               */
  var readonlyInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Number of seconds to increase or decrease when using a button.
               *
               * @default 1
               */
  var secondStep: js.UndefOr[scala.Double] = js.undefined
  /**
               * Whether to display 12H or 24H mode.
               *
               * @default true
               */
  var showMeridian: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Show seconds input.
               *
               * @default false
               */
  var showSeconds: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Shows spinner arrows above and below the inputs.
               *
               * @default true
               */
  var showSpinners: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Add the ability to override the template used on the component.
               *
               * @default 'uib/template/timepicker/timepicker.html'
               */
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
}

