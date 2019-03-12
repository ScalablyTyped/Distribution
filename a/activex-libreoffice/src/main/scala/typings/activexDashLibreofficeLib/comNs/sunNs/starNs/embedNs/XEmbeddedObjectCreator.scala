package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

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
    acquire: () => scala.Unit,
    createInstanceInitFromEntry: (XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceInitFromMediaDescriptor: (XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceInitNew: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String, XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceLink: (XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceLinkUserInit: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String, XStorage, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceUserInit: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String, XStorage, java.lang.String, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEmbeddedObjectCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceInitFromEntry = js.Any.fromFunction4(createInstanceInitFromEntry), createInstanceInitFromMediaDescriptor = js.Any.fromFunction4(createInstanceInitFromMediaDescriptor), createInstanceInitNew = js.Any.fromFunction5(createInstanceInitNew), createInstanceLink = js.Any.fromFunction4(createInstanceLink), createInstanceLinkUserInit = js.Any.fromFunction6(createInstanceLinkUserInit), createInstanceUserInit = js.Any.fromFunction7(createInstanceUserInit), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbeddedObjectCreator]
  }
}

