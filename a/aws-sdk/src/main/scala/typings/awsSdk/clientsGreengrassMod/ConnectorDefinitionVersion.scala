package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorDefinitionVersion extends StObject {
  
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[listOfConnector] = js.undefined
}
object ConnectorDefinitionVersion {
  
  inline def apply(): ConnectorDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorDefinitionVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorDefinitionVersion] (val x: Self) extends AnyVal {
    
    inline def setConnectors(value: listOfConnector): Self = StObject.set(x, "Connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "Connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: Connector*): Self = StObject.set(x, "Connectors", js.Array(value*))
  }
}
