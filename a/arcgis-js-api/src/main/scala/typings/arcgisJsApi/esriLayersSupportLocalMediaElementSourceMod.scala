package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LocalMediaElementSource
import typings.arcgisJsApi.esri.LocalMediaElementSourceConstructor
import typings.arcgisJsApi.esri.LocalMediaElementSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportLocalMediaElementSourceMod extends Shortcut {
  
  @JSImport("esri/layers/support/LocalMediaElementSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LocalMediaElementSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/LocalMediaElementSource", JSImport.Namespace)
  @js.native
  /**
    * The LocalMediaElementSource is the default [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source) for the MediaLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LocalMediaElementSource.html)
    */
  open class Class ()
    extends StObject
       with LocalMediaElementSource {
    def this(properties: LocalMediaElementSourceProperties) = this()
  }
  
  type _To = js.Object & LocalMediaElementSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportLocalMediaElementSourceMod.foo` */
  override def _to: js.Object & LocalMediaElementSourceConstructor = ^
}
