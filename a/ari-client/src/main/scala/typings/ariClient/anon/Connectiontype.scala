package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connectiontype extends StObject {
  
  var app: String = js.native
  
  var channelId: js.UndefOr[String] = js.native
  
  var connection_type: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var encapsulation: js.UndefOr[String] = js.native
  
  var external_host: String = js.native
  
  var format: String = js.native
  
  var transport: js.UndefOr[String] = js.native
  
  var variables: js.UndefOr[Containers] = js.native
}
object Connectiontype {
  
  @scala.inline
  def apply(app: String, external_host: String, format: String): Connectiontype = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], external_host = external_host.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connectiontype]
  }
  
  @scala.inline
  implicit class ConnectiontypeMutableBuilder[Self <: Connectiontype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setConnection_type(value: String): Self = StObject.set(x, "connection_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_typeUndefined: Self = StObject.set(x, "connection_type", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEncapsulation(value: String): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    @scala.inline
    def setExternal_host(value: String): Self = StObject.set(x, "external_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    @scala.inline
    def setVariables(value: Containers): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
