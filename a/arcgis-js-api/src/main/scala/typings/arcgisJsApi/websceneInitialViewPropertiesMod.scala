package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.websceneInitialViewProperties
import typings.arcgisJsApi.esri.websceneInitialViewPropertiesConstructor
import typings.arcgisJsApi.esri.websceneInitialViewPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websceneInitialViewPropertiesMod extends Shortcut {
  
  @JSImport("esri/webscene/InitialViewProperties", JSImport.Namespace)
  @js.native
  val ^ : websceneInitialViewPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/InitialViewProperties", JSImport.Namespace)
  @js.native
  class Class () extends websceneInitialViewProperties {
    def this(properties: websceneInitialViewPropertiesProperties) = this()
  }
  
  type _To = websceneInitialViewPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `websceneInitialViewPropertiesMod.foo` */
  override def _to: websceneInitialViewPropertiesConstructor = ^
}
