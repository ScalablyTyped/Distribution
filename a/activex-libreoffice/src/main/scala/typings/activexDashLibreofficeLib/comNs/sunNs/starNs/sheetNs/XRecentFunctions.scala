package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a list of recently used functions.
  * @see com.sun.star.sheet.RecentFunctions
  */
trait XRecentFunctions
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the maximum number of entries that will be stored as recently used functions. */
  val MaxRecentFunctions: scala.Double
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  var RecentFunctionIds: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the maximum number of entries that will be stored as recently used functions. */
  def getMaxRecentFunctions(): scala.Double
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  def getRecentFunctionIds(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * sets the list of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @param aRecentFunctionIds the sequence of function identifiers most recently used.
    */
  def setRecentFunctionIds(aRecentFunctionIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

