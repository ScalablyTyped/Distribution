package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PolygonBarrier
import typings.arcgisJsApi.esri.PolygonBarrierConstructor
import typings.arcgisJsApi.esri.PolygonBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonBarrierMod extends Shortcut {
  
  @JSImport("esri/rest/support/PolygonBarrier", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PolygonBarrierConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/PolygonBarrier", JSImport.Namespace)
  @js.native
  /**
    * A polygon barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PolygonBarrier.html)
    */
  open class Class ()
    extends StObject
       with PolygonBarrier {
    def this(properties: PolygonBarrierProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PolygonBarrierConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polygonBarrierMod.foo` */
  override def _to: js.Object & PolygonBarrierConstructor = ^
}
