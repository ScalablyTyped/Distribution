package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationSampler
import typings.arcgisJsApi.esri.ElevationSamplerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elevationSamplerMod extends Shortcut {
  
  @JSImport("esri/layers/support/ElevationSampler", JSImport.Namespace)
  @js.native
  val ^ : ElevationSamplerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/ElevationSampler", JSImport.Namespace)
  @js.native
  /**
    * A cache of elevation values created from an elevation service or the [GroundView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html) used for synchronously querying elevation information for geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html)
    */
  class Class () extends ElevationSampler
  
  type _To = ElevationSamplerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elevationSamplerMod.foo` */
  override def _to: ElevationSamplerConstructor = ^
}
