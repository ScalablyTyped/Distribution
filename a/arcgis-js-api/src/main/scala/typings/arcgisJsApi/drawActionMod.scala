package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DrawAction
import typings.arcgisJsApi.esri.DrawActionConstructor
import typings.arcgisJsApi.esri.DrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/DrawAction", JSImport.Namespace)
  @js.native
  val ^ : DrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/DrawAction", JSImport.Namespace)
  @js.native
  /**
    * DrawAction is the base class for all draw actions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html)
    */
  class Class () extends DrawAction {
    def this(properties: DrawActionProperties) = this()
  }
  
  type _To = DrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `drawActionMod.foo` */
  override def _to: DrawActionConstructor = ^
}
