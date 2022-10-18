package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSNfsExport extends StObject {
  
  /**
    * A list of configuration objects that contain the client and options for mounting the OpenZFS file system. 
    */
  var ClientConfigurations: OpenZFSClientConfigurations
}
object OpenZFSNfsExport {
  
  inline def apply(ClientConfigurations: OpenZFSClientConfigurations): OpenZFSNfsExport = {
    val __obj = js.Dynamic.literal(ClientConfigurations = ClientConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenZFSNfsExport]
  }
  
  extension [Self <: OpenZFSNfsExport](x: Self) {
    
    inline def setClientConfigurations(value: OpenZFSClientConfigurations): Self = StObject.set(x, "ClientConfigurations", value.asInstanceOf[js.Any])
    
    inline def setClientConfigurationsVarargs(value: OpenZFSClientConfiguration*): Self = StObject.set(x, "ClientConfigurations", js.Array(value*))
  }
}
