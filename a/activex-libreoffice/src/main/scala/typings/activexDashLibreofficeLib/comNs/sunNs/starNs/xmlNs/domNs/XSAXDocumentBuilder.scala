package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds a new dom tree */
trait XSAXDocumentBuilder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Document: XDocument
  val DocumentFragment: XDocumentFragment
  val State: SAXDocumentBuilderState
  def endDocumentFragment(): scala.Unit
  def getDocument(): XDocument
  def getDocumentFragment(): XDocumentFragment
  def getState(): SAXDocumentBuilderState
  def reset(): scala.Unit
  def startDocumentFragment(ownerDoc: XDocument): scala.Unit
}

