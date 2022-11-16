package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RelatedRecordsInfo
import typings.arcgisJsApi.esri.RelatedRecordsInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupRelatedRecordsInfoMod {
  
  @JSImport("esri/popup/RelatedRecordsInfo", JSImport.Namespace)
  @js.native
  /**
    * The `RelatedRecordsInfo` class provides additional sorting options when working with related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html)
    */
  open class ^ ()
    extends StObject
       with RelatedRecordsInfo {
    def this(properties: RelatedRecordsInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/RelatedRecordsInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RelatedRecordsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RelatedRecordsInfo]
}
