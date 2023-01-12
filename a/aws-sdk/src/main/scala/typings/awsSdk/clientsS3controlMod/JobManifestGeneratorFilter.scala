package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobManifestGeneratorFilter extends StObject {
  
  /**
    * If provided, the generated manifest should include only source bucket objects that were created after this time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If provided, the generated manifest should include only source bucket objects that were created before this time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Include objects in the generated manifest only if they are eligible for replication according to the Replication configuration on the source bucket.
    */
  var EligibleForReplication: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If provided, the generated manifest should include only source bucket objects that have one of the specified Replication statuses.
    */
  var ObjectReplicationStatuses: js.UndefOr[ReplicationStatusFilterList] = js.undefined
}
object JobManifestGeneratorFilter {
  
  inline def apply(): JobManifestGeneratorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobManifestGeneratorFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobManifestGeneratorFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setEligibleForReplication(value: Boolean): Self = StObject.set(x, "EligibleForReplication", value.asInstanceOf[js.Any])
    
    inline def setEligibleForReplicationUndefined: Self = StObject.set(x, "EligibleForReplication", js.undefined)
    
    inline def setObjectReplicationStatuses(value: ReplicationStatusFilterList): Self = StObject.set(x, "ObjectReplicationStatuses", value.asInstanceOf[js.Any])
    
    inline def setObjectReplicationStatusesUndefined: Self = StObject.set(x, "ObjectReplicationStatuses", js.undefined)
    
    inline def setObjectReplicationStatusesVarargs(value: ReplicationStatus*): Self = StObject.set(x, "ObjectReplicationStatuses", js.Array(value*))
  }
}
