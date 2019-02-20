package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an implementation for embedded object persistence.
  *
  * The idea is that any usable embedded object should be initialized with an entry in the parent storage that will be used as persistent representation.
  */
trait XEmbedPersist extends XCommonEmbedPersist {
  /**
    * allows to retrieve the current object entry name.
    * @returns the object entry name if any
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  val EntryName: java.lang.String
  /**
    * allows to retrieve the current object entry name.
    * @returns the object entry name if any
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def getEntryName(): java.lang.String
  /**
    * allows to detect if the object has entry.
    * @returns `TRUE` if the object has own entry set `FALSE` otherwise
    */
  def hasEntry(): scala.Boolean
  /**
    * specifies whether the object should use an old storage or a new one after "save as" operation.
    * @param bUseNew `TRUE` the new storage should be used `FALSE` the old one
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def saveCompleted(bUseNew: scala.Boolean): scala.Unit
  /**
    * provides object with a parent storage and a name for object's entry.
    *
    * An entry with the specified name should be created/opened inside provided storage. It can be a storage or a stream. For example, OOo API will refer to
    * OLE storages only by streams, but the object implementation will use storage based on this stream.
    *
    * Factory does this call to initialize the embedded object. The linked object can be initialized by factory in different way ( internally ).
    *
    * It is also possible to switch object persistent representation through this call. Actually this is the way, this call can be used by user ( since
    * initialization is done by factory ).
    * @param xStorage a parent storage the entry should be created in
    * @param sEntName a name for the entry
    * @param nEntryConnectionMode a mode in which the object should be initialized from entry can take values from {@link EntryInitModes} constant set
    * @param aMediaArgs optional parameters for the embedded document persistence initialization, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object persistence initialization, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def setPersistentEntry(
    xStorage: XStorage,
    sEntName: java.lang.String,
    nEntryConnectionMode: scala.Double,
    aMediaArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * lets the object store itself to an entry in destination storage and prepare to use the new entry for own persistence.
    *
    * The object should be stored to the new entry, after that the entry should be remembered by the object. After the storing process is finished the
    * {@link XEmbedPersist.saveCompleted()} method can be used to specify whether the object should use the new entry or the old one. The object persistence
    * can not be used until {@link XEmbedPersist.saveCompleted()} is called. So this state can be treated as "HandsOff" state.
    * @param xStorage a parent storage the entry should be created in
    * @param sEntName a name for the entry
    * @param aMediaArgs optional parameters for document saving, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object saving, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during storing
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeAsEntry(
    xStorage: XStorage,
    sEntName: java.lang.String,
    aMediaArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * lets the object store itself to an entry in destination storage, the own persistence entry is not changed.
    * @param xStorage a parent storage the entry should be created inside
    * @param sEntName a name for the entry
    * @param aMediaArgs optional parameters for document saving, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object saving, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during storing
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeToEntry(
    xStorage: XStorage,
    sEntName: java.lang.String,
    aMediaArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aObjectArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

