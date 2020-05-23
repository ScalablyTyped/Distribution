package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the result of one element in the data pilot data array.
  * @see com.sun.star.sheet.XDataPilotResults
  */
trait DataResult extends js.Object {
  /**
    * contains boolean flags describing the result.
    * @see com.sun.star.sheet.DataResultFlags
    */
  var Flags: Double
  /** contains the result value. */
  var Value: Double
}

object DataResult {
  @scala.inline
  def apply(Flags: Double, Value: Double): DataResult = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResult]
  }
}

