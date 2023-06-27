package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkElement
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The asset group code that this network element represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#assetGroupCode)
  		 */
  var assetGroupCode: Double = js.native
  
  /**
  		 * The asset type code discriminator this network element represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#assetTypeCode)
  		 */
  var assetTypeCode: Double = js.native
  
  /**
  		 * The globalId of the feature the network element belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#globalId)
  		 */
  var globalId: String = js.native
  
  /**
  		 * The network source Id of the feature the network element belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#networkSourceId)
  		 */
  var networkSourceId: Double = js.native
  
  /**
  		 * The objectId of the feature the network element belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#objectId)
  		 */
  var objectId: Double = js.native
  
  /**
  		 * Applicable to edge elements, represents a double value (0 to 1) where this edge element starts.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#positionFrom)
  		 */
  var positionFrom: Double = js.native
  
  /**
  		 * Applicable to edge elements, represents a double value (0 to 1) where this edge element ends.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#positionTo)
  		 */
  var positionTo: Double = js.native
  
  /**
  		 * The terminal id defined at the network element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#terminalId)
  		 */
  var terminalId: Double = js.native
}
