package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateFromGLTFParams
  extends stdLib.Object {
  /**
    * Whether the model coordinates should be relative to the geographic or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromGLTF)
    */
  var geographic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the loading process. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromGLTF)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
}

object MeshCreateFromGLTFParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    geographic: js.UndefOr[scala.Boolean] = js.undefined,
    signal: stdLib.AbortSignal = null
  ): MeshCreateFromGLTFParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[MeshCreateFromGLTFParams]
  }
}

