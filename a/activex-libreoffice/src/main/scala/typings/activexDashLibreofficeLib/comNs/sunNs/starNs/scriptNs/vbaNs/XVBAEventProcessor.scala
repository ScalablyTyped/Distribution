package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Executes VBA event handlers. */
trait XVBAEventProcessor extends js.Object {
  /**
    * Returns whether a VBA event handler exists.
    * @param nEventId The identifier of the event. Must be a constant from {@link VBAEventId} .
    * @param aArgs Additional arguments needed to identify some event handlers, e.g. a sheet index for spreadsheet events.
    * @returns `TRUE` , if the VBA event handler exists. `FALSE` , for all other cases.
    */
  def hasVbaEventHandler(nEventId: scala.Double, aArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Boolean
  /**
    * Executes a VBA event handler.
    * @param nEventId The identifier of the event. Must be a constant from {@link VBAEventId} .
    * @param aArgs The input arguments needed to create the argument list of the VBA event handler.
    * @returns `TRUE` , if event handing is enabled, and the event handler macro exists and has been invoked.
    * @throws com::sun::star::lang::IllegalArgumentException if the passed event identifier is not supported, or if the passed arguments do not conform to the
    * @throws com::sun::star::util::VetoException if the VBA event handler has indicated to veto the event.
    */
  def processVbaEvent(nEventId: scala.Double, aArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): scala.Boolean
}

object XVBAEventProcessor {
  @scala.inline
  def apply(
    hasVbaEventHandler: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Boolean,
    processVbaEvent: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Boolean
  ): XVBAEventProcessor = {
    val __obj = js.Dynamic.literal(hasVbaEventHandler = js.Any.fromFunction2(hasVbaEventHandler), processVbaEvent = js.Any.fromFunction2(processVbaEvent))
  
    __obj.asInstanceOf[XVBAEventProcessor]
  }
}

