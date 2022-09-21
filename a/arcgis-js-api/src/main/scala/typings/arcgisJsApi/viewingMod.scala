package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Viewing
import typings.arcgisJsApi.esri.ViewingConstructor
import typings.arcgisJsApi.esri.ViewingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewingMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/Viewing", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ViewingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/Viewing", JSImport.Namespace)
  @js.native
  /**
    * Represents view-specific properties of application and UI elements for the web map or web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Viewing.html)
    */
  open class Class ()
    extends StObject
       with Viewing {
    def this(properties: ViewingProperties) = this()
  }
  
  type _To = js.Object & ViewingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `viewingMod.foo` */
  override def _to: js.Object & ViewingConstructor = ^
}
