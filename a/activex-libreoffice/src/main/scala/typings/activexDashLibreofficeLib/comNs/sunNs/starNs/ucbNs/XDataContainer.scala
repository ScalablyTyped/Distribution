package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a container for (binary) data.
  *
  * A data container may contain data and/or other data containers. A typical container with children is a MIME message with attachments.
  * @author Kai Sommerfeld
  * @deprecated Deprecated
  * @version 1.0
  */
trait XDataContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer {
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  var ContentType: java.lang.String
  /**
    * returns the data of the data container.
    * @returns the data
    */
  var Data: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  var DataURL: java.lang.String
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  def getContentType(): java.lang.String
  /**
    * returns the data of the data container.
    * @returns the data
    */
  def getData(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def getDataURL(): java.lang.String
  /**
    * sets the content type (MIME Type) of the data container.
    * @param aType the content type
    */
  def setContentType(aType: java.lang.String): scala.Unit
  /**
    * sets the data of the data container.
    * @param aData the data
    */
  def setData(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def setDataURL(aURL: java.lang.String): scala.Unit
}

object XDataContainer {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    Count: scala.Double,
    Data: activexDashInteropLib.SafeArray[scala.Double],
    DataURL: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getContentType: js.Function0[java.lang.String],
    getCount: js.Function0[scala.Double],
    getData: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getDataURL: js.Function0[java.lang.String],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setContentType: js.Function1[java.lang.String, scala.Unit],
    setData: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    setDataURL: js.Function1[java.lang.String, scala.Unit]
  ): XDataContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentType")(ContentType)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("DataURL")(DataURL)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getContentType")(getContentType)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getDataURL")(getDataURL)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByIndex")(insertByIndex)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByIndex")(removeByIndex)
    __obj.updateDynamic("replaceByIndex")(replaceByIndex)
    __obj.updateDynamic("setContentType")(setContentType)
    __obj.updateDynamic("setData")(setData)
    __obj.updateDynamic("setDataURL")(setDataURL)
    __obj.asInstanceOf[XDataContainer]
  }
}

