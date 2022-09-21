package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeometryConstructor
import typings.arcgisJsApi.esri.GeometryProperties
import typings.arcgisJsApi.esri.Geometry_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryGeometryMod extends Shortcut {
  
  @JSImport("esri/geometry/Geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeometryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Geometry", JSImport.Namespace)
  @js.native
  /**
    * The base class for geometry objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html)
    */
  open class Class ()
    extends StObject
       with Geometry_ {
    def this(properties: GeometryProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GeometryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geometryGeometryMod.foo` */
  override def _to: js.Object & GeometryConstructor = ^
}
