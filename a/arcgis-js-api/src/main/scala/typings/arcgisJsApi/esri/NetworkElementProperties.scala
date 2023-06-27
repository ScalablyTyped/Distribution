package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkElementProperties extends StObject {
  
  /**
  		 * The asset group code that this network element represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#assetGroupCode)
  		 */
  var assetGroupCode: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The asset type code discriminator this network element represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#assetTypeCode)
  		 */
  var assetTypeCode: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The globalId of the feature the network element belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#globalId)
  		 */
  var globalId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The network source Id of the feature the network element belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#networkSourceId)
  		 */
  var networkSourceId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The objectId of the feature the network element belongs to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#objectId)
  		 */
  var objectId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Applicable to edge elements, represents a double value (0 to 1) where this edge element starts.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#positionFrom)
  		 */
  var positionFrom: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Applicable to edge elements, represents a double value (0 to 1) where this edge element ends.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#positionTo)
  		 */
  var positionTo: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The terminal id defined at the network element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html#terminalId)
  		 */
  var terminalId: js.UndefOr[Double] = js.undefined
}
object NetworkElementProperties {
  
  inline def apply(): NetworkElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkElementProperties] (val x: Self) extends AnyVal {
    
    inline def setAssetGroupCode(value: Double): Self = StObject.set(x, "assetGroupCode", value.asInstanceOf[js.Any])
    
    inline def setAssetGroupCodeUndefined: Self = StObject.set(x, "assetGroupCode", js.undefined)
    
    inline def setAssetTypeCode(value: Double): Self = StObject.set(x, "assetTypeCode", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeCodeUndefined: Self = StObject.set(x, "assetTypeCode", js.undefined)
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdUndefined: Self = StObject.set(x, "globalId", js.undefined)
    
    inline def setNetworkSourceId(value: Double): Self = StObject.set(x, "networkSourceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceIdUndefined: Self = StObject.set(x, "networkSourceId", js.undefined)
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPositionFrom(value: Double): Self = StObject.set(x, "positionFrom", value.asInstanceOf[js.Any])
    
    inline def setPositionFromUndefined: Self = StObject.set(x, "positionFrom", js.undefined)
    
    inline def setPositionTo(value: Double): Self = StObject.set(x, "positionTo", value.asInstanceOf[js.Any])
    
    inline def setPositionToUndefined: Self = StObject.set(x, "positionTo", js.undefined)
    
    inline def setTerminalId(value: Double): Self = StObject.set(x, "terminalId", value.asInstanceOf[js.Any])
    
    inline def setTerminalIdUndefined: Self = StObject.set(x, "terminalId", js.undefined)
  }
}
