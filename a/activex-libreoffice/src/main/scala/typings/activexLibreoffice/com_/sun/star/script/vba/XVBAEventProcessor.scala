package typings.activexLibreoffice.com_.sun.star.script.vba

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Executes VBA event handlers. */
@js.native
trait XVBAEventProcessor extends js.Object {
  
  /**
    * Returns whether a VBA event handler exists.
    * @param nEventId The identifier of the event. Must be a constant from {@link VBAEventId} .
    * @param aArgs Additional arguments needed to identify some event handlers, e.g. a sheet index for spreadsheet events.
    * @returns `TRUE` , if the VBA event handler exists. `FALSE` , for all other cases.
    */
  def hasVbaEventHandler(nEventId: Double, aArgs: SeqEquiv[_]): Boolean = js.native
  
  /**
    * Executes a VBA event handler.
    * @param nEventId The identifier of the event. Must be a constant from {@link VBAEventId} .
    * @param aArgs The input arguments needed to create the argument list of the VBA event handler.
    * @returns `TRUE` , if event handing is enabled, and the event handler macro exists and has been invoked.
    * @throws com::sun::star::lang::IllegalArgumentException if the passed event identifier is not supported, or if the passed arguments do not conform to the
    * @throws com::sun::star::util::VetoException if the VBA event handler has indicated to veto the event.
    */
  def processVbaEvent(nEventId: Double, aArgs: SeqEquiv[_]): Boolean = js.native
}
object XVBAEventProcessor {
  
  @scala.inline
  def apply(
    hasVbaEventHandler: (Double, SeqEquiv[_]) => Boolean,
    processVbaEvent: (Double, SeqEquiv[_]) => Boolean
  ): XVBAEventProcessor = {
    val __obj = js.Dynamic.literal(hasVbaEventHandler = js.Any.fromFunction2(hasVbaEventHandler), processVbaEvent = js.Any.fromFunction2(processVbaEvent))
    __obj.asInstanceOf[XVBAEventProcessor]
  }
  
  @scala.inline
  implicit class XVBAEventProcessorOps[Self <: XVBAEventProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasVbaEventHandler(value: (Double, SeqEquiv[_]) => Boolean): Self = this.set("hasVbaEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessVbaEvent(value: (Double, SeqEquiv[_]) => Boolean): Self = this.set("processVbaEvent", js.Any.fromFunction2(value))
  }
}
