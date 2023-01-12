package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReplicationInfo extends StObject {
  
  /**
    * Error in data replication.
    */
  var dataReplicationError: js.UndefOr[DataReplicationError] = js.undefined
  
  /**
    * Information about whether the data replication has been initiated.
    */
  var dataReplicationInitiation: js.UndefOr[DataReplicationInitiation] = js.undefined
  
  /**
    * The state of the data replication.
    */
  var dataReplicationState: js.UndefOr[DataReplicationState] = js.undefined
  
  /**
    * An estimate of when the data replication will be completed.
    */
  var etaDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Data replication lag duration.
    */
  var lagDuration: js.UndefOr[ISO8601DurationString] = js.undefined
  
  /**
    * The disks that should be replicated.
    */
  var replicatedDisks: js.UndefOr[DataReplicationInfoReplicatedDisks] = js.undefined
}
object DataReplicationInfo {
  
  inline def apply(): DataReplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReplicationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataReplicationInfo] (val x: Self) extends AnyVal {
    
    inline def setDataReplicationError(value: DataReplicationError): Self = StObject.set(x, "dataReplicationError", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationErrorUndefined: Self = StObject.set(x, "dataReplicationError", js.undefined)
    
    inline def setDataReplicationInitiation(value: DataReplicationInitiation): Self = StObject.set(x, "dataReplicationInitiation", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationInitiationUndefined: Self = StObject.set(x, "dataReplicationInitiation", js.undefined)
    
    inline def setDataReplicationState(value: DataReplicationState): Self = StObject.set(x, "dataReplicationState", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationStateUndefined: Self = StObject.set(x, "dataReplicationState", js.undefined)
    
    inline def setEtaDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "etaDateTime", value.asInstanceOf[js.Any])
    
    inline def setEtaDateTimeUndefined: Self = StObject.set(x, "etaDateTime", js.undefined)
    
    inline def setLagDuration(value: ISO8601DurationString): Self = StObject.set(x, "lagDuration", value.asInstanceOf[js.Any])
    
    inline def setLagDurationUndefined: Self = StObject.set(x, "lagDuration", js.undefined)
    
    inline def setReplicatedDisks(value: DataReplicationInfoReplicatedDisks): Self = StObject.set(x, "replicatedDisks", value.asInstanceOf[js.Any])
    
    inline def setReplicatedDisksUndefined: Self = StObject.set(x, "replicatedDisks", js.undefined)
    
    inline def setReplicatedDisksVarargs(value: DataReplicationInfoReplicatedDisk*): Self = StObject.set(x, "replicatedDisks", js.Array(value*))
  }
}
