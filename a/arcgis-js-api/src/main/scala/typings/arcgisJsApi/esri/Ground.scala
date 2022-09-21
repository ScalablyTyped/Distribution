package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ground
  extends StObject
     with Accessor
     with Loadable
     with JSONSupport {
  
  /**
    * Creates an elevation sampler for the given extent by querying the ground layers for elevation data and caching it so values may be sampled quickly afterwards.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#createElevationSampler)
    */
  def createElevationSampler(extent: Extent): js.Promise[ElevationSampler] = js.native
  def createElevationSampler(extent: Extent, options: GroundCreateElevationSamplerOptions): js.Promise[ElevationSampler] = js.native
  
  /**
    * A collection of [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) that define the elevation or terrain that makes up the ground surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers)
    */
  var layers: Collection[ElevationLayer] = js.native
  
  /**
    * Loads all the externally loadable resources associated with the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#loadAll)
    */
  def loadAll(): js.Promise[Ground] = js.native
  
  /**
    * Indicates whether the instance has loaded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#loaded)
    */
  val loaded: Boolean = js.native
  
  /**
    * Specifies the user navigation constraints relative to the ground surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var navigationConstraint: GroundNavigationConstraint = js.native
  
  /**
    * Opacity of the ground, including surface default color and the basemap (without reference layers).
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#opacity)
    */
  var opacity: Double = js.native
  
  def queryElevation(geometry: Multipoint): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Multipoint, options: GroundQueryElevationOptions): js.Promise[ElevationQueryResult] = js.native
  /**
    * Query the ground layer services for elevation values for the given geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    */
  def queryElevation(geometry: Point): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Point, options: GroundQueryElevationOptions): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline): js.Promise[ElevationQueryResult] = js.native
  def queryElevation(geometry: Polyline, options: GroundQueryElevationOptions): js.Promise[ElevationQueryResult] = js.native
  
  /**
    * The color of the ground surface, displayed underneath the basemap.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#surfaceColor)
    */
  var surfaceColor: Color_ = js.native
}
