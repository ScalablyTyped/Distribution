package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointDrawAction
import typings.arcgisJsApi.esri.PointDrawActionConstructor
import typings.arcgisJsApi.esri.PointDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/PointDrawAction", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/PointDrawAction", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with PointDrawAction {
    def this(properties: PointDrawActionProperties) = this()
  }
  
  type _To = js.Object & PointDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointDrawActionMod.foo` */
  override def _to: js.Object & PointDrawActionConstructor = ^
}
