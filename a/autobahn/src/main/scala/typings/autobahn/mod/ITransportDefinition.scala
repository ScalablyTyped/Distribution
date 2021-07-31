package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransportDefinition extends StObject {
  
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: TransportType
  
  var url: js.UndefOr[String] = js.undefined
}
object ITransportDefinition {
  
  @scala.inline
  def apply(`type`: TransportType): ITransportDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportDefinition]
  }
  
  @scala.inline
  implicit class ITransportDefinitionMutableBuilder[Self <: ITransportDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TransportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
