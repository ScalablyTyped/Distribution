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
  var Data: stdLib.SafeArray[scala.Double]
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
  def getData(): stdLib.SafeArray[scala.Double]
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
    Data: stdLib.SafeArray[scala.Double],
    DataURL: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getContentType: () => java.lang.String,
    getCount: () => scala.Double,
    getData: () => stdLib.SafeArray[scala.Double],
    getDataURL: () => java.lang.String,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    insertByIndex: (scala.Double, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByIndex: scala.Double => scala.Unit,
    replaceByIndex: (scala.Double, js.Any) => scala.Unit,
    setContentType: java.lang.String => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    setDataURL: java.lang.String => scala.Unit
  ): XDataContainer = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, Count = Count, Data = Data, DataURL = DataURL, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getContentType = js.Any.fromFunction0(getContentType), getCount = js.Any.fromFunction0(getCount), getData = js.Any.fromFunction0(getData), getDataURL = js.Any.fromFunction0(getDataURL), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setContentType = js.Any.fromFunction1(setContentType), setData = js.Any.fromFunction1(setData), setDataURL = js.Any.fromFunction1(setDataURL))
  
    __obj.asInstanceOf[XDataContainer]
  }
}

