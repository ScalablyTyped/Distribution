package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
trait IResourceOptions extends js.Object {
  var isodatav4: js.UndefOr[scala.Boolean] = js.undefined
  var odata: js.UndefOr[angularDashOdataDashResourcesLib.Anon_Method] = js.undefined
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[scala.Boolean] = js.undefined
}

object IResourceOptions {
  @scala.inline
  def apply(
    isodatav4: js.UndefOr[scala.Boolean] = js.undefined,
    odata: angularDashOdataDashResourcesLib.Anon_Method = null,
    stripTrailingSlashes: js.UndefOr[scala.Boolean] = js.undefined
  ): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isodatav4)) __obj.updateDynamic("isodatav4")(isodatav4)
    if (odata != null) __obj.updateDynamic("odata")(odata)
    if (!js.isUndefined(stripTrailingSlashes)) __obj.updateDynamic("stripTrailingSlashes")(stripTrailingSlashes)
    __obj.asInstanceOf[IResourceOptions]
  }
}

