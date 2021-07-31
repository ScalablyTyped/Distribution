package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encapsulation extends StObject {
  
  var app: String
  
  var connection_type: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var encapsulation: js.UndefOr[String] = js.undefined
  
  var external_host: String
  
  var format: String
  
  var transport: js.UndefOr[String] = js.undefined
  
  var variables: js.UndefOr[Containers] = js.undefined
}
object Encapsulation {
  
  @scala.inline
  def apply(app: String, external_host: String, format: String): Encapsulation = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], external_host = external_host.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encapsulation]
  }
  
  @scala.inline
  implicit class EncapsulationMutableBuilder[Self <: Encapsulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
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
