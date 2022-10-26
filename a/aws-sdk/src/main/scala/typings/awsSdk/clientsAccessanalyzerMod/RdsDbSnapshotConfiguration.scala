package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsDbSnapshotConfiguration extends StObject {
  
  /**
    * The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize other Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for attributeName for the attribute map is restore.
    */
  var attributes: js.UndefOr[RdsDbSnapshotAttributesMap] = js.undefined
  
  /**
    * The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.   If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the kmsKeyId, or you specify an empty string, then the access preview uses the existing kmsKeyId of the snapshot.   If the access preview is for a new resource and you do not specify the specify the kmsKeyId, then the access preview considers the snapshot as unencrypted.  
    */
  var kmsKeyId: js.UndefOr[RdsDbSnapshotKmsKeyId] = js.undefined
}
object RdsDbSnapshotConfiguration {
  
  inline def apply(): RdsDbSnapshotConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbSnapshotConfiguration]
  }
  
  extension [Self <: RdsDbSnapshotConfiguration](x: Self) {
    
    inline def setAttributes(value: RdsDbSnapshotAttributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setKmsKeyId(value: RdsDbSnapshotKmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
  }
}
