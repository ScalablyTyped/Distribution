package typings.atlassianConnectJs.AP.jira

import typings.atlassianConnectJs.anon.Left
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerOptions extends js.Object {
  /**
    * Date (and time) that should be pre-selected when displaying the picker in the format understandable by Date.parse method in JavaScript.
    *
    * ISO 8601 is preferred. Timezone should be set to Z for UTC time or in the format of +/-hh:mm. Not setting it will cause JavaScript to use local timezone set in the browser.
    * Defaults to current date/time.
    */
  var date: String
  /**
    * HTML element below which date picker will be positioned. If provided, it takes precedence over `options.position`.
    */
  var element: HTMLElement
  /**
    * Position of the element relative to the iframe. options.element takes precedence over it when provided.
    */
  var position: Left
  /**
    * Flag determining whether the component should also have a time picker. Defaults to `false`.
    */
  var showTime: Boolean
  /**
    * Callback that will be invoked when the date (and time) is selected by the user.
    */
  def onSelect(isoDate: String, date: Date): Unit
}

object DatePickerOptions {
  @scala.inline
  def apply(
    date: String,
    element: HTMLElement,
    onSelect: (String, Date) => Unit,
    position: Left,
    showTime: Boolean
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), position = position.asInstanceOf[js.Any], showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerOptions]
  }
}

