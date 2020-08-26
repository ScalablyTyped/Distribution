package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the result of one element in the data pilot data array.
  * @see com.sun.star.sheet.XDataPilotResults
  */
@js.native
trait DataResult extends js.Object {
  /**
    * contains boolean flags describing the result.
    * @see com.sun.star.sheet.DataResultFlags
    */
  var Flags: Double = js.native
  /** contains the result value. */
  var Value: Double = js.native
}

object DataResult {
  @scala.inline
  def apply(Flags: Double, Value: Double): DataResult = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResult]
  }
  @scala.inline
  implicit class DataResultOps[Self <: DataResult] (val x: Self) extends AnyVal {
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
    def setFlags(value: Double): Self = this.set("Flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

