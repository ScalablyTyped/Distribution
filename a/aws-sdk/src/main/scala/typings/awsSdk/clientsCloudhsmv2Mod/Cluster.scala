package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The cluster's backup policy.
    */
  var BackupPolicy: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.BackupPolicy] = js.undefined
  
  /**
    * A policy that defines how the service retains backups.
    */
  var BackupRetentionPolicy: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.BackupRetentionPolicy] = js.undefined
  
  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  var Certificates: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Certificates] = js.undefined
  
  /**
    * The cluster's identifier (ID).
    */
  var ClusterId: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.ClusterId] = js.undefined
  
  /**
    * The date and time when the cluster was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of HSM that the cluster contains.
    */
  var HsmType: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.HsmType] = js.undefined
  
  /**
    * Contains information about the HSMs in the cluster.
    */
  var Hsms: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Hsms] = js.undefined
  
  /**
    * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
    */
  var PreCoPassword: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.PreCoPassword] = js.undefined
  
  /**
    * The identifier (ID) of the cluster's security group.
    */
  var SecurityGroup: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.SecurityGroup] = js.undefined
  
  /**
    * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created from a backup.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.StateMessage] = js.undefined
  
  /**
    * A map from availability zone to the cluster’s subnet in that availability zone.
    */
  var SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.undefined
  
  /**
    * The list of tags for the cluster.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.TagList] = js.undefined
  
  /**
    * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.VpcId] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setBackupPolicy(value: BackupPolicy): Self = StObject.set(x, "BackupPolicy", value.asInstanceOf[js.Any])
    
    inline def setBackupPolicyUndefined: Self = StObject.set(x, "BackupPolicy", js.undefined)
    
    inline def setBackupRetentionPolicy(value: BackupRetentionPolicy): Self = StObject.set(x, "BackupRetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPolicyUndefined: Self = StObject.set(x, "BackupRetentionPolicy", js.undefined)
    
    inline def setCertificates(value: Certificates): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setCreateTimestamp(value: js.Date): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    inline def setHsmType(value: HsmType): Self = StObject.set(x, "HsmType", value.asInstanceOf[js.Any])
    
    inline def setHsmTypeUndefined: Self = StObject.set(x, "HsmType", js.undefined)
    
    inline def setHsms(value: Hsms): Self = StObject.set(x, "Hsms", value.asInstanceOf[js.Any])
    
    inline def setHsmsUndefined: Self = StObject.set(x, "Hsms", js.undefined)
    
    inline def setHsmsVarargs(value: Hsm*): Self = StObject.set(x, "Hsms", js.Array(value*))
    
    inline def setPreCoPassword(value: PreCoPassword): Self = StObject.set(x, "PreCoPassword", value.asInstanceOf[js.Any])
    
    inline def setPreCoPasswordUndefined: Self = StObject.set(x, "PreCoPassword", js.undefined)
    
    inline def setSecurityGroup(value: SecurityGroup): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
    
    inline def setSourceBackupId(value: BackupId): Self = StObject.set(x, "SourceBackupId", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupIdUndefined: Self = StObject.set(x, "SourceBackupId", js.undefined)
    
    inline def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: StateMessage): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetMapping(value: ExternalSubnetMapping): Self = StObject.set(x, "SubnetMapping", value.asInstanceOf[js.Any])
    
    inline def setSubnetMappingUndefined: Self = StObject.set(x, "SubnetMapping", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
