package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MediaInfo
import typings.arcgisJsApi.esri.MediaInfoConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentMixinsMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/mixins/MediaInfo", JSImport.Namespace)
  @js.native
  val ^ : MediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/mixins/MediaInfo", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with MediaInfo {
    
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
  }
  
  type _To = MediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentMixinsMediaInfoMod.foo` */
  override def _to: MediaInfoConstructor = ^
}
