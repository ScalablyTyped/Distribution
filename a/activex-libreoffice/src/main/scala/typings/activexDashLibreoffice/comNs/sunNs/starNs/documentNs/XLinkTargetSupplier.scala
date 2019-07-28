package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface is supplied by objects inside a document object model that have children that can be the target of a link inside a document.
  *
  * These targets implement the service {@link LinkTarget} .
  */
trait XLinkTargetSupplier extends XInterface {
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  val Links: XNameAccess
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  def getLinks(): XNameAccess
}

object XLinkTargetSupplier {
  @scala.inline
  def apply(
    Links: XNameAccess,
    acquire: () => Unit,
    getLinks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLinkTargetSupplier = {
    val __obj = js.Dynamic.literal(Links = Links, acquire = js.Any.fromFunction0(acquire), getLinks = js.Any.fromFunction0(getLinks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLinkTargetSupplier]
  }
}

