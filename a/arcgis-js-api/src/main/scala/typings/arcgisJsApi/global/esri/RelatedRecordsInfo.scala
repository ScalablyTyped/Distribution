package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelatedRecordsInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RelatedRecordsInfo")
@js.native
/**
  * The `RelatedRecordsInfo` class provides additional sorting options when working with related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html)
  */
open class RelatedRecordsInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.RelatedRecordsInfo {
  def this(properties: RelatedRecordsInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RelatedRecordsInfo {
  
  @JSGlobal("__esri.RelatedRecordsInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelatedRecordsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelatedRecordsInfo]
}
