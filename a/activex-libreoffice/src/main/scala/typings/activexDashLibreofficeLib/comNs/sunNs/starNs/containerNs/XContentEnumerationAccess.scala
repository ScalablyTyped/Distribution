package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to the collections of all content types within the object.
  *
  * This example prints the names of all tables:
  *
  * {{program example here, see documentation}}
  */
trait XContentEnumerationAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  val AvailableServiceNames: activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns a new enumeration object for the contents of the specified service type. */
  def createContentEnumeration(aServiceName: java.lang.String): XEnumeration
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  def getAvailableServiceNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XContentEnumerationAccess {
  @scala.inline
  def apply(
    AvailableServiceNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    createContentEnumeration: js.Function1[java.lang.String, XEnumeration],
    getAvailableServiceNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContentEnumerationAccess = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames, acquire = acquire, createContentEnumeration = createContentEnumeration, getAvailableServiceNames = getAvailableServiceNames, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XContentEnumerationAccess]
  }
}

