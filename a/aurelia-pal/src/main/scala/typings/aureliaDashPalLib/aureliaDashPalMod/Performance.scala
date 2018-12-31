package typings
package aureliaDashPalLib.aureliaDashPalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Performance extends js.Object {
  /**
    * Removes the given mark from the browser's performance entry buffer.
    *
    * @param {string} [markName] A DOMString representing the name of the timestamp. If this argument is omitted, all performance entries with an entry type of "mark" will be removed.
    * @memberof IPerformance
    */
  def clearMarks(): scala.Unit = js.native
  def clearMarks(markName: java.lang.String): scala.Unit = js.native
  /**
    * Removes the given measure from the browser's performance entry buffer.
    *
    * @param {string} [measureName] A DOMString representing the name of the timestamp. If this argument is omitted, all performance entries with an entry type of "measure" will be removed.
    * @memberof IPerformance
    */
  def clearMeasures(): scala.Unit = js.native
  def clearMeasures(measureName: java.lang.String): scala.Unit = js.native
  /**
    * Returns a list of PerformanceEntry objects based on the given name and entry type.
    *
    * @param {string} name The name of the entry to retrieve
    * @param {string} [entryType] The type of entry to retrieve such as "mark". The valid entry types are listed in PerformanceEntry.entryType.
    * @returns {*}
    * @memberof IPerformance
    */
  def getEntriesByName(name: java.lang.String): js.Any = js.native
  def getEntriesByName(name: java.lang.String, entryType: java.lang.String): js.Any = js.native
  /**
    * Returns a list of PerformanceEntry objects of the given entry type.
    *
    * @param {string} entryType The type of entry to retrieve such as "mark". The valid entry types are listed in PerformanceEntry.entryType.
    * @returns {*}
    * @memberof IPerformance
    */
  def getEntriesByType(entryType: java.lang.String): js.Any = js.native
  /**
    * Creates a timestamp in the browser's performance entry buffer with the given name.
    *
    * @param {string} markName a DOMString representing the name of the mark
    * @memberof IPerformance
    */
  def mark(markName: java.lang.String): scala.Unit = js.native
  /**
    * Creates a named timestamp in the browser's performance entry buffer between two specified marks (known as the start mark and end mark, respectively).
    *
    * @param {string} measureName a DOMString representing the name of the measure.
    * @param {string} [startMarkName] A DOMString representing the name of the measure's starting mark. May also be the name of a PerformanceTiming property.
    * @param {string} [endMarkName] A DOMString representing the name of the measure's ending mark. May also be the name of a PerformanceTiming property.
    * @memberof IPerformance
    */
  def measure(measureName: java.lang.String): scala.Unit = js.native
  def measure(measureName: java.lang.String, startMarkName: java.lang.String): scala.Unit = js.native
  def measure(measureName: java.lang.String, startMarkName: java.lang.String, endMarkName: java.lang.String): scala.Unit = js.native
  /**
    * Gets a DOMHighResTimeStamp.
    * @return The timestamp, measured in milliseconds, accurate to one thousandth of a millisecond.
    */
  def now(): scala.Double = js.native
}

