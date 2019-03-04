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
    val __obj = js.Dynamic.literal(ContentType = ContentType, Count = Count, Data = Data, DataURL = DataURL, ElementType = ElementType, acquire = acquire, getByIndex = getByIndex, getContentType = getContentType, getCount = getCount, getData = getData, getDataURL = getDataURL, getElementType = getElementType, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, replaceByIndex = replaceByIndex, setContentType = setContentType, setData = setData, setDataURL = setDataURL)
  
    __obj.asInstanceOf[XDataContainer]
  }
}

