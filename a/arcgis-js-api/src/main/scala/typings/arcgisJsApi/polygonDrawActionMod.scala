package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PolygonDrawAction
import typings.arcgisJsApi.esri.PolygonDrawActionConstructor
import typings.arcgisJsApi.esri.PolygonDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/PolygonDrawAction", JSImport.Namespace)
  @js.native
  val ^ : PolygonDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/PolygonDrawAction", JSImport.Namespace)
  @js.native
  class Class () extends PolygonDrawAction {
    def this(properties: PolygonDrawActionProperties) = this()
  }
  
  type _To = PolygonDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polygonDrawActionMod.foo` */
  override def _to: PolygonDrawActionConstructor = ^
}
