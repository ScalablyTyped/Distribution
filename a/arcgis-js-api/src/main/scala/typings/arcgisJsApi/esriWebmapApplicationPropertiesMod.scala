package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ApplicationProperties
import typings.arcgisJsApi.esri.ApplicationPropertiesConstructor
import typings.arcgisJsApi.esri.ApplicationPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebmapApplicationPropertiesMod extends Shortcut {
  
  @JSImport("esri/webmap/ApplicationProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ApplicationPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/ApplicationProperties", JSImport.Namespace)
  @js.native
  /**
    * Represents configuration of application and UI elements of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-ApplicationProperties.html)
    */
  open class Class ()
    extends StObject
       with ApplicationProperties {
    def this(properties: ApplicationPropertiesProperties) = this()
  }
  
  type _To = js.Object & ApplicationPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebmapApplicationPropertiesMod.foo` */
  override def _to: js.Object & ApplicationPropertiesConstructor = ^
}
