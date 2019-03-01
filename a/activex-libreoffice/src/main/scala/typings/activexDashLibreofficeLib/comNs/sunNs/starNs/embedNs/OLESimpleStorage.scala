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
    ClassID: activexDashInteropLib.SafeArray[scala.Double],
    ClassName: java.lang.String,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    commit: js.Function0[scala.Unit],
    createFromInputStream: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Boolean, 
      scala.Unit
    ],
    createFromStream: js.Function2[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, scala.Boolean, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getClassID: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getClassName: js.Function0[java.lang.String],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    revert: js.Function0[scala.Unit],
    setClassInfo: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      scala.Unit
    ]
  ): OLESimpleStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClassID")(ClassID)
    __obj.updateDynamic("ClassName")(ClassName)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("createFromInputStream")(createFromInputStream)
    __obj.updateDynamic("createFromStream")(createFromStream)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getClassID")(getClassID)
    __obj.updateDynamic("getClassName")(getClassName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByName")(insertByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("replaceByName")(replaceByName)
    __obj.updateDynamic("revert")(revert)
    __obj.updateDynamic("setClassInfo")(setClassInfo)
    __obj.asInstanceOf[OLESimpleStorage]
  }
}

