package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheParameterGroupStatus extends StObject {
  
  /**
    * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.undefined
  
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
}
object CacheParameterGroupStatus {
  
  inline def apply(): CacheParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupStatus]
  }
  
  extension [Self <: CacheParameterGroupStatus](x: Self) {
    
    inline def setCacheNodeIdsToReboot(value: CacheNodeIdsList): Self = StObject.set(x, "CacheNodeIdsToReboot", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeIdsToRebootUndefined: Self = StObject.set(x, "CacheNodeIdsToReboot", js.undefined)
    
    inline def setCacheNodeIdsToRebootVarargs(value: String*): Self = StObject.set(x, "CacheNodeIdsToReboot", js.Array(value*))
    
    inline def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupNameUndefined: Self = StObject.set(x, "CacheParameterGroupName", js.undefined)
    
    inline def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
  }
}
