package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationDetails extends StObject {
  
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to any destination.
    */
  var replicated: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to an Amazon Web Services account that isn't part of the same Amazon Macie organization.
    */
  var replicatedExternally: js.UndefOr[boolean] = js.undefined
  
  /**
    * An array of Amazon Web Services account IDs, one for each Amazon Web Services account that the bucket is configured to replicate one or more objects to.
    */
  var replicationAccounts: js.UndefOr[listOfString] = js.undefined
}
object ReplicationDetails {
  
  inline def apply(): ReplicationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationDetails] (val x: Self) extends AnyVal {
    
    inline def setReplicated(value: boolean): Self = StObject.set(x, "replicated", value.asInstanceOf[js.Any])
    
    inline def setReplicatedExternally(value: boolean): Self = StObject.set(x, "replicatedExternally", value.asInstanceOf[js.Any])
    
    inline def setReplicatedExternallyUndefined: Self = StObject.set(x, "replicatedExternally", js.undefined)
    
    inline def setReplicatedUndefined: Self = StObject.set(x, "replicated", js.undefined)
    
    inline def setReplicationAccounts(value: listOfString): Self = StObject.set(x, "replicationAccounts", value.asInstanceOf[js.Any])
    
    inline def setReplicationAccountsUndefined: Self = StObject.set(x, "replicationAccounts", js.undefined)
    
    inline def setReplicationAccountsVarargs(value: string*): Self = StObject.set(x, "replicationAccounts", js.Array(value*))
  }
}
