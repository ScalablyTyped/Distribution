package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface is supplied by objects inside a document object model that have children that can be the target of a link inside a document.
  *
  * These targets implement the service {@link LinkTarget} .
  */
trait XLinkTargetSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  val Links: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the names of possible links to children of this object inside a document object model. It implements the service {@link LinkTargets} . */
  def getLinks(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

