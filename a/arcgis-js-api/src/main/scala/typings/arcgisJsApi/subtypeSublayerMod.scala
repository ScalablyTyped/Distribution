package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SubtypeSublayer
import typings.arcgisJsApi.esri.SubtypeSublayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtypeSublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/SubtypeSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SubtypeSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SubtypeSublayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a sublayer in a [SubtypeGroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SubtypeSublayer.html)
    */
  open class Class ()
    extends StObject
       with SubtypeSublayer {
    def this(properties: Any) = this()
  }
  
  type _To = js.Object & SubtypeSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `subtypeSublayerMod.foo` */
  override def _to: js.Object & SubtypeSublayerConstructor = ^
}
