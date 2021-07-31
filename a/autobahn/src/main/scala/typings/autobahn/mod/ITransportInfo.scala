package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransportInfo extends StObject {
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var `type`: TransportType
  
  var url: js.UndefOr[String] = js.undefined
}
object ITransportInfo {
  
  @scala.inline
  def apply(`type`: TransportType): ITransportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportInfo]
  }
  
  @scala.inline
  implicit class ITransportInfoMutableBuilder[Self <: ITransportInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setType(value: TransportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
