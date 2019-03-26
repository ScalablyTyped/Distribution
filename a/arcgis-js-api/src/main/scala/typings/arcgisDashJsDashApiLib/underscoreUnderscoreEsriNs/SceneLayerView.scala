package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLayerView extends LayerView {
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): js.Any = js.native
  def highlight(target: Graphic): js.Any = js.native
  def highlight(target: js.Array[scala.Double | Graphic]): js.Any = js.native
  def highlight(target: scala.Double): js.Any = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns the 3D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. If query parameters are not provided, the extent and count of all loaded features are returned.  This method is not yet supported when the associated scene layer has a [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) of `point`. Read more about queries in the Query section of the [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) class description.
    * > To query for the extent of features directly from a Scene Service rather than those loaded for the current view, you must use the [SceneLayer.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryExtent) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryExtent)
    *
    * @param params Specifies the attributes of the query. Only the[objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#objectIds), [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num) and [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start) properties should be specified. Adding any other properties will return an error. If query parameters are not provided, all loaded features are returned.
    *
    */
  def queryExtent(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(params: Query): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns the number of features that satisfy the query. If query parameters are not provided, the count of all loaded features is returned. Read more about queries in the Query section of the [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) class description.  This method is not yet supported when the associated scene layer has a [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) of `point`.
    * > To query for the count of features directly from a Scene Service rather than those loaded for the current view, you must use the [SceneLayer.queryFeatureCount()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatureCount) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatureCount)
    *
    * @param params Specifies the attributes of the query. Only the[objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#objectIds), [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num) and [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start) properties should be specified. Adding any other properties will return an error. If query parameters are not provided, all loaded features are returned.
    *
    */
  def queryFeatureCount(): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(params: Query): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). If query parameters are not provided, all loaded features are returned.  This method is not yet supported when the associated scene layer has a [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) of `point`. Read more about queries in the Query section of the [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) class description.  Querying more than 10.000 features returns an error, unless num is specified in the Query.
    * > To execute a query against all the features in a Scene Service rather than only those loaded for the current view, you must use the [SceneLayer.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatures)
    *
    * @param params Specifies the attributes of the query. Only the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields), [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#objectIds), [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num) and [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start) properties should be specified. Adding any other properties will return an error. If query parameters are not provided, all loaded features are returned.
    *
    */
  def queryFeatures(): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(params: Query): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns an array of the ObjectIDs of features that satisfy the input query. If query parameters are not provided, the ObjectIDs of all loaded features are returned.  This method is not yet supported when the associated scene layer has a [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) of `point`. Read more about queries in the Query section of the [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) class description.
    * > To query for ObjectIDs of features directly from a Scene Service rather than those loaded for the current view, you must use the [SceneLayer.queryObjectIds()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryObjectIds) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryObjectIds)
    *
    * @param params Specifies the attributes of the query. Only the[objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#objectIds), [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num) and [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start) properties should be specified. Adding any other properties will return an error. If query parameters are not provided, all loaded features are returned.
    *
    */
  def queryObjectIds(): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(params: Query): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
}

@JSGlobal("__esri.SceneLayerView")
@js.native
/**
  * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html)
  */
class SceneLayerViewCls () extends SceneLayerView {
  def this(properties: SceneLayerViewProperties) = this()
}

