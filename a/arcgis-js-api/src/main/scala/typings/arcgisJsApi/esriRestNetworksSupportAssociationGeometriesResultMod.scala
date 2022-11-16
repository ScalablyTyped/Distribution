package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AssociationGeometriesResult
import typings.arcgisJsApi.esri.AssociationGeometriesResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportAssociationGeometriesResultMod {
  
  @JSImport("esri/rest/networks/support/AssociationGeometriesResult", JSImport.Namespace)
  @js.native
  /**
    * This class defines the results of the function [synthesizeAssociationGeometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-synthesizeAssociationGeometries.html) which takes an extent and returns an [AggregatedGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html) of all [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) within the extent based on the defined parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html)
    */
  open class ^ ()
    extends StObject
       with AssociationGeometriesResult {
    def this(properties: AssociationGeometriesResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/AssociationGeometriesResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AssociationGeometriesResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AssociationGeometriesResult]
}
