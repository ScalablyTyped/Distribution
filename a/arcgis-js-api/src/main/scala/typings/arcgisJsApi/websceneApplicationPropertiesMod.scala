package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.websceneApplicationProperties
import typings.arcgisJsApi.esri.websceneApplicationPropertiesConstructor
import typings.arcgisJsApi.esri.websceneApplicationPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websceneApplicationPropertiesMod extends Shortcut {
  
  @JSImport("esri/webscene/ApplicationProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Object & websceneApplicationPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/ApplicationProperties", JSImport.Namespace)
  @js.native
  /**
    * Represents configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-ApplicationProperties.html)
    */
  open class Class ()
    extends StObject
       with websceneApplicationProperties {
    def this(properties: websceneApplicationPropertiesProperties) = this()
  }
  
  type _To = js.Object & websceneApplicationPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `websceneApplicationPropertiesMod.foo` */
  override def _to: js.Object & websceneApplicationPropertiesConstructor = ^
}
