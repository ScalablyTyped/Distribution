package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait XContentEnumerationAccess extends XInterface {
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  val AvailableServiceNames: SafeArray[String]
  /** @returns a new enumeration object for the contents of the specified service type. */
  def createContentEnumeration(aServiceName: String): XEnumeration
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  def getAvailableServiceNames(): SafeArray[String]
}

object XContentEnumerationAccess {
  @scala.inline
  def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: () => Unit,
    createContentEnumeration: String => XEnumeration,
    getAvailableServiceNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentEnumerationAccess = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames, acquire = js.Any.fromFunction0(acquire), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContentEnumerationAccess]
  }
}

