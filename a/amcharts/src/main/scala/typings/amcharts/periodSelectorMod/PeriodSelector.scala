package typings.amcharts.periodSelectorMod

import typings.amcharts.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodSelector extends js.Object {
  /**
    * Date format of date input fields.
    * Check [[http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/mx/formatters/DateFormatter.html
    * @default "DD-MM-YYYY"
    */
  var dateFormat: String
  /**
    * Text displayed next to "from" date input field. From:
    */
  var fromText: String
  /**
    * Specifies if period buttons with date range bigger than available data should be hidden.
    * @default true
    */
  var hideOutOfScopePeriods: Boolean
  /**
    * Width of date input fields, in pixels. Works only if period selector is horizontal.
    * @default 100
    */
  var inputFieldWidth: Double
  /**
    * Specifies whether period selector displays "from" and "to" date input fields.
    * @default true
    */
  var inputFieldsEnabled: Boolean
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
  var periodsText: String
  /**
    * Possible values: "right", "left", "top", "bottom". bottom
    */
  var position: String
  /**
    * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
    */
  var selectFromStart: Boolean
  /**
    * Text displayed next to "to" date input field. To:
    */
  var toText: String
  /**
    * Width of a period selector, when position is "left" or "right".
    * @default 180
    */
  var width: Double
  /**
    * Adds event listener to the object.
    * @param handler - Dispatched when dates in period selector input fields are changed or
    * user clicks on one of the predefined period buttons.
    */
  def addListener(`type`: String, handler: js.Function1[/* e */ AnonCount, Unit]): Unit
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
}

object PeriodSelector {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ AnonCount, Unit]) => Unit,
    dateFormat: String,
    fromText: String,
    hideOutOfScopePeriods: Boolean,
    inputFieldWidth: Double,
    inputFieldsEnabled: Boolean,
    periods: js.Array[_],
    periodsText: String,
    position: String,
    removeListener: (typings.amcharts.amChartMod.default, String, js.Any) => Unit,
    selectFromStart: Boolean,
    toText: String,
    width: Double
  ): PeriodSelector = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), dateFormat = dateFormat.asInstanceOf[js.Any], fromText = fromText.asInstanceOf[js.Any], hideOutOfScopePeriods = hideOutOfScopePeriods.asInstanceOf[js.Any], inputFieldWidth = inputFieldWidth.asInstanceOf[js.Any], inputFieldsEnabled = inputFieldsEnabled.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], periodsText = periodsText.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), selectFromStart = selectFromStart.asInstanceOf[js.Any], toText = toText.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PeriodSelector]
  }
}

