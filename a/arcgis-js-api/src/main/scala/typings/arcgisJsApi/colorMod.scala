package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod extends Shortcut {
  
  @JSImport("esri/smartMapping/renderers/color", JSImport.Namespace)
  @js.native
  val ^ : color = js.native
  
  type _To = color
  
  /* This means you don't have to write `^`, but can instead just say `colorMod.foo` */
  override def _to: color = ^
}
