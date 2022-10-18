package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UnknownLayer
import typings.arcgisJsApi.esri.UnknownLayerConstructor
import typings.arcgisJsApi.esri.UnknownLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersUnknownLayerMod extends Shortcut {
  
  @JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UnknownLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a layer whose type could not be determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-UnknownLayer.html)
    */
  open class Class ()
    extends StObject
       with UnknownLayer {
    def this(properties: UnknownLayerProperties) = this()
  }
  
  type _To = js.Object & UnknownLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersUnknownLayerMod.foo` */
  override def _to: js.Object & UnknownLayerConstructor = ^
}
