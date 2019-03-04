package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to create and initialize a new embedded object.
  *
  * This interface contains methods that can help to create and initialize an embedded object.
  */
trait XEmbedObjectCreator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new object that should be based on specified storage entry.
    *
    * The specified entry must exists and the object should be loaded from the entry. In case a persistent representation of a link is specified, the result
    * object will be a link.
    * @param xStorage a parent storage the entry should be opened in
    * @param sEntryName a name for the entry
    * @param aMediaDescriptor an object of type {@link com.sun.star.document.MediaDescriptor} that specifies document related properties; please remember that
    * @param aObjectArgs an object of type {@link EmbeddedObjectDescriptor} contains object related properties
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::container::NoSuchElementException the specified entry does not exist
    * @throws com::sun::star::io::IOException in case of io problems during opening
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitFromEntry(
    xStorage: XStorage,
    sEntryName: java.lang.String,
    aMediaDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * creates a new object and initializes it based on {@link com.sun.star.document.MediaDescriptor} .
    *
    * In case specified entry exists it's contents are ignored and will be overwritten on storing.
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntryName a name for the entry
    * @param aMediaDescriptor an object of type {@link com.sun.star.document.MediaDescriptor} that specifies source
    * @param aObjectArgs an object of type {@link EmbeddedObjectDescriptor} contains object related properties
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitFromMediaDescriptor(
    xStorage: XStorage,
    sEntryName: java.lang.String,
    aMediaDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * creates a new object and initializes it as a new one.
    *
    * In case specified entry exists it's contents are ignored and will be overwritten on storing.
    * @param aClassID the class id of the new object
    * @param sClassName the class name of the new object
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntryName a name for the entry
    * @param aObjectArgs optional parameters for the object persistence initialization see also {@link EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitNew(
    aClassID: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    sClassName: java.lang.String,
    xStorage: XStorage,
    sEntryName: java.lang.String,
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XEmbedObjectCreator {
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
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEmbedObjectCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire, createInstanceInitFromEntry = createInstanceInitFromEntry, createInstanceInitFromMediaDescriptor = createInstanceInitFromMediaDescriptor, createInstanceInitNew = createInstanceInitNew, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEmbedObjectCreator]
  }
}

