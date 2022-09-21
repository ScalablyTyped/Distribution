package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.OutStatisticProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.OutStatistic")
@js.native
/**
  * Defines the layer field and statistic used to aggregate data in that field for use in an [AggregateField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-OutStatistic.html)
  */
open class OutStatisticCls ()
  extends StObject
     with typings.arcgisJsApi.esri.OutStatistic {
  def this(properties: OutStatisticProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
