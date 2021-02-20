package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WMTSStyle
import typings.arcgisJsApi.esri.WMTSStyleConstructor
import typings.arcgisJsApi.esri.WMTSStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmtsstyleMod extends Shortcut {
  
  @JSImport("esri/layers/support/WMTSStyle", JSImport.Namespace)
  @js.native
  val ^ : WMTSStyleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/WMTSStyle", JSImport.Namespace)
  @js.native
  class Class () extends WMTSStyle {
    def this(properties: WMTSStyleProperties) = this()
  }
  
  type _To = WMTSStyleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wmtsstyleMod.foo` */
  override def _to: WMTSStyleConstructor = ^
}
