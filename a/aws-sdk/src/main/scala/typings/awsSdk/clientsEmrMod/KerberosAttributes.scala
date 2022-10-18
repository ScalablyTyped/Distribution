package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KerberosAttributes extends StObject {
  
  /**
    * The Active Directory password for ADDomainJoinUser.
    */
  var ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain.
    */
  var ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms.
    */
  var CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster.
    */
  var KdcAdminPassword: XmlStringMaxLen256
  
  /**
    * The name of the Kerberos realm to which all nodes in a cluster belong. For example, EC2.INTERNAL. 
    */
  var Realm: XmlStringMaxLen256
}
object KerberosAttributes {
  
  inline def apply(KdcAdminPassword: XmlStringMaxLen256, Realm: XmlStringMaxLen256): KerberosAttributes = {
    val __obj = js.Dynamic.literal(KdcAdminPassword = KdcAdminPassword.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KerberosAttributes]
  }
  
  extension [Self <: KerberosAttributes](x: Self) {
    
    inline def setADDomainJoinPassword(value: XmlStringMaxLen256): Self = StObject.set(x, "ADDomainJoinPassword", value.asInstanceOf[js.Any])
    
    inline def setADDomainJoinPasswordUndefined: Self = StObject.set(x, "ADDomainJoinPassword", js.undefined)
    
    inline def setADDomainJoinUser(value: XmlStringMaxLen256): Self = StObject.set(x, "ADDomainJoinUser", value.asInstanceOf[js.Any])
    
    inline def setADDomainJoinUserUndefined: Self = StObject.set(x, "ADDomainJoinUser", js.undefined)
    
    inline def setCrossRealmTrustPrincipalPassword(value: XmlStringMaxLen256): Self = StObject.set(x, "CrossRealmTrustPrincipalPassword", value.asInstanceOf[js.Any])
    
    inline def setCrossRealmTrustPrincipalPasswordUndefined: Self = StObject.set(x, "CrossRealmTrustPrincipalPassword", js.undefined)
    
    inline def setKdcAdminPassword(value: XmlStringMaxLen256): Self = StObject.set(x, "KdcAdminPassword", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: XmlStringMaxLen256): Self = StObject.set(x, "Realm", value.asInstanceOf[js.Any])
  }
}
