package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudFilter
import typings.arcgisJsApi.esri.PointCloudFilterConstructor
import typings.arcgisJsApi.esri.PointCloudFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersPointCloudFiltersPointCloudFilterMod extends Shortcut {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
  @js.native
  /**
    * Point cloud filters are used to hide points that do not satisfy the filter criteria.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html)
    */
  open class Class ()
    extends StObject
       with PointCloudFilter {
    def this(properties: PointCloudFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersPointCloudFiltersPointCloudFilterMod.foo` */
  override def _to: js.Object & PointCloudFilterConstructor = ^
}
