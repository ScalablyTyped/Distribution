package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudValueFilter
import typings.arcgisJsApi.esri.PointCloudValueFilterConstructor
import typings.arcgisJsApi.esri.PointCloudValueFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudValueFilterMod extends Shortcut {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudValueFilter", JSImport.Namespace)
  @js.native
  val ^ : PointCloudValueFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/pointCloudFilters/PointCloudValueFilter", JSImport.Namespace)
  @js.native
  /**
    * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
    */
  class Class () extends PointCloudValueFilter {
    def this(properties: PointCloudValueFilterProperties) = this()
  }
  
  type _To = PointCloudValueFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudValueFilterMod.foo` */
  override def _to: PointCloudValueFilterConstructor = ^
}
