package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureGroupSummary extends StObject {
  
  /**
    * A timestamp indicating the time of creation time of the FeatureGroup.
    */
  var CreationTime: js.Date
  
  /**
    * Unique identifier for the FeatureGroup.
    */
  var FeatureGroupArn: typings.awsSdk.clientsSagemakerMod.FeatureGroupArn
  
  /**
    * The name of FeatureGroup.
    */
  var FeatureGroupName: typings.awsSdk.clientsSagemakerMod.FeatureGroupName
  
  /**
    * The status of a FeatureGroup. The status can be any of the following: Creating, Created, CreateFail, Deleting or DetailFail. 
    */
  var FeatureGroupStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FeatureGroupStatus] = js.undefined
  
  /**
    * Notifies you if replicating data into the OfflineStore has failed. Returns either: Active or Blocked.
    */
  var OfflineStoreStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OfflineStoreStatus] = js.undefined
}
object FeatureGroupSummary {
  
  inline def apply(CreationTime: js.Date, FeatureGroupArn: FeatureGroupArn, FeatureGroupName: FeatureGroupName): FeatureGroupSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FeatureGroupArn = FeatureGroupArn.asInstanceOf[js.Any], FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureGroupSummary]
  }
  
  extension [Self <: FeatureGroupSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupArn(value: FeatureGroupArn): Self = StObject.set(x, "FeatureGroupArn", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupStatus(value: FeatureGroupStatus): Self = StObject.set(x, "FeatureGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupStatusUndefined: Self = StObject.set(x, "FeatureGroupStatus", js.undefined)
    
    inline def setOfflineStoreStatus(value: OfflineStoreStatus): Self = StObject.set(x, "OfflineStoreStatus", value.asInstanceOf[js.Any])
    
    inline def setOfflineStoreStatusUndefined: Self = StObject.set(x, "OfflineStoreStatus", js.undefined)
  }
}
