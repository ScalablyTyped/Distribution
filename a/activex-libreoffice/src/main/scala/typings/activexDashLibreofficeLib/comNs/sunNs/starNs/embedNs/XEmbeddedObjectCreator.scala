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
    acquire: js.Function0[scala.Unit],
    createInstanceInitFromEntry: js.Function4[
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceInitFromMediaDescriptor: js.Function4[
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceInitNew: js.Function5[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceLink: js.Function4[
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceLinkUserInit: js.Function6[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    createInstanceUserInit: js.Function7[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      XStorage, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEmbeddedObjectCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire, createInstanceInitFromEntry = createInstanceInitFromEntry, createInstanceInitFromMediaDescriptor = createInstanceInitFromMediaDescriptor, createInstanceInitNew = createInstanceInitNew, createInstanceLink = createInstanceLink, createInstanceLinkUserInit = createInstanceLinkUserInit, createInstanceUserInit = createInstanceUserInit, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEmbeddedObjectCreator]
  }
}

