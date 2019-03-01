package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface extends {@link XHierarchicalStorageAccess} interface. */
trait XHierarchicalStorageAccess2 extends XHierarchicalStorageAccess {
  /**
    * allows to get access to a child encrypted stream with encryption data using hierarchical path.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the path to the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @param aEncryptionData this parameter allowes to specify an encryption data for the stream, the data must be correct, otherwise an exception will be thrown
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openEncryptedStreamByHierarchicalName(
    sStreamName: java.lang.String,
    nOpenMode: scala.Double,
    aEncryptionData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): XExtendedStorageStream
}

object XHierarchicalStorageAccess2 {
  @scala.inline
  def apply(
    openEncryptedStreamByHierarchicalName: js.Function3[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XExtendedStorageStream
    ],
    openEncryptedStreamElementByHierarchicalName: js.Function3[java.lang.String, scala.Double, java.lang.String, XExtendedStorageStream],
    openStreamElementByHierarchicalName: js.Function2[java.lang.String, scala.Double, XExtendedStorageStream],
    removeStreamElementByHierarchicalName: js.Function1[java.lang.String, scala.Unit]
  ): XHierarchicalStorageAccess2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openEncryptedStreamByHierarchicalName")(openEncryptedStreamByHierarchicalName)
    __obj.updateDynamic("openEncryptedStreamElementByHierarchicalName")(openEncryptedStreamElementByHierarchicalName)
    __obj.updateDynamic("openStreamElementByHierarchicalName")(openStreamElementByHierarchicalName)
    __obj.updateDynamic("removeStreamElementByHierarchicalName")(removeStreamElementByHierarchicalName)
    __obj.asInstanceOf[XHierarchicalStorageAccess2]
  }
}

