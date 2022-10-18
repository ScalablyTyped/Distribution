package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MediaContent
import typings.arcgisJsApi.esri.MediaContentConstructor
import typings.arcgisJsApi.esri.MediaContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentMediaContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/MediaContent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MediaContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/MediaContent", JSImport.Namespace)
  @js.native
  /**
    * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
    */
  open class Class ()
    extends StObject
       with MediaContent {
    def this(properties: MediaContentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & MediaContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentMediaContentMod.foo` */
  override def _to: js.Object & MediaContentConstructor = ^
}
