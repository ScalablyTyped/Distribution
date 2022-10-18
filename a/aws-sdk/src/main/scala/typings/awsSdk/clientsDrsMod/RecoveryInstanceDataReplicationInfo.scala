package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceDataReplicationInfo extends StObject {
  
  /**
    * Information about Data Replication
    */
  var dataReplicationError: js.UndefOr[RecoveryInstanceDataReplicationError] = js.undefined
  
  /**
    * Information about whether the data replication has been initiated.
    */
  var dataReplicationInitiation: js.UndefOr[RecoveryInstanceDataReplicationInitiation] = js.undefined
  
  /**
    * The state of the data replication.
    */
  var dataReplicationState: js.UndefOr[RecoveryInstanceDataReplicationState] = js.undefined
  
  /**
    * An estimate of when the data replication will be completed.
    */
  var etaDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Data replication lag duration.
    */
  var lagDuration: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The disks that should be replicated.
    */
  var replicatedDisks: js.UndefOr[RecoveryInstanceDataReplicationInfoReplicatedDisks] = js.undefined
}
object RecoveryInstanceDataReplicationInfo {
  
  inline def apply(): RecoveryInstanceDataReplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceDataReplicationInfo]
  }
  
  extension [Self <: RecoveryInstanceDataReplicationInfo](x: Self) {
    
    inline def setDataReplicationError(value: RecoveryInstanceDataReplicationError): Self = StObject.set(x, "dataReplicationError", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationErrorUndefined: Self = StObject.set(x, "dataReplicationError", js.undefined)
    
    inline def setDataReplicationInitiation(value: RecoveryInstanceDataReplicationInitiation): Self = StObject.set(x, "dataReplicationInitiation", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationInitiationUndefined: Self = StObject.set(x, "dataReplicationInitiation", js.undefined)
    
    inline def setDataReplicationState(value: RecoveryInstanceDataReplicationState): Self = StObject.set(x, "dataReplicationState", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationStateUndefined: Self = StObject.set(x, "dataReplicationState", js.undefined)
    
    inline def setEtaDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "etaDateTime", value.asInstanceOf[js.Any])
    
    inline def setEtaDateTimeUndefined: Self = StObject.set(x, "etaDateTime", js.undefined)
    
    inline def setLagDuration(value: ISO8601DatetimeString): Self = StObject.set(x, "lagDuration", value.asInstanceOf[js.Any])
    
    inline def setLagDurationUndefined: Self = StObject.set(x, "lagDuration", js.undefined)
    
    inline def setReplicatedDisks(value: RecoveryInstanceDataReplicationInfoReplicatedDisks): Self = StObject.set(x, "replicatedDisks", value.asInstanceOf[js.Any])
    
    inline def setReplicatedDisksUndefined: Self = StObject.set(x, "replicatedDisks", js.undefined)
    
    inline def setReplicatedDisksVarargs(value: RecoveryInstanceDataReplicationInfoReplicatedDisk*): Self = StObject.set(x, "replicatedDisks", js.Array(value*))
  }
}
