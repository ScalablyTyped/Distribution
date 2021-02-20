package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.backgroundColorBackground
import typings.arcgisJsApi.esri.backgroundColorBackgroundConstructor
import typings.arcgisJsApi.esri.backgroundColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundColorBackgroundMod extends Shortcut {
  
  @JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
  @js.native
  val ^ : backgroundColorBackgroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
  @js.native
  /**
    * This type of [Background](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html) allows to set a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) as the background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html)
    */
  class Class () extends backgroundColorBackground {
    def this(properties: backgroundColorBackgroundProperties) = this()
  }
  
  type _To = backgroundColorBackgroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `backgroundColorBackgroundMod.foo` */
  override def _to: backgroundColorBackgroundConstructor = ^
}
