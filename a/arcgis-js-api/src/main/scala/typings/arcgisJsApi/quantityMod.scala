package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.quantity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantityMod extends Shortcut {
  
  @JSImport("esri/core/quantity", JSImport.Namespace)
  @js.native
  val ^ : quantity = js.native
  
  type _To = quantity
  
  /* This means you don't have to write `^`, but can instead just say `quantityMod.foo` */
  override def _to: quantity = ^
}
