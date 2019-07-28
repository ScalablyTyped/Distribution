package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to create and initialize a new embedded object from clipboard.
  *
  * This interface contains methods that can help to create and initialize an embedded object based on system clipboard.
  */
trait XEmbedObjectClipboardCreator extends XInterface {
  /**
    * creates a new object and initializes it from the system clipboard.
    *
    * In case specified entry exists it's contents are ignored and will be overwritten on storing.
    *
    * The clipboard can provide a number of choices that are container related. This information will be returned in the {@link InsertedObjectInfo} object.
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntryName a name for the entry
    * @param aObjectArgs optional parameters for the object persistence initialization see also {@link EmbeddedObjectDescriptor}
    * @returns the structure containing the object and container related options
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitFromClipboard(xStorage: XStorage, sEntryName: String, aObjectArgs: SeqEquiv[PropertyValue]): InsertedObjectInfo
}

object XEmbedObjectClipboardCreator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstanceInitFromClipboard: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbedObjectClipboardCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceInitFromClipboard = js.Any.fromFunction3(createInstanceInitFromClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbedObjectClipboardCreator]
  }
}

