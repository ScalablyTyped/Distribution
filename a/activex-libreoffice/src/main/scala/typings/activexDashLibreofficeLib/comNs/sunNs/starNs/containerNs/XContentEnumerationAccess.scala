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

