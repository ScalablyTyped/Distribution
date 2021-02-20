package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureReductionCluster
import typings.arcgisJsApi.esri.FeatureReductionClusterConstructor
import typings.arcgisJsApi.esri.FeatureReductionClusterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureReductionClusterMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureReductionCluster", JSImport.Namespace)
  @js.native
  val ^ : FeatureReductionClusterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureReductionCluster", JSImport.Namespace)
  @js.native
  /**
    * This class configures clustering as a means of reducing and summarizing point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) or [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html)
    */
  class Class () extends FeatureReductionCluster {
    def this(properties: FeatureReductionClusterProperties) = this()
  }
  
  type _To = FeatureReductionClusterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureReductionClusterMod.foo` */
  override def _to: FeatureReductionClusterConstructor = ^
}
