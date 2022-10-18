package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBootstrapActionsOutput extends StObject {
  
  /**
    * The bootstrap actions associated with the cluster.
    */
  var BootstrapActions: js.UndefOr[CommandList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListBootstrapActionsOutput {
  
  inline def apply(): ListBootstrapActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBootstrapActionsOutput]
  }
  
  extension [Self <: ListBootstrapActionsOutput](x: Self) {
    
    inline def setBootstrapActions(value: CommandList): Self = StObject.set(x, "BootstrapActions", value.asInstanceOf[js.Any])
    
    inline def setBootstrapActionsUndefined: Self = StObject.set(x, "BootstrapActions", js.undefined)
    
    inline def setBootstrapActionsVarargs(value: Command*): Self = StObject.set(x, "BootstrapActions", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
