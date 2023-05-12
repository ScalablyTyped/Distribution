package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreFromSnapshotRequest extends StObject {
  
  /**
    * The name of the namespace to restore the snapshot to.
    */
  var namespaceName: NamespaceName
  
  /**
    * The Amazon Web Services account that owns the snapshot.
    */
  var ownerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift Serverless to a provisioned cluster. Must not be specified at the same time as snapshotName. The format of the ARN is arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier&gt;/&lt;snapshot_identifier&gt;.
    */
  var snapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the snapshot to restore from. Must not be specified at the same time as snapshotArn.
    */
  var snapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the workgroup used to restore the snapshot.
    */
  var workgroupName: WorkgroupName
}
object RestoreFromSnapshotRequest {
  
  inline def apply(namespaceName: NamespaceName, workgroupName: WorkgroupName): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreFromSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnUndefined: Self = StObject.set(x, "snapshotArn", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
