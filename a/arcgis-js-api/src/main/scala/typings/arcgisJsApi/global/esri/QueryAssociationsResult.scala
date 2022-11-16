package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.QueryAssociationsResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.QueryAssociationsResult")
@js.native
/**
  * Defines the results of the [queryAssociations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-queryAssociations.html) function which takes in [QueryAssociationsParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html) and returns an [QueryAssociationsResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsResult.html) of all [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) filtered by the parameters set.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsResult.html)
  */
open class QueryAssociationsResult ()
  extends StObject
     with typings.arcgisJsApi.esri.QueryAssociationsResult {
  def this(properties: QueryAssociationsResultProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object QueryAssociationsResult {
  
  @JSGlobal("__esri.QueryAssociationsResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.QueryAssociationsResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.QueryAssociationsResult]
}
