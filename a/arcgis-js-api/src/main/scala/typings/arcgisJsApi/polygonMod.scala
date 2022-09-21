package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Polygon
import typings.arcgisJsApi.esri.PolygonConstructor
import typings.arcgisJsApi.esri.PolygonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod extends Shortcut {
  
  @JSImport("esri/geometry/Polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PolygonConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Polygon", JSImport.Namespace)
  @js.native
  /**
    * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
    */
  open class Class ()
    extends StObject
       with Polygon {
    def this(properties: PolygonProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PolygonConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polygonMod.foo` */
  override def _to: js.Object & PolygonConstructor = ^
}
