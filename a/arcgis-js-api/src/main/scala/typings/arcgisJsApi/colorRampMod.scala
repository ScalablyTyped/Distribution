package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorRamp
import typings.arcgisJsApi.esri.ColorRampConstructor
import typings.arcgisJsApi.esri.ColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorRampMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ColorRamp", JSImport.Namespace)
  @js.native
  val ^ : ColorRampConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ColorRamp", JSImport.Namespace)
  @js.native
  /**
    * A ColorRamp object is used to specify a range of colors that are applied to a group of symbols or pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html)
    */
  class Class () extends ColorRamp {
    def this(properties: ColorRampProperties) = this()
  }
  
  type _To = ColorRampConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorRampMod.foo` */
  override def _to: ColorRampConstructor = ^
}
