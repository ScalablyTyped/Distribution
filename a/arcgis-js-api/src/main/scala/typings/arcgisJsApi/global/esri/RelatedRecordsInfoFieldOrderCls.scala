package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.RelatedRecordsInfoFieldOrder")
@js.native
/**
  * The `RelatedRecordsInfoFieldOrder` class indicates the field display order for the related records in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html)
  */
open class RelatedRecordsInfoFieldOrderCls ()
  extends StObject
     with typings.arcgisJsApi.esri.RelatedRecordsInfoFieldOrder {
  def this(properties: RelatedRecordsInfoFieldOrderProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
