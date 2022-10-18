package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecoveryRequest extends StObject {
  
  /**
    * Whether this Source Server Recovery operation is a drill or not.
    */
  var isDrill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Source Servers that we want to start a Recovery Job for.
    */
  var sourceServers: StartRecoveryRequestSourceServers
  
  /**
    * The tags to be associated with the Recovery Job.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object StartRecoveryRequest {
  
  inline def apply(sourceServers: StartRecoveryRequestSourceServers): StartRecoveryRequest = {
    val __obj = js.Dynamic.literal(sourceServers = sourceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecoveryRequest]
  }
  
  extension [Self <: StartRecoveryRequest](x: Self) {
    
    inline def setIsDrill(value: Boolean): Self = StObject.set(x, "isDrill", value.asInstanceOf[js.Any])
    
    inline def setIsDrillUndefined: Self = StObject.set(x, "isDrill", js.undefined)
    
    inline def setSourceServers(value: StartRecoveryRequestSourceServers): Self = StObject.set(x, "sourceServers", value.asInstanceOf[js.Any])
    
    inline def setSourceServersVarargs(value: StartRecoveryRequestSourceServer*): Self = StObject.set(x, "sourceServers", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
