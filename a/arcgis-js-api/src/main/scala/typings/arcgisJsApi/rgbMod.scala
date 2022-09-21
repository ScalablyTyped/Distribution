package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbMod extends Shortcut {
  
  @JSImport("esri/smartMapping/raster/renderers/rgb", JSImport.Namespace)
  @js.native
  val ^ : rgb = js.native
  
  type _To = rgb
  
  /* This means you don't have to write `^`, but can instead just say `rgbMod.foo` */
  override def _to: rgb = ^
}
