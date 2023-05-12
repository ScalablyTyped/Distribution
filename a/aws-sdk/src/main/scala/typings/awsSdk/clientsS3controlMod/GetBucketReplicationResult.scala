package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketReplicationResult extends StObject {
  
  /**
    * A container for one or more replication rules. A replication configuration must have at least one rule and you can add up to 100 rules. The maximum size of a replication configuration is 128 KB.
    */
  var ReplicationConfiguration: js.UndefOr[typings.awsSdk.clientsS3controlMod.ReplicationConfiguration] = js.undefined
}
object GetBucketReplicationResult {
  
  inline def apply(): GetBucketReplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketReplicationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketReplicationResult] (val x: Self) extends AnyVal {
    
    inline def setReplicationConfiguration(value: ReplicationConfiguration): Self = StObject.set(x, "ReplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "ReplicationConfiguration", js.undefined)
  }
}
