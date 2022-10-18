package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometryProjectionMod extends Shortcut {
  
  @JSImport("esri/geometry/projection", JSImport.Namespace)
  @js.native
  val ^ : projection = js.native
  
  type _To = projection
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometryProjectionMod.foo` */
  override def _to: projection = ^
}
