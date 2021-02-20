package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Background
import typings.arcgisJsApi.esri.BackgroundConstructor
import typings.arcgisJsApi.esri.BackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundMod extends Shortcut {
  
  @JSImport("esri/webscene/background/Background", JSImport.Namespace)
  @js.native
  val ^ : BackgroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/background/Background", JSImport.Namespace)
  @js.native
  /**
    * The background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) that lies behind the sky, atmosphere and stars.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html)
    */
  class Class () extends Background {
    def this(properties: BackgroundProperties) = this()
  }
  
  type _To = BackgroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `backgroundMod.foo` */
  override def _to: BackgroundConstructor = ^
}
