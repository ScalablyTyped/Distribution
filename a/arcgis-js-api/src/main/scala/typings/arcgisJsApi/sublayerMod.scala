package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Sublayer
import typings.arcgisJsApi.esri.SublayerConstructor
import typings.arcgisJsApi.esri.SublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/Sublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Sublayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a sublayer in a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or a [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html)
    */
  open class Class ()
    extends StObject
       with Sublayer {
    def this(properties: SublayerProperties) = this()
  }
  
  type _To = js.Object & SublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sublayerMod.foo` */
  override def _to: js.Object & SublayerConstructor = ^
}
