package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSnapshotAccessMessage extends StObject {
  
  /**
    * The identifier of the Amazon Web Services account authorized to restore the specified snapshot. To share a snapshot with Amazon Web Services Support, specify amazon-redshift-support.
    */
  var AccountWithRestoreAccess: String
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot to authorize access to.
    */
  var SnapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the snapshot the account is authorized to restore.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
}
object AuthorizeSnapshotAccessMessage {
  
  inline def apply(AccountWithRestoreAccess: String): AuthorizeSnapshotAccessMessage = {
    val __obj = js.Dynamic.literal(AccountWithRestoreAccess = AccountWithRestoreAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeSnapshotAccessMessage]
  }
  
  extension [Self <: AuthorizeSnapshotAccessMessage](x: Self) {
    
    inline def setAccountWithRestoreAccess(value: String): Self = StObject.set(x, "AccountWithRestoreAccess", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "SnapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnUndefined: Self = StObject.set(x, "SnapshotArn", js.undefined)
    
    inline def setSnapshotClusterIdentifier(value: String): Self = StObject.set(x, "SnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "SnapshotClusterIdentifier", js.undefined)
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdentifierUndefined: Self = StObject.set(x, "SnapshotIdentifier", js.undefined)
  }
}
