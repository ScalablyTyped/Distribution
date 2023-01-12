package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HsmConfigurationMessage extends StObject {
  
  /**
    * A list of HsmConfiguration objects.
    */
  var HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object HsmConfigurationMessage {
  
  inline def apply(): HsmConfigurationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmConfigurationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HsmConfigurationMessage] (val x: Self) extends AnyVal {
    
    inline def setHsmConfigurations(value: HsmConfigurationList): Self = StObject.set(x, "HsmConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHsmConfigurationsUndefined: Self = StObject.set(x, "HsmConfigurations", js.undefined)
    
    inline def setHsmConfigurationsVarargs(value: HsmConfiguration*): Self = StObject.set(x, "HsmConfigurations", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
