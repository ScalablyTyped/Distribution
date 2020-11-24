package typings.activexLibreoffice.com_.sun.star.sdb.application

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the interface required to listen for progress in copying table rows via a `CopyTableWizard` .
  * @see CopyTableRowEvent
  * @see CopyTableWizard
  */
@js.native
trait XCopyTableListener extends XEventListener {
  
  /**
    * is called when a row was successfully copied.
    *
    * This method is called right after a row has been successfully copied. It might be used, for instance, to update a progress indicator.
    * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which was just copied to t
    */
  def copiedRow(Event: CopyTableRowEvent): Unit = js.native
  
  /**
    * is called when copying a row failed.
    * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which was attempted to be
    * @returns how to continue with copying. Must be one of the {@link CopyTableContinuation} constants.
    */
  def copyRowError(Event: CopyTableRowEvent): Double = js.native
  
  /**
    * is called when a row is about to be copied.
    *
    * This method is called immediately before a row is copied. It might be used, for instance, to update a progress indicator.
    * @param Event describes the current state of the copy operation. {@link CopyTableRowEvent.SourceData} is positioned at the row which is about to be copied.
    */
  def copyingRow(Event: CopyTableRowEvent): Unit = js.native
}
object XCopyTableListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    copiedRow: CopyTableRowEvent => Unit,
    copyRowError: CopyTableRowEvent => Double,
    copyingRow: CopyTableRowEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCopyTableListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copiedRow = js.Any.fromFunction1(copiedRow), copyRowError = js.Any.fromFunction1(copyRowError), copyingRow = js.Any.fromFunction1(copyingRow), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCopyTableListener]
  }
  
  @scala.inline
  implicit class XCopyTableListenerOps[Self <: XCopyTableListener] (val x: Self) extends AnyVal {
    
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
    def setCopiedRow(value: CopyTableRowEvent => Unit): Self = this.set("copiedRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyRowError(value: CopyTableRowEvent => Double): Self = this.set("copyRowError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyingRow(value: CopyTableRowEvent => Unit): Self = this.set("copyingRow", js.Any.fromFunction1(value))
  }
}
