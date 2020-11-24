package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRangeHighlighter extends XInterface {
  
  /** Returns a list of ranges that are used by objects that are currently selected. */
  val SelectedRanges: SafeArray[HighlightedRange] = js.native
  
  /** registers an event listener, which is called when the selection is changed and affects different source ranges */
  def addSelectionChangeListener(xListener: XSelectionChangeListener): Unit = js.native
  
  /** Returns a list of ranges that are used by objects that are currently selected. */
  def getSelectedRanges(): SafeArray[HighlightedRange] = js.native
  
  /** unregisters an event listener which was registered with {@link XRangeHighlighter.addSelectionChangeListener()} before. */
  def removeSelectionChangeListener(xListener: XSelectionChangeListener): Unit = js.native
}
object XRangeHighlighter {
  
  @scala.inline
  def apply(
    SelectedRanges: SafeArray[HighlightedRange],
    acquire: () => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    getSelectedRanges: () => SafeArray[HighlightedRange],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit
  ): XRangeHighlighter = {
    val __obj = js.Dynamic.literal(SelectedRanges = SelectedRanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getSelectedRanges = js.Any.fromFunction0(getSelectedRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener))
    __obj.asInstanceOf[XRangeHighlighter]
  }
  
  @scala.inline
  implicit class XRangeHighlighterOps[Self <: XRangeHighlighter] (val x: Self) extends AnyVal {
    
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
    def setSelectedRanges(value: SafeArray[HighlightedRange]): Self = this.set("SelectedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = this.set("addSelectionChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectedRanges(value: () => SafeArray[HighlightedRange]): Self = this.set("getSelectedRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = this.set("removeSelectionChangeListener", js.Any.fromFunction1(value))
  }
}
