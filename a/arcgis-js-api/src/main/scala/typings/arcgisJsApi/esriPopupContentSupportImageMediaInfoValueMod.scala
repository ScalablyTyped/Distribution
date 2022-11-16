package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageMediaInfoValue
import typings.arcgisJsApi.esri.ImageMediaInfoValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupContentSupportImageMediaInfoValueMod {
  
  @JSImport("esri/popup/content/support/ImageMediaInfoValue", JSImport.Namespace)
  @js.native
  /**
    * The `ImageMediaInfoValue` class contains information for popups regarding how images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html)
    */
  open class ^ ()
    extends StObject
       with ImageMediaInfoValue {
    def this(properties: ImageMediaInfoValueProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/content/support/ImageMediaInfoValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageMediaInfoValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageMediaInfoValue]
}
