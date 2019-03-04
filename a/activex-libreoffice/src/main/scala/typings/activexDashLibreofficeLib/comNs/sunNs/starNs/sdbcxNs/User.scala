package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a user of the database, who has certain access rights for the objects of the database. */
trait User
  extends XUser
     with XGroupsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the name of the user. */
  var Name: java.lang.String
}

object User {
  @scala.inline
  def apply(
    Groups: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    changePassword: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    getGrantablePrivileges: js.Function2[java.lang.String, scala.Double, scala.Double],
    getGroups: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getPrivileges: js.Function2[java.lang.String, scala.Double, scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    grantPrivileges: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    revokePrivileges: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): User = {
    val __obj = js.Dynamic.literal(Groups = Groups, Name = Name, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, changePassword = changePassword, getGrantablePrivileges = getGrantablePrivileges, getGroups = getGroups, getPrivileges = getPrivileges, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, grantPrivileges = grantPrivileges, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, revokePrivileges = revokePrivileges, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[User]
  }
}

