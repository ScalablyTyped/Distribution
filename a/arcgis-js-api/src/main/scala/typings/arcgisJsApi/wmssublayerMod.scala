package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WMSSublayer
import typings.arcgisJsApi.esri.WMSSublayerConstructor
import typings.arcgisJsApi.esri.WMSSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmssublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/WMSSublayer", JSImport.Namespace)
  @js.native
  val ^ : WMSSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/WMSSublayer", JSImport.Namespace)
  @js.native
  class Class () extends WMSSublayer {
    def this(properties: WMSSublayerProperties) = this()
  }
  
  type _To = WMSSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wmssublayerMod.foo` */
  override def _to: WMSSublayerConstructor = ^
}
