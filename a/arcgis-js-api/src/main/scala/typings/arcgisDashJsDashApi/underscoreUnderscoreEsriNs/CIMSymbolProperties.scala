package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CIMSymbolProperties extends SymbolProperties {
  /**
    * The JSON payload of the CIM symbol
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
    */
  var data: js.UndefOr[js.Any] = js.undefined
}

object CIMSymbolProperties {
  @scala.inline
  def apply(color: Color | js.Array[Double] | String = null, data: js.Any = null): CIMSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CIMSymbolProperties]
  }
}

