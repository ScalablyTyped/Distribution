package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageMediaInfo
import typings.arcgisJsApi.esri.ImageMediaInfoConstructor
import typings.arcgisJsApi.esri.ImageMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentImageMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/ImageMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/ImageMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * An `ImageMediaInfo` is a type of media element that represents images to display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html)
    */
  open class Class ()
    extends StObject
       with ImageMediaInfo {
    def this(properties: ImageMediaInfoProperties) = this()
    
    /**
      * Provides an alternate text for an image if the image cannot be displayed.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#altText)
      */
    /* CompleteClass */
    var altText: String = js.native
    
    /**
      * Defines a caption for the media.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
      */
    /* CompleteClass */
    var caption: String = js.native
    
    /**
      * The title of the media element.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
      */
    /* CompleteClass */
    var title: String = js.native
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentImageMediaInfoMod.foo` */
  override def _to: js.Object & ImageMediaInfoConstructor = ^
}
