package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeExporter extends StObject {
  
  /**
    * 
    Indicates whether you want to turn on or turn off the Node Exporter.
    
    */
  var EnabledInBroker: boolean
}
object NodeExporter {
  
  inline def apply(EnabledInBroker: boolean): NodeExporter = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeExporter]
  }
  
  extension [Self <: NodeExporter](x: Self) {
    
    inline def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
