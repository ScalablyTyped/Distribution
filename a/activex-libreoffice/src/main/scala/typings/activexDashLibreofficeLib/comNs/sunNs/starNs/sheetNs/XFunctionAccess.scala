package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows generic access to all spreadsheet functions.
  * @see com.sun.star.sheet.FunctionAccess
  */
trait XFunctionAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * calls a function and returns the result of the call.
    * @param aName the (programmatic) name of the function.
    * @param aArguments the arguments for the function call. Each element must be of one of the following types:  **long or double**: for a numeric value.;
    * @returns the result of the function call.  Possible types for the result are:  **VOID**: if no result is available.;   **double**: for a numeric result.;
    * @throws com::sun::star::container::NoSuchElementException if the named function does not exist.
    * @throws com::sun::star::lang::IllegalArgumentException if the function can not be called with these arguments.
    */
  def callFunction(aName: java.lang.String, aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): js.Any
}

object XFunctionAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    callFunction: js.Function2[java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFunctionAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire, callFunction = callFunction, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFunctionAccess]
  }
}

