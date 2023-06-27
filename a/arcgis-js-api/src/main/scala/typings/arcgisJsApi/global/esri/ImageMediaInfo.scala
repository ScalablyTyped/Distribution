package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageMediaInfo")
@js.native
/**
		 * An `ImageMediaInfo` is a type of media element that represents images to display within a popup.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html)
		 */
open class ImageMediaInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageMediaInfo {
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
/* static members */
object ImageMediaInfo {
  
  @JSGlobal("__esri.ImageMediaInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageMediaInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageMediaInfo]
}
