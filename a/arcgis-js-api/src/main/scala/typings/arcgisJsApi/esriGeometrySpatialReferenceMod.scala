package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometrySpatialReferenceMod {
  
  @JSImport("esri/geometry/SpatialReference", JSImport.Namespace)
  @js.native
  /**
    * Defines the spatial reference of a view, layer, or method parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html)
    */
  open class ^ ()
    extends StObject
       with SpatialReference {
    def this(properties: SpatialReferenceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/SpatialReference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience spatial reference instance for WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WGS84)
    */
  @JSImport("esri/geometry/SpatialReference", "WGS84")
  @js.native
  def WGS84: SpatialReference = js.native
  inline def WGS84_=(x: SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGS84")(x.asInstanceOf[js.Any])
  
  /**
    * A convenience spatial reference instance for Web Mercator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WebMercator)
    */
  @JSImport("esri/geometry/SpatialReference", "WebMercator")
  @js.native
  def WebMercator: SpatialReference = js.native
  inline def WebMercator_=(x: SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebMercator")(x.asInstanceOf[js.Any])
  
  inline def fromJSON(json: Any): SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SpatialReference]
}
