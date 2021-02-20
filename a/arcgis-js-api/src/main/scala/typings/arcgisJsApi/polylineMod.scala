package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Polyline
import typings.arcgisJsApi.esri.PolylineConstructor
import typings.arcgisJsApi.esri.PolylineProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod extends Shortcut {
  
  @JSImport("esri/geometry/Polyline", JSImport.Namespace)
  @js.native
  val ^ : PolylineConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Polyline", JSImport.Namespace)
  @js.native
  class Class () extends Polyline {
    def this(properties: PolylineProperties) = this()
  }
  
  type _To = PolylineConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polylineMod.foo` */
  override def _to: PolylineConstructor = ^
}
