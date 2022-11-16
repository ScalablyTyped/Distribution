package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.attachment
import typings.arcgisJsApi.arcgisJsApiStrings.connectivity
import typings.arcgisJsApi.arcgisJsApiStrings.containment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Association
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The type of association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#associationType)
    */
  var associationType: attachment | connectivity | containment = js.native
  
  /**
    * Error code returned from the server for a failed associations query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#errorCode)
    */
  var errorCode: Double = js.native
  
  /**
    * Message returned from the server for a failed associations query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#errorMessage)
    */
  var errorMessage: String = js.native
  
  /**
    * The from side network element of the association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#fromNetworkElement)
    */
  var fromNetworkElement: NetworkElement = js.native
  
  /**
    * The globalId (UUID) of the association record, uniquely identifes this association row.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#globalId)
    */
  var globalId: String = js.native
  
  /**
    * Specifies the content visibility on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#isContentVisible)
    */
  var isContentVisible: Boolean = js.native
  
  /**
    * The synthesized [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry created between the two network elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#line)
    */
  var line: Polyline = js.native
  
  /**
    * This double parameter of value of 0-1 indicates a percentage along the line of where the trace location is placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#percentAlong)
    */
  var percentAlong: Double = js.native
  
  /**
    * Indicates the type of association a feature or object participates in, the role the network feature plays in the association relationship, and any properties that are set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#status)
    */
  var status: Double = js.native
  
  /**
    * The to side network element of the association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#toNetworkElement)
    */
  var toNetworkElement: NetworkElement = js.native
}
