package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ground
  extends Accessor
     with Loadable
     with JSONSupport {
  /**
    * A collection of [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) that define the elevation or terrain that makes up the ground surface. When elevation layers are added to the ground, the topographical variations of the surface are rendered in 3D as they would appear in the real world.  ![elev-default](https://developers.arcgis.com/javascript/assets/img/apiref/ground/elev-default.png)  When the layers collection is empty, the ground surface is flat.  ![no-elev](https://developers.arcgis.com/javascript/assets/img/apiref/ground/no-elev.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers)
    */
  var layers: Collection[ElevationLayer] = js.native
  /**
    * Indicates whether the instance has loaded. When `true`, the properties of the object can be accessed. A Ground is considered loaded when its [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) are fully created, but not yet loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * Specifies the user navigation constraints relative to the ground surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var navigationConstraint: GroundNavigationConstraint = js.native
  /**
    * Opacity of the ground, including surface default color and the basemap (without reference layers). This property can be used for a see-through ground effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#opacity)
    *
    * @default 1
    */
  var opacity: Double = js.native
  /**
    * The color of the ground surface, displayed underneath the basemap. If this is null, a grid is displayed instead. The alpha value in the color is ignored. Use the [opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#opacity) property to control the opacity of the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#surfaceColor)
    *
    * @default null
    */
  var surfaceColor: Color_ = js.native
  /**
    * Creates an elevation sampler for the given extent by querying the ground layers for elevation data and caching it so values may be sampled quickly afterwards. The sampler uses the elevation data from the first layer that has data available. For getting elevation data from a specific layer use [ElevationLayer.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#createElevationSampler)
    *
    * @param extent The extent for which to create the sampler.
    * @param options Additional sampler options.
    * @param options.noDataValue The value to use when there is no data available.
    *
    */
  def createElevationSampler(extent: Extent): js.Promise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: GroundCreateElevationSamplerOptions): js.Promise[ElevationSampler] = js.native
  /**
    * Loads all the externally loadable resources associated with the ground. For the ground this will load all the layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#loadAll)
    *
    *
    */
  def loadAll(): js.Promise[Ground] = js.native
  def queryElevation(geometry: Multipoint): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: GroundQueryElevationOptions): js.Promise[ElevationQueryResult] = js.native
  /**
    * Queries the ground layer services for elevation values for the given geometry. The returned result contains a copy of the geometry with z-values sampled from elevation data from the first layer that has data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @param geometry The geometry to sample.
    * @param options Additional query options.
    * @param options.returnSampleInfo Indicates whether to return additional sample information for each sampled coordinate.
    * @param options.noDataValue The value that appears in the resulting geometry when there is no data available.
    *
    */
  def queryElevation(geometry: Point): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: GroundQueryElevationOptions): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: GroundQueryElevationOptions): js.Promise[ElevationQueryResult] = js.native
}

