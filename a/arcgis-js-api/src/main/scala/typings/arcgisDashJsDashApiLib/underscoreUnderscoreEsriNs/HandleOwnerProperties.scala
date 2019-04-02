package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleOwnerProperties extends js.Object {
  /**
    * Handle registry to help manage `handles`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html#handles)
    */
  var handles: js.UndefOr[HandlesProperties] = js.undefined
}

object HandleOwnerProperties {
  @scala.inline
  def apply(handles: HandlesProperties = null): HandleOwnerProperties = {
    val __obj = js.Dynamic.literal()
    if (handles != null) __obj.updateDynamic("handles")(handles)
    __obj.asInstanceOf[HandleOwnerProperties]
  }
}

