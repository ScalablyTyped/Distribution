package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service provides a simple functionality to allow read/write the storages in OLE storage format. */
trait OLESimpleStorage extends XOLESimpleStorage {
  /**
    * is used to initialize the object on it's creation.
    * @param xInputStream [in] the InputStream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromInputStream(
    xInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    bNoTempCopy: scala.Boolean
  ): scala.Unit
  /**
    * is used to initialize the object on it's creation.
    * @param xStream [in] the Stream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromStream(xStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, bNoTempCopy: scala.Boolean): scala.Unit
}

object OLESimpleStorage {
  @scala.inline
  def apply(
    ClassID: stdLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    commit: () => scala.Unit,
    createFromInputStream: (activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Boolean) => scala.Unit,
    createFromStream: (activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, scala.Boolean) => scala.Unit,
    dispose: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getClassID: () => stdLib.SafeArray[scala.Double],
    getClassName: () => java.lang.String,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertByName: (java.lang.String, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit,
    revert: () => scala.Unit,
    setClassInfo: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String) => scala.Unit
  ): OLESimpleStorage = {
    val __obj = js.Dynamic.literal(ClassID = ClassID, ClassName = ClassName, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commit = js.Any.fromFunction0(commit), createFromInputStream = js.Any.fromFunction2(createFromInputStream), createFromStream = js.Any.fromFunction2(createFromStream), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeEventListener = js.Any.fromFunction1(removeEventListener), replaceByName = js.Any.fromFunction2(replaceByName), revert = js.Any.fromFunction0(revert), setClassInfo = js.Any.fromFunction2(setClassInfo))
  
    __obj.asInstanceOf[OLESimpleStorage]
  }
}

