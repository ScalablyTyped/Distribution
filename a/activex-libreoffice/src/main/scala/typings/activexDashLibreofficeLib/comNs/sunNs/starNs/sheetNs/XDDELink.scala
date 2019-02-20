package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a DDE link.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.DDELink
  */
trait XDDELink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the application from which data are requested (the DDE server application). */
  val Application: java.lang.String
  /** returns the DDE item from which data are requested. */
  val Item: java.lang.String
  /** returns the DDE topic from which data are requested. */
  val Topic: java.lang.String
  /** returns the application from which data are requested (the DDE server application). */
  def getApplication(): java.lang.String
  /** returns the DDE item from which data are requested. */
  def getItem(): java.lang.String
  /** returns the DDE topic from which data are requested. */
  def getTopic(): java.lang.String
}

