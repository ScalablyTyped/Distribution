package typings
package amchartsLib.periodselectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PeriodSelector extends js.Object {
  /**
       * Date format of date input fields.
       * Check [[http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/mx/formatters/DateFormatter.html
       * @default "DD-MM-YYYY"
       */
  var dateFormat: java.lang.String
  /**
       * Text displayed next to "from" date input field. From:
       */
  var fromText: java.lang.String
  /**
       * Specifies if period buttons with date range bigger than available data should be hidden.
       * @default true
       */
  var hideOutOfScopePeriods: scala.Boolean
  /**
       * Width of date input fields, in pixels. Works only if period selector is horizontal.
       * @default 100
       */
  var inputFieldWidth: scala.Double
  /**
       * Specifies whether period selector displays "from" and "to" date input fields.
       * @default true
       */
  var inputFieldsEnabled: scala.Boolean
  /**
       * Array of predefined period objects. Period object has 4 properties - period, count, label and selected.
       * Possible period values are:
       * "ss" - seconds,
       * "mm" - minutes,
       * "hh" - hours,
       * "DD" - days,
       * "MM" - months,
       * "YYYY" - years.
       * Property "count" specifies how many periods this button will select.
       * "label" will be displayed on a button.
       * "selected" is a boolean which specifies if this button is selected when chart is initialized or not.
       * Example: {period:"DD", count:10, label:"10 days", selected:false}.
       */
  var periods: js.Array[_]
  /**
       * Text displayed next to predefined period buttons. Zoom:
       */
  var periodsText: java.lang.String
  /**
       * Possible values: "right", "left", "top", "bottom". bottom
       */
  var position: java.lang.String
  /**
       * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
       */
  var selectFromStart: scala.Boolean
  /**
       * Text displayed next to "to" date input field. To:
       */
  var toText: java.lang.String
  /**
       * Width of a period selector, when position is "left" or "right".
       * @default 180
       */
  var width: scala.Double
  /**
       * Adds event listener to the object.
       * @param handler - Dispatched when dates in period selector input fields are changed or
       * user clicks on one of the predefined period buttons.
       */
  def addListener(`type`: java.lang.String, handler: js.Function1[/* e */ amchartsLib.Anon_Count, scala.Unit]): scala.Unit
  /**
       * Removes event listener from chart object.
       */
  def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit
}

