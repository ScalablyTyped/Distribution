package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAquaInputMessage extends StObject {
  
  /**
    * This parameter is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
    */
  var AquaConfigurationStatus: js.UndefOr[typings.awsSdk.clientsRedshiftMod.AquaConfigurationStatus] = js.undefined
  
  /**
    * The identifier of the cluster to be modified.
    */
  var ClusterIdentifier: String
}
object ModifyAquaInputMessage {
  
  inline def apply(ClusterIdentifier: String): ModifyAquaInputMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAquaInputMessage]
  }
  
  extension [Self <: ModifyAquaInputMessage](x: Self) {
    
    inline def setAquaConfigurationStatus(value: AquaConfigurationStatus): Self = StObject.set(x, "AquaConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setAquaConfigurationStatusUndefined: Self = StObject.set(x, "AquaConfigurationStatus", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
