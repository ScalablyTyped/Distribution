package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PopupTemplate
import typings.arcgisJsApi.esri.PopupTemplateConstructor
import typings.arcgisJsApi.esri.PopupTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupTemplateMod extends Shortcut {
  
  @JSImport("esri/PopupTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PopupTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/PopupTemplate", JSImport.Namespace)
  @js.native
  /**
    * A PopupTemplate formats and defines the content of a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html)
    */
  open class Class ()
    extends StObject
       with PopupTemplate {
    def this(properties: PopupTemplateProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PopupTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupTemplateMod.foo` */
  override def _to: js.Object & PopupTemplateConstructor = ^
}
