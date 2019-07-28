package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalRenderer extends Object {
  /**
    * Called when the external renderer is removed from a view, or when the [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready) state of the view turns false. Receives a single parameter of type [RenderContext](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var dispose: js.UndefOr[RenderContextCallback] = js.undefined
  /**
    * Called in every frame to execute the state update and draw calls. Receives a single parameter of type [RenderContext](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var render: js.UndefOr[RenderContextCallback] = js.undefined
  /**
    * Typically called once after adding the external renderer to a view, or whenever the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) becomes [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#ready). It may be called again if the ready state cycles, for example when a different [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) is assigned to the view. Receives a single parameter of type [RenderContext](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ExternalRenderer)
    */
  var setup: js.UndefOr[RenderContextCallback] = js.undefined
}

object ExternalRenderer {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    dispose: RenderContextCallback = null,
    render: RenderContextCallback = null,
    setup: RenderContextCallback = null
  ): ExternalRenderer = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (dispose != null) __obj.updateDynamic("dispose")(dispose)
    if (render != null) __obj.updateDynamic("render")(render)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    __obj.asInstanceOf[ExternalRenderer]
  }
}

