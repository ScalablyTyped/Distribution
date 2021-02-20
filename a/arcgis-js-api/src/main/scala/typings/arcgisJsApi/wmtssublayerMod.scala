package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WMTSSublayer
import typings.arcgisJsApi.esri.WMTSSublayerConstructor
import typings.arcgisJsApi.esri.WMTSSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmtssublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/WMTSSublayer", JSImport.Namespace)
  @js.native
  val ^ : WMTSSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/WMTSSublayer", JSImport.Namespace)
  @js.native
  class Class () extends WMTSSublayer {
    def this(properties: WMTSSublayerProperties) = this()
  }
  
  type _To = WMTSSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wmtssublayerMod.foo` */
  override def _to: WMTSSublayerConstructor = ^
}
