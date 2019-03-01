package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a temporary interface that is introduced to temporarily optimize the document storing process. PLEASE DO NOT USE IT, it might change in any
  * time and will be deprecated soon! Another solution will be introduced as final one.
  */
trait XOptimizedStorage extends js.Object {
  /**
    * allows to switch storage persistence to the provided URL. The caller is responsible to be sure that the file referenced by the URL contains the same
    * contents as the stream the storage is based currently. Thus using of this method is very dangerous and should be avoided when possible. It is
    * applicable only for root storages.
    */
  def attachToURL(sURL: java.lang.String, bReadOnly: scala.Boolean): scala.Unit
  /** allows to copy storage element directly, not guarantied to work. */
  def copyElementDirectlyTo(sSourceName: java.lang.String, xTargetStorage: XOptimizedStorage, sTargetName: java.lang.String): scala.Unit
  /**
    * fills the provided stream with the last flushed version of data from the child stream of the storage.
    * @param sStreamName the name of the substream that should be copied
    * @param xTargetStream the target stream where the data must be copied to
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def copyStreamElementData(
    sStreamName: java.lang.String,
    xTargetStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  ): scala.Unit
  /**
    * allows to get property of the child element with the specified name. The implementation of the method might allow to access only subset of the
    * supported by element properties.
    */
  def getElementPropertyValue(sElementName: java.lang.String, sPropertyName: java.lang.String): js.Any
  /** allows to insert a raw stream representing non-encrypted stream with header. */
  def insertRawNonEncrStreamElementDirect(
    sStreamName: java.lang.String,
    xInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): scala.Unit
  /** allows to insert a stream to the storage directly. The stream must stay alive till the storage is committed. */
  def insertStreamElementDirect(
    sStreamName: java.lang.String,
    xInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    aProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * allows to switch storage persistence to the provided stream. The stream will be filled by the storage. If an empty reference is provided, the storage
    * will create a temporary stream to switch to itself. It is applicable only for root storages.
    */
  def writeAndAttachToStream(xStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream): scala.Unit
}

object XOptimizedStorage {
  @scala.inline
  def apply(
    attachToURL: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    copyElementDirectlyTo: js.Function3[java.lang.String, XOptimizedStorage, java.lang.String, scala.Unit],
    copyStreamElementData: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, 
      scala.Unit
    ],
    getElementPropertyValue: js.Function2[java.lang.String, java.lang.String, js.Any],
    insertRawNonEncrStreamElementDirect: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ],
    insertStreamElementDirect: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    writeAndAttachToStream: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, scala.Unit]
  ): XOptimizedStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachToURL")(attachToURL)
    __obj.updateDynamic("copyElementDirectlyTo")(copyElementDirectlyTo)
    __obj.updateDynamic("copyStreamElementData")(copyStreamElementData)
    __obj.updateDynamic("getElementPropertyValue")(getElementPropertyValue)
    __obj.updateDynamic("insertRawNonEncrStreamElementDirect")(insertRawNonEncrStreamElementDirect)
    __obj.updateDynamic("insertStreamElementDirect")(insertStreamElementDirect)
    __obj.updateDynamic("writeAndAttachToStream")(writeAndAttachToStream)
    __obj.asInstanceOf[XOptimizedStorage]
  }
}

