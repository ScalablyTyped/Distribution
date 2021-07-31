package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opacityMod extends Shortcut {
  
  @JSImport("esri/smartMapping/renderers/opacity", JSImport.Namespace)
  @js.native
  val ^ : opacity = js.native
  
  type _To = opacity
  
  /* This means you don't have to write `^`, but can instead just say `opacityMod.foo` */
  override def _to: opacity = ^
}
