package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ContentConstructor
import typings.arcgisJsApi.esri.ContentProperties
import typings.arcgisJsApi.esri.Content_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/Content", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/Content", JSImport.Namespace)
  @js.native
  /**
    * Content elements define what should display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html)
    */
  open class Class ()
    extends StObject
       with Content_ {
    def this(properties: ContentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `contentContentMod.foo` */
  override def _to: js.Object & ContentConstructor = ^
}
