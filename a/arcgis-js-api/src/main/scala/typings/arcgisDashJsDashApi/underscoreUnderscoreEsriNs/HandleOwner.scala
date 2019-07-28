package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleOwner extends Accessor {
  /**
    * Handle registry to help manage `handles`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html#handles)
    */
  var handles: Handles = js.native
}

@JSGlobal("__esri.HandleOwner")
@js.native
class HandleOwnerCls () extends HandleOwner {
  def this(properties: HandleOwnerProperties) = this()
}

