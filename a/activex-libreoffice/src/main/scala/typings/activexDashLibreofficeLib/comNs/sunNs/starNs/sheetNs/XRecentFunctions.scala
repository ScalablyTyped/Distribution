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

object XRecentFunctions {
  @scala.inline
  def apply(
    MaxRecentFunctions: scala.Double,
    RecentFunctionIds: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    getMaxRecentFunctions: js.Function0[scala.Double],
    getRecentFunctionIds: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setRecentFunctionIds: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XRecentFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MaxRecentFunctions")(MaxRecentFunctions)
    __obj.updateDynamic("RecentFunctionIds")(RecentFunctionIds)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMaxRecentFunctions")(getMaxRecentFunctions)
    __obj.updateDynamic("getRecentFunctionIds")(getRecentFunctionIds)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setRecentFunctionIds")(setRecentFunctionIds)
    __obj.asInstanceOf[XRecentFunctions]
  }
}

