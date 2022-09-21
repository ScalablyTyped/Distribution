package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.identify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifyMod extends Shortcut {
  
  @JSImport("esri/rest/identify", JSImport.Namespace)
  @js.native
  val ^ : identify = js.native
  
  type _To = identify
  
  /* This means you don't have to write `^`, but can instead just say `identifyMod.foo` */
  override def _to: identify = ^
}
