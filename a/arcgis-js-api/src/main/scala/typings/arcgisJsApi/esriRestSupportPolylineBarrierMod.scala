package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PolylineBarrier
import typings.arcgisJsApi.esri.PolylineBarrierConstructor
import typings.arcgisJsApi.esri.PolylineBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPolylineBarrierMod extends Shortcut {
  
  @JSImport("esri/rest/support/PolylineBarrier", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PolylineBarrierConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/PolylineBarrier", JSImport.Namespace)
  @js.native
  /**
    * A polyline barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolylineBarrier.html)
    */
  open class Class ()
    extends StObject
       with PolylineBarrier {
    def this(properties: PolylineBarrierProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PolylineBarrierConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportPolylineBarrierMod.foo` */
  override def _to: js.Object & PolylineBarrierConstructor = ^
}
