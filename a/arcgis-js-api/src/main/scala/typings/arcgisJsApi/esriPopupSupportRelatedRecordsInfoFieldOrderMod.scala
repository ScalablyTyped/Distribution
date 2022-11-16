package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrder
import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupSupportRelatedRecordsInfoFieldOrderMod {
  
  @JSImport("esri/popup/support/RelatedRecordsInfoFieldOrder", JSImport.Namespace)
  @js.native
  /**
    * The `RelatedRecordsInfoFieldOrder` class indicates the field display order for the related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html)
    */
  open class ^ ()
    extends StObject
       with RelatedRecordsInfoFieldOrder {
    def this(properties: RelatedRecordsInfoFieldOrderProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/support/RelatedRecordsInfoFieldOrder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RelatedRecordsInfoFieldOrder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RelatedRecordsInfoFieldOrder]
}
