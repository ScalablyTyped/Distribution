package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XEmbeddedObjectCreator
  extends XEmbedObjectCreator
     with XEmbedObjectFactory
     with XLinkCreator
     with XLinkFactory

object XEmbeddedObjectCreator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstanceInitFromEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceInitFromMediaDescriptor: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceInitNew: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue]) => XInterface,
    createInstanceLink: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceLinkUserInit: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceUserInit: (SeqEquiv[Double], String, XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbeddedObjectCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceInitFromEntry = js.Any.fromFunction4(createInstanceInitFromEntry), createInstanceInitFromMediaDescriptor = js.Any.fromFunction4(createInstanceInitFromMediaDescriptor), createInstanceInitNew = js.Any.fromFunction5(createInstanceInitNew), createInstanceLink = js.Any.fromFunction4(createInstanceLink), createInstanceLinkUserInit = js.Any.fromFunction6(createInstanceLinkUserInit), createInstanceUserInit = js.Any.fromFunction7(createInstanceUserInit), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbeddedObjectCreator]
  }
}

