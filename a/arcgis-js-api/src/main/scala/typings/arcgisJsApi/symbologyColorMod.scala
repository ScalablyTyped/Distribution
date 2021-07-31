package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.symbologyColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbologyColorMod extends Shortcut {
  
  @JSImport("esri/smartMapping/symbology/color", JSImport.Namespace)
  @js.native
  val ^ : symbologyColor = js.native
  
  type _To = symbologyColor
  
  /* This means you don't have to write `^`, but can instead just say `symbologyColorMod.foo` */
  override def _to: symbologyColor = ^
}
