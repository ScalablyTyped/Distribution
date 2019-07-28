package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`label-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSymbol3D
  extends Symbol3D
     with Symbol2D3D
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D3D
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol3D
     with symbolsSymbol3D {
  /**
    * Settings for adding a callout visualization to the symbol. Callouts are drawn from the point feature location that is being symbolized, to the vertical offset of the symbol. This property has no effect if [verticalOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset) is not set. At the moment only callouts of type `line` are supported. See [LineCallout3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout)
    */
  var callout: Callout3D = js.native
  /**
    * For LabelSymbol3D the type is always `label-3d`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#type)
    */
  @JSName("type")
  val type_LabelSymbol3D: `label-3d` = js.native
  /**
    * Shifts the symbol along the vertical world axis by a given height. The height is set in screen space units like points or pixels. For points displayed with a [callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#callout) `verticalOffset` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var verticalOffset: LabelSymbol3DVerticalOffset = js.native
}

@JSGlobal("__esri.LabelSymbol3D")
@js.native
/**
  * LabelSymbol3D is used to render labels for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This symbol type is not supported in 2D MapViews.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html)
  */
class LabelSymbol3DCls () extends LabelSymbol3D {
  def this(properties: LabelSymbol3DProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

