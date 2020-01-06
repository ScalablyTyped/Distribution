package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  /**
    * An array of attributes specifying the name and type of each field in a dataset.
    */
  var Attributes: js.UndefOr[SchemaAttributes] = js.native
}

object Schema {
  @scala.inline
  def apply(Attributes: SchemaAttributes = null): Schema = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

