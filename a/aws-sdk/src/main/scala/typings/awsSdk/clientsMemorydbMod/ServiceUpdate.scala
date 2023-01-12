package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdate extends StObject {
  
  /**
    * The date at which the service update will be automatically applied
    */
  var AutoUpdateStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the cluster to which the service update applies
    */
  var ClusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Provides details of the service update
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of nodes updated by the service update
    */
  var NodesUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the service update is initially available
    */
  var ReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update
    */
  var Status: js.UndefOr[ServiceUpdateStatus] = js.undefined
  
  /**
    * Reflects the nature of the service update
    */
  var Type: js.UndefOr[ServiceUpdateType] = js.undefined
}
object ServiceUpdate {
  
  inline def apply(): ServiceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceUpdate] (val x: Self) extends AnyVal {
    
    inline def setAutoUpdateStartDate(value: js.Date): Self = StObject.set(x, "AutoUpdateStartDate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateStartDateUndefined: Self = StObject.set(x, "AutoUpdateStartDate", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNodesUpdated(value: String): Self = StObject.set(x, "NodesUpdated", value.asInstanceOf[js.Any])
    
    inline def setNodesUpdatedUndefined: Self = StObject.set(x, "NodesUpdated", js.undefined)
    
    inline def setReleaseDate(value: js.Date): Self = StObject.set(x, "ReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "ReleaseDate", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setStatus(value: ServiceUpdateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: ServiceUpdateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
