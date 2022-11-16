package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cluster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureReductionCluster
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Defines the symbol size of the largest cluster in points (or pixels if specified).
    *
    * @default 37.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMaxSize)
    */
  var clusterMaxSize: Double = js.native
  
  /**
    * Defines the symbol size of the smallest cluster in points (or pixels if specified).
    *
    * @default 9
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize)
    */
  var clusterMinSize: Double = js.native
  
  /**
    * Defines the radius in points (or pixels if specified) of the area in which multiple points will be grouped and visualized as a single cluster.
    *
    * @default 60
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius)
    */
  var clusterRadius: Double = js.native
  
  /**
    * An array of aggregate fields that summarize layer [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#fields) from features contained within each cluster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#fields)
    */
  var fields: js.Array[AggregateField] = js.native
  
  /**
    * Defines labels for clusters as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * Indicates whether to display labels for the clusters.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelsVisible)
    */
  var labelsVisible: Boolean = js.native
  
  /**
    * Indicates whether to display the cluster popup.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to clustered graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  
  /**
    * The renderer used to override the default style of the clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#renderer)
    */
  var renderer: Renderer = js.native
  
  /**
    * A symbol used to override the default cluster style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#symbol)
    */
  var symbol: MarkerSymbol | CIMSymbol | WebStyleSymbol = js.native
  
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#type)
    */
  var `type`: cluster = js.native
}
