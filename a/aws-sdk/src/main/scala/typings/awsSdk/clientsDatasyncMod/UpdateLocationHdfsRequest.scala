package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLocationHdfsRequest extends StObject {
  
  /**
    * The ARNs of the agents that are used to connect to the HDFS cluster. 
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The type of authentication used to determine the identity of the user. 
    */
  var AuthenticationType: js.UndefOr[HdfsAuthenticationType] = js.undefined
  
  /**
    * The size of the data blocks to write into the HDFS cluster. 
    */
  var BlockSize: js.UndefOr[HdfsBlockSize] = js.undefined
  
  /**
    * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. You can load the keytab from a file by providing the file's address. If you use the CLI, it performs base64 encoding for you. Otherwise, provide the base64-encoded text.
    */
  var KerberosKeytab: js.UndefOr[KerberosKeytabFile] = js.undefined
  
  /**
    * The krb5.conf file that contains the Kerberos configuration information. You can load the krb5.conf file by providing the file's address. If you're using the CLI, it performs the base64 encoding for you. Otherwise, provide the base64-encoded text.
    */
  var KerberosKrb5Conf: js.UndefOr[KerberosKrb5ConfFile] = js.undefined
  
  /**
    * The Kerberos principal with access to the files and folders on the HDFS cluster. 
    */
  var KerberosPrincipal: js.UndefOr[typings.awsSdk.clientsDatasyncMod.KerberosPrincipal] = js.undefined
  
  /**
    * The URI of the HDFS cluster's Key Management Server (KMS). 
    */
  var KmsKeyProviderUri: js.UndefOr[typings.awsSdk.clientsDatasyncMod.KmsKeyProviderUri] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source HDFS cluster location.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
  
  /**
    * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode.
    */
  var NameNodes: js.UndefOr[HdfsNameNodeList] = js.undefined
  
  /**
    * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer privacy settings configured on the Hadoop Distributed File System (HDFS) cluster. 
    */
  var QopConfiguration: js.UndefOr[typings.awsSdk.clientsDatasyncMod.QopConfiguration] = js.undefined
  
  /**
    * The number of DataNodes to replicate the data to when writing to the HDFS cluster. 
    */
  var ReplicationFactor: js.UndefOr[HdfsReplicationFactor] = js.undefined
  
  /**
    * The user name used to identify the client on the host operating system.
    */
  var SimpleUser: js.UndefOr[HdfsUser] = js.undefined
  
  /**
    * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster.
    */
  var Subdirectory: js.UndefOr[HdfsSubdirectory] = js.undefined
}
object UpdateLocationHdfsRequest {
  
  inline def apply(LocationArn: LocationArn): UpdateLocationHdfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLocationHdfsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLocationHdfsRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setAuthenticationType(value: HdfsAuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setBlockSize(value: HdfsBlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    inline def setKerberosKeytab(value: KerberosKeytabFile): Self = StObject.set(x, "KerberosKeytab", value.asInstanceOf[js.Any])
    
    inline def setKerberosKeytabUndefined: Self = StObject.set(x, "KerberosKeytab", js.undefined)
    
    inline def setKerberosKrb5Conf(value: KerberosKrb5ConfFile): Self = StObject.set(x, "KerberosKrb5Conf", value.asInstanceOf[js.Any])
    
    inline def setKerberosKrb5ConfUndefined: Self = StObject.set(x, "KerberosKrb5Conf", js.undefined)
    
    inline def setKerberosPrincipal(value: KerberosPrincipal): Self = StObject.set(x, "KerberosPrincipal", value.asInstanceOf[js.Any])
    
    inline def setKerberosPrincipalUndefined: Self = StObject.set(x, "KerberosPrincipal", js.undefined)
    
    inline def setKmsKeyProviderUri(value: KmsKeyProviderUri): Self = StObject.set(x, "KmsKeyProviderUri", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyProviderUriUndefined: Self = StObject.set(x, "KmsKeyProviderUri", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setNameNodes(value: HdfsNameNodeList): Self = StObject.set(x, "NameNodes", value.asInstanceOf[js.Any])
    
    inline def setNameNodesUndefined: Self = StObject.set(x, "NameNodes", js.undefined)
    
    inline def setNameNodesVarargs(value: HdfsNameNode*): Self = StObject.set(x, "NameNodes", js.Array(value*))
    
    inline def setQopConfiguration(value: QopConfiguration): Self = StObject.set(x, "QopConfiguration", value.asInstanceOf[js.Any])
    
    inline def setQopConfigurationUndefined: Self = StObject.set(x, "QopConfiguration", js.undefined)
    
    inline def setReplicationFactor(value: HdfsReplicationFactor): Self = StObject.set(x, "ReplicationFactor", value.asInstanceOf[js.Any])
    
    inline def setReplicationFactorUndefined: Self = StObject.set(x, "ReplicationFactor", js.undefined)
    
    inline def setSimpleUser(value: HdfsUser): Self = StObject.set(x, "SimpleUser", value.asInstanceOf[js.Any])
    
    inline def setSimpleUserUndefined: Self = StObject.set(x, "SimpleUser", js.undefined)
    
    inline def setSubdirectory(value: HdfsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
  }
}
