package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SpatialReference")
@js.native
/**
		 * Defines the spatial reference of a view, layer, or method parameters.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html)
		 */
open class SpatialReference ()
  extends StObject
     with typings.arcgisJsApi.esri.SpatialReference {
  def this(properties: SpatialReferenceProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SpatialReference {
  
  @JSGlobal("__esri.SpatialReference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience spatial reference instance for WGS84.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WGS84)
  		 */
  @JSGlobal("__esri.SpatialReference.WGS84")
  @js.native
  def WGS84: typings.arcgisJsApi.esri.SpatialReference = js.native
  inline def WGS84_=(x: typings.arcgisJsApi.esri.SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGS84")(x.asInstanceOf[js.Any])
  
  /**
  		 * A convenience spatial reference instance for Web Mercator.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WebMercator)
  		 */
  @JSGlobal("__esri.SpatialReference.WebMercator")
  @js.native
  def WebMercator: typings.arcgisJsApi.esri.SpatialReference = js.native
  inline def WebMercator_=(x: typings.arcgisJsApi.esri.SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebMercator")(x.asInstanceOf[js.Any])
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SpatialReference]
}
