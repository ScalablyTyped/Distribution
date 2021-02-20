package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SizeStop
import typings.arcgisJsApi.esri.SizeStopConstructor
import typings.arcgisJsApi.esri.SizeStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeStopMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/support/SizeStop", JSImport.Namespace)
  @js.native
  val ^ : SizeStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/support/SizeStop", JSImport.Namespace)
  @js.native
  class Class () extends SizeStop {
    def this(properties: SizeStopProperties) = this()
  }
  
  type _To = SizeStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sizeStopMod.foo` */
  override def _to: SizeStopConstructor = ^
}
