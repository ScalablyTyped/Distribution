package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
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
  implicit class XRangeHighlighterMutableBuilder[Self <: XRangeHighlighter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = StObject.set(x, "addSelectionChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectedRanges(value: () => SafeArray[HighlightedRange]): Self = StObject.set(x, "getSelectedRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSelectionChangeListener(value: XSelectionChangeListener => Unit): Self = StObject.set(x, "removeSelectionChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedRanges(value: SafeArray[HighlightedRange]): Self = StObject.set(x, "SelectedRanges", value.asInstanceOf[js.Any])
  }
}
