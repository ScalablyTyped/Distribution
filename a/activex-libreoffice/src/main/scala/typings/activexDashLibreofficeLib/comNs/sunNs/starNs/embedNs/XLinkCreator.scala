package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to create and initialize a new link.
  *
  * Methods of this interface does not require specification of the object type, it will be detected.
  */
trait XLinkCreator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new object based on {@link com.sun.star.document.MediaDescriptor} and initializes it as a link.
    *
    * In case the entry exists already all its contents will be ignored and rewritten on storing of the object.
    * @param xStorage a parent storage the entry should be created or opened in
    * @param sEntryName a name for the entry
    * @param aArgs {@link com.sun.star.document.MediaDescriptor} the link will be based on
    * @param aObjectArgs optional parameters for the object persistence initialization, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException the argument is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceLink(
    xStorage: XStorage,
    sEntryName: java.lang.String,
    aArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

