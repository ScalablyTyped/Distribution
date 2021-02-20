package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LegendLayer
import typings.arcgisJsApi.esri.LegendLayerConstructor
import typings.arcgisJsApi.esri.LegendLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendLayerMod extends Shortcut {
  
  @JSImport("esri/tasks/support/LegendLayer", JSImport.Namespace)
  @js.native
  val ^ : LegendLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/LegendLayer", JSImport.Namespace)
  @js.native
  class Class () extends LegendLayer {
    def this(properties: LegendLayerProperties) = this()
  }
  
  type _To = LegendLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `legendLayerMod.foo` */
  override def _to: LegendLayerConstructor = ^
}
