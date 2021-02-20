package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudFilter
import typings.arcgisJsApi.esri.PointCloudFilterConstructor
import typings.arcgisJsApi.esri.PointCloudFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudFilterMod extends Shortcut {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
  @js.native
  val ^ : PointCloudFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/pointCloudFilters/PointCloudFilter", JSImport.Namespace)
  @js.native
  /**
    * Point cloud filters are used to hide points that do not satisfy the filter criteria.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html)
    */
  class Class () extends PointCloudFilter {
    def this(properties: PointCloudFilterProperties) = this()
  }
  
  type _To = PointCloudFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudFilterMod.foo` */
  override def _to: PointCloudFilterConstructor = ^
}
