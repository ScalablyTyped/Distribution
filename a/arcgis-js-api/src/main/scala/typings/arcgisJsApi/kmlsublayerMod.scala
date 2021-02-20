package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.KMLSublayer
import typings.arcgisJsApi.esri.KMLSublayerConstructor
import typings.arcgisJsApi.esri.KMLSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmlsublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/KMLSublayer", JSImport.Namespace)
  @js.native
  val ^ : KMLSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/KMLSublayer", JSImport.Namespace)
  @js.native
  class Class () extends KMLSublayer {
    def this(properties: KMLSublayerProperties) = this()
  }
  
  type _To = KMLSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `kmlsublayerMod.foo` */
  override def _to: KMLSublayerConstructor = ^
}
