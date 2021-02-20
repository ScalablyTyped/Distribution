package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WMTSLayer
import typings.arcgisJsApi.esri.WMTSLayerConstructor
import typings.arcgisJsApi.esri.WMTSLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmtslayerMod extends Shortcut {
  
  @JSImport("esri/layers/WMTSLayer", JSImport.Namespace)
  @js.native
  val ^ : WMTSLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/WMTSLayer", JSImport.Namespace)
  @js.native
  class Class () extends WMTSLayer {
    def this(properties: WMTSLayerProperties) = this()
  }
  
  type _To = WMTSLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wmtslayerMod.foo` */
  override def _to: WMTSLayerConstructor = ^
}
