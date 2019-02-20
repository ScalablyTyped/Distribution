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

