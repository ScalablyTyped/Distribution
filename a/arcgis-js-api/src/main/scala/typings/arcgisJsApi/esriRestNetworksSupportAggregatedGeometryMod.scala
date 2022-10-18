package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AggregatedGeometry
import typings.arcgisJsApi.esri.AggregatedGeometryConstructor
import typings.arcgisJsApi.esri.AggregatedGeometryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestNetworksSupportAggregatedGeometryMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/AggregatedGeometry", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AggregatedGeometryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/AggregatedGeometry", JSImport.Namespace)
  @js.native
  /**
    * A class that defines an aggregation of geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html)
    */
  open class Class ()
    extends StObject
       with AggregatedGeometry {
    def this(properties: AggregatedGeometryProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AggregatedGeometryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestNetworksSupportAggregatedGeometryMod.foo` */
  override def _to: js.Object & AggregatedGeometryConstructor = ^
}
