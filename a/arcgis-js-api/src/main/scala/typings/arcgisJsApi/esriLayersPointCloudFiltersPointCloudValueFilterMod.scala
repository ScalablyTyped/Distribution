package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudValueFilter
import typings.arcgisJsApi.esri.PointCloudValueFilterConstructor
import typings.arcgisJsApi.esri.PointCloudValueFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersPointCloudFiltersPointCloudValueFilterMod extends Shortcut {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudValueFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudValueFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/pointCloudFilters/PointCloudValueFilter", JSImport.Namespace)
  @js.native
  /**
    * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
    */
  open class Class ()
    extends StObject
       with PointCloudValueFilter {
    def this(properties: PointCloudValueFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudValueFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersPointCloudFiltersPointCloudValueFilterMod.foo` */
  override def _to: js.Object & PointCloudValueFilterConstructor = ^
}
