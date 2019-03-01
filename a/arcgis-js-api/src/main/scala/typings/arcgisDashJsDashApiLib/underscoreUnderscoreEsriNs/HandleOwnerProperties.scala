package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleOwnerProperties extends js.Object {
  /**
    * Handle registry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html#handles)
    */
  var handles: js.UndefOr[scala.Unit] = js.undefined
}

object HandleOwnerProperties {
  @scala.inline
  def apply(handles: js.UndefOr[scala.Unit] = js.undefined): HandleOwnerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handles)) __obj.updateDynamic("handles")(handles)
    __obj.asInstanceOf[HandleOwnerProperties]
  }
}

