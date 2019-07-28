package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSerialization extends js.Object {
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var csv: js.UndefOr[CSVInput] = js.undefined
}

object InputSerialization {
  @scala.inline
  def apply(csv: CSVInput = null): InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (csv != null) __obj.updateDynamic("csv")(csv)
    __obj.asInstanceOf[InputSerialization]
  }
}

