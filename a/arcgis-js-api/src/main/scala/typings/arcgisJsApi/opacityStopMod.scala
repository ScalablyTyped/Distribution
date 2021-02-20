package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OpacityStop
import typings.arcgisJsApi.esri.OpacityStopConstructor
import typings.arcgisJsApi.esri.OpacityStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opacityStopMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/support/OpacityStop", JSImport.Namespace)
  @js.native
  val ^ : OpacityStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/support/OpacityStop", JSImport.Namespace)
  @js.native
  class Class () extends OpacityStop {
    def this(properties: OpacityStopProperties) = this()
  }
  
  type _To = OpacityStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `opacityStopMod.foo` */
  override def _to: OpacityStopConstructor = ^
}
