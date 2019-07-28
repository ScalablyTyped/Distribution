package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a user of the database, who has certain access rights for the objects of the database. */
trait User
  extends XUser
     with XGroupsSupplier
     with XPropertySet {
  /** is the name of the user. */
  var Name: String
}

object User {
  @scala.inline
  def apply(
    Groups: XNameAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    changePassword: (String, String) => Unit,
    getGrantablePrivileges: (String, Double) => Double,
    getGroups: () => XNameAccess,
    getPrivileges: (String, Double) => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    grantPrivileges: (String, Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    revokePrivileges: (String, Double, Double) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): User = {
    val __obj = js.Dynamic.literal(Groups = Groups, Name = Name, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), changePassword = js.Any.fromFunction2(changePassword), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getGroups = js.Any.fromFunction0(getGroups), getPrivileges = js.Any.fromFunction2(getPrivileges), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), grantPrivileges = js.Any.fromFunction3(grantPrivileges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), revokePrivileges = js.Any.fromFunction3(revokePrivileges), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[User]
  }
}

