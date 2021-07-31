package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.heatmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapMod extends Shortcut {
  
  @JSImport("esri/smartMapping/renderers/heatmap", JSImport.Namespace)
  @js.native
  val ^ : heatmap = js.native
  
  type _To = heatmap
  
  /* This means you don't have to write `^`, but can instead just say `heatmapMod.foo` */
  override def _to: heatmap = ^
}
