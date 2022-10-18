package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Circle
import typings.arcgisJsApi.esri.CircleConstructor
import typings.arcgisJsApi.esri.CircleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometryCircleMod extends Shortcut {
  
  @JSImport("esri/geometry/Circle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CircleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Circle", JSImport.Namespace)
  @js.native
  /**
    * A circle is a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) created by specifying a [center point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center) and a [radius](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html)
    */
  open class Class ()
    extends StObject
       with Circle {
    def this(properties: CircleProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & CircleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometryCircleMod.foo` */
  override def _to: js.Object & CircleConstructor = ^
}
