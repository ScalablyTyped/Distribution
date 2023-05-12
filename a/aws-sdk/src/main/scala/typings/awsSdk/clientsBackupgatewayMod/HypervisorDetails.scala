package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HypervisorDetails extends StObject {
  
  /**
    * The server host of the hypervisor. This can be either an IP address or a fully-qualified domain name (FQDN).
    */
  var Host: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Host] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS used to encrypt the hypervisor.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.KmsKeyArn] = js.undefined
  
  /**
    * This is the time when the most recent successful sync of metadata occurred.
    */
  var LastSuccessfulMetadataSyncTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the most recent status for the indicated metadata sync.
    */
  var LatestMetadataSyncStatus: js.UndefOr[SyncMetadataStatus] = js.undefined
  
  /**
    * This is the most recent status for the indicated metadata sync.
    */
  var LatestMetadataSyncStatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
    */
  var LogGroupArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.LogGroupArn] = js.undefined
  
  /**
    * This is the name of the specified hypervisor.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Name] = js.undefined
  
  /**
    * This is the current state of the specified hypervisor. The possible states are PENDING, ONLINE, OFFLINE, or ERROR.
    */
  var State: js.UndefOr[HypervisorState] = js.undefined
}
object HypervisorDetails {
  
  inline def apply(): HypervisorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HypervisorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HypervisorDetails] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setLastSuccessfulMetadataSyncTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulMetadataSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulMetadataSyncTimeUndefined: Self = StObject.set(x, "LastSuccessfulMetadataSyncTime", js.undefined)
    
    inline def setLatestMetadataSyncStatus(value: SyncMetadataStatus): Self = StObject.set(x, "LatestMetadataSyncStatus", value.asInstanceOf[js.Any])
    
    inline def setLatestMetadataSyncStatusMessage(value: String): Self = StObject.set(x, "LatestMetadataSyncStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setLatestMetadataSyncStatusMessageUndefined: Self = StObject.set(x, "LatestMetadataSyncStatusMessage", js.undefined)
    
    inline def setLatestMetadataSyncStatusUndefined: Self = StObject.set(x, "LatestMetadataSyncStatus", js.undefined)
    
    inline def setLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: HypervisorState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
