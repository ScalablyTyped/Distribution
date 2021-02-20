package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureFilter
import typings.arcgisJsApi.esri.FeatureFilterConstructor
import typings.arcgisJsApi.esri.FeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureFilterMod extends Shortcut {
  
  @JSImport("esri/views/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  val ^ : FeatureFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for setting a client-side filter on a [layer view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html)
    */
  class Class () extends FeatureFilter {
    def this(properties: FeatureFilterProperties) = this()
  }
  
  type _To = FeatureFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureFilterMod.foo` */
  override def _to: FeatureFilterConstructor = ^
}
