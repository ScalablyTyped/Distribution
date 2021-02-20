package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorStop
import typings.arcgisJsApi.esri.ColorStopConstructor
import typings.arcgisJsApi.esri.ColorStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorStopMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/support/ColorStop", JSImport.Namespace)
  @js.native
  val ^ : ColorStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/support/ColorStop", JSImport.Namespace)
  @js.native
  class Class () extends ColorStop {
    def this(properties: ColorStopProperties) = this()
  }
  
  type _To = ColorStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorStopMod.foo` */
  override def _to: ColorStopConstructor = ^
}
