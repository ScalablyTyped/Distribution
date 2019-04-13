package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSerialization extends js.Object {
  /**
    * Describes the serialization of CSV-encoded query results.
    */
  var csv: js.UndefOr[CSVOutput] = js.undefined
}

object OutputSerialization {
  @scala.inline
  def apply(csv: CSVOutput = null): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    __obj.asInstanceOf[OutputSerialization]
  }
}

