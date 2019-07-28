package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSerialization extends js.Object {
  /**
    * Describes the serialization of CSV-encoded Select results.
    */
  var CSV: js.UndefOr[CSVOutput] = js.undefined
  /**
    * Specifies JSON as request's output serialization format.
    */
  var JSON: js.UndefOr[JSONOutput] = js.undefined
}

object OutputSerialization {
  @scala.inline
  def apply(CSV: CSVOutput = null, JSON: JSONOutput = null): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV)
    if (JSON != null) __obj.updateDynamic("JSON")(JSON)
    __obj.asInstanceOf[OutputSerialization]
  }
}

