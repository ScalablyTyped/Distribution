package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanDbcDefinition extends StObject {
  
  /**
    * A list of DBC files. You can upload only one DBC file for each network interface and specify up to five (inclusive) files in the list.
    */
  var canDbcFiles: NetworkFilesList
  
  /**
    * Contains information about a network interface.
    */
  var networkInterface: InterfaceId
  
  /**
    * Pairs every signal specified in your vehicle model with a signal decoder.
    */
  var signalsMap: js.UndefOr[ModelSignalsMap] = js.undefined
}
object CanDbcDefinition {
  
  inline def apply(canDbcFiles: NetworkFilesList, networkInterface: InterfaceId): CanDbcDefinition = {
    val __obj = js.Dynamic.literal(canDbcFiles = canDbcFiles.asInstanceOf[js.Any], networkInterface = networkInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanDbcDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanDbcDefinition] (val x: Self) extends AnyVal {
    
    inline def setCanDbcFiles(value: NetworkFilesList): Self = StObject.set(x, "canDbcFiles", value.asInstanceOf[js.Any])
    
    inline def setCanDbcFilesVarargs(value: NetworkFileBlob*): Self = StObject.set(x, "canDbcFiles", js.Array(value*))
    
    inline def setNetworkInterface(value: InterfaceId): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
    
    inline def setSignalsMap(value: ModelSignalsMap): Self = StObject.set(x, "signalsMap", value.asInstanceOf[js.Any])
    
    inline def setSignalsMapUndefined: Self = StObject.set(x, "signalsMap", js.undefined)
  }
}
