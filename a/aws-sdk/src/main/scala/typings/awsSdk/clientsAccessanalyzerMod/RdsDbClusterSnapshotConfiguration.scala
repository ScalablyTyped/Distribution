package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsDbClusterSnapshotConfiguration extends StObject {
  
  /**
    * The names and values of manual DB cluster snapshot attributes. Manual DB cluster snapshot attributes are used to authorize other Amazon Web Services accounts to restore a manual DB cluster snapshot. The only valid value for AttributeName for the attribute map is restore 
    */
  var attributes: js.UndefOr[RdsDbClusterSnapshotAttributesMap] = js.undefined
  
  /**
    * The KMS key identifier for an encrypted Amazon RDS DB cluster snapshot. The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.   If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the kmsKeyId, or you specify an empty string, then the access preview uses the existing kmsKeyId of the snapshot.   If the access preview is for a new resource and you do not specify the specify the kmsKeyId, then the access preview considers the snapshot as unencrypted.  
    */
  var kmsKeyId: js.UndefOr[RdsDbClusterSnapshotKmsKeyId] = js.undefined
}
object RdsDbClusterSnapshotConfiguration {
  
  inline def apply(): RdsDbClusterSnapshotConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbClusterSnapshotConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsDbClusterSnapshotConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: RdsDbClusterSnapshotAttributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setKmsKeyId(value: RdsDbClusterSnapshotKmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
  }
}
