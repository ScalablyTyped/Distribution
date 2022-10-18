package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Polyline
import typings.arcgisJsApi.esri.PolylineConstructor
import typings.arcgisJsApi.esri.PolylineProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometryPolylineMod extends Shortcut {
  
  @JSImport("esri/geometry/Polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PolylineConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Polyline", JSImport.Namespace)
  @js.native
  /**
    * A polyline contains an array of [paths](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths) and [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)
    */
  open class Class ()
    extends StObject
       with Polyline {
    def this(properties: PolylineProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PolylineConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometryPolylineMod.foo` */
  override def _to: js.Object & PolylineConstructor = ^
}
