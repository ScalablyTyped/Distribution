package typings.amcharts.mod.AmCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts")
@js.native
object ^ extends js.Object {
  /**
    * Set it to true if you have base href set for your page.
    * This will fix rendering problems in Firefox caused by base href.
    */
  var baseHref: Boolean = js.native
  /**
    * Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
    */
  var dayNames: js.Array[String] = js.native
  /**
    * Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * [
    * 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August',
    * 'September', 'October', 'November','December'
    * ]
    */
  var monthNames: js.Array[String] = js.native
  /**
    * Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
    */
  var shortDayNames: js.Array[String] = js.native
  /**
    * Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    */
  var shortMonthNames: js.Array[String] = js.native
  /**
    * Set global used AmCharts theme.
    */
  var theme: js.Any = js.native
  /**
    * Object with existing themes.
    */
  var themes: js.Any = js.native
  /**
    * Set it to true if you want UTC time to be used instead of local time.
    */
  var useUTC: Boolean = js.native
}

