package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchLayer
import typings.arcgisJsApi.esri.SearchLayerConstructor
import typings.arcgisJsApi.esri.SearchLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchLayerMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/SearchLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/SearchLayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a layer to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html)
    */
  open class Class ()
    extends StObject
       with SearchLayer {
    def this(properties: SearchLayerProperties) = this()
  }
  
  type _To = js.Object & SearchLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocApplicationPropertiesSearchLayerMod.foo` */
  override def _to: js.Object & SearchLayerConstructor = ^
}
