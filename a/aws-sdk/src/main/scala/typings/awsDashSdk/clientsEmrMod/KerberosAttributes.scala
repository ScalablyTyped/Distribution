package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KerberosAttributes extends js.Object {
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
  @scala.inline
  def apply(
    KdcAdminPassword: XmlStringMaxLen256,
    Realm: XmlStringMaxLen256,
    ADDomainJoinPassword: XmlStringMaxLen256 = null,
    ADDomainJoinUser: XmlStringMaxLen256 = null,
    CrossRealmTrustPrincipalPassword: XmlStringMaxLen256 = null
  ): KerberosAttributes = {
    val __obj = js.Dynamic.literal(KdcAdminPassword = KdcAdminPassword, Realm = Realm)
    if (ADDomainJoinPassword != null) __obj.updateDynamic("ADDomainJoinPassword")(ADDomainJoinPassword)
    if (ADDomainJoinUser != null) __obj.updateDynamic("ADDomainJoinUser")(ADDomainJoinUser)
    if (CrossRealmTrustPrincipalPassword != null) __obj.updateDynamic("CrossRealmTrustPrincipalPassword")(CrossRealmTrustPrincipalPassword)
    __obj.asInstanceOf[KerberosAttributes]
  }
}

