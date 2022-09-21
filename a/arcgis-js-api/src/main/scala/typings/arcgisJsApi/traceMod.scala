package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.trace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod extends Shortcut {
  
  @JSImport("esri/rest/networks/trace", JSImport.Namespace)
  @js.native
  val ^ : trace = js.native
  
  type _To = trace
  
  /* This means you don't have to write `^`, but can instead just say `traceMod.foo` */
  override def _to: trace = ^
}
