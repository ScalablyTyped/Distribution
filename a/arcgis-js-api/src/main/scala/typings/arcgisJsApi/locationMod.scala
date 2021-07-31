package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationMod extends Shortcut {
  
  @JSImport("esri/smartMapping/renderers/location", JSImport.Namespace)
  @js.native
  val ^ : location = js.native
  
  type _To = location
  
  /* This means you don't have to write `^`, but can instead just say `locationMod.foo` */
  override def _to: location = ^
}
