package typings.arcgisJsApi

import typings.arcgisJsApi.esri.QueryAssociationsParameters
import typings.arcgisJsApi.esri.QueryAssociationsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportQueryAssociationsParametersMod {
  
  @JSImport("esri/rest/networks/support/QueryAssociationsParameters", JSImport.Namespace)
  @js.native
  /**
  		 * QueryAssociationsParameters describes the parameters required to execute the [queryAssociations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-queryAssociations.html) function, which returns a list of [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) filtered by the parameters set.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with QueryAssociationsParameters {
    def this(properties: QueryAssociationsParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/QueryAssociationsParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): QueryAssociationsParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[QueryAssociationsParameters]
}
