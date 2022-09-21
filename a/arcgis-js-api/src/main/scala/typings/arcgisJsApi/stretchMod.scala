package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stretchMod extends Shortcut {
  
  @JSImport("esri/smartMapping/raster/renderers/stretch", JSImport.Namespace)
  @js.native
  val ^ : stretch = js.native
  
  type _To = stretch
  
  /* This means you don't have to write `^`, but can instead just say `stretchMod.foo` */
  override def _to: stretch = ^
}
