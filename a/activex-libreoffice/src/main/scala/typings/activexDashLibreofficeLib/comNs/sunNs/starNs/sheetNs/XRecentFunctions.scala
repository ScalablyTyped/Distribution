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
  var RecentFunctionIds: stdLib.SafeArray[scala.Double]
  /** returns the maximum number of entries that will be stored as recently used functions. */
  def getMaxRecentFunctions(): scala.Double
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  def getRecentFunctionIds(): stdLib.SafeArray[scala.Double]
  /**
    * sets the list of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @param aRecentFunctionIds the sequence of function identifiers most recently used.
    */
  def setRecentFunctionIds(aRecentFunctionIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object XRecentFunctions {
  @scala.inline
  def apply(
    MaxRecentFunctions: scala.Double,
    RecentFunctionIds: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getMaxRecentFunctions: () => scala.Double,
    getRecentFunctionIds: () => stdLib.SafeArray[scala.Double],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setRecentFunctionIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XRecentFunctions = {
    val __obj = js.Dynamic.literal(MaxRecentFunctions = MaxRecentFunctions, RecentFunctionIds = RecentFunctionIds, acquire = js.Any.fromFunction0(acquire), getMaxRecentFunctions = js.Any.fromFunction0(getMaxRecentFunctions), getRecentFunctionIds = js.Any.fromFunction0(getRecentFunctionIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRecentFunctionIds = js.Any.fromFunction1(setRecentFunctionIds))
  
    __obj.asInstanceOf[XRecentFunctions]
  }
}

