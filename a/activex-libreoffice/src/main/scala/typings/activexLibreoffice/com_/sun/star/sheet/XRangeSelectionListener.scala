package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when range selection is completed or aborted.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionListener
  extends StObject
     with XEventListener {
  
  /** is called when range selection is aborted. */
  def aborted(aEvent: RangeSelectionEvent): Unit
  
  /** is called when range selection is completed. */
  def done(aEvent: RangeSelectionEvent): Unit
}
object XRangeSelectionListener {
  
  inline def apply(
    aborted: RangeSelectionEvent => Unit,
    acquire: () => Unit,
    disposing: EventObject => Unit,
    done: RangeSelectionEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XRangeSelectionListener = {
    val __obj = js.Dynamic.literal(aborted = js.Any.fromFunction1(aborted), acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), done = js.Any.fromFunction1(done), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRangeSelectionListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRangeSelectionListener] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: RangeSelectionEvent => Unit): Self = StObject.set(x, "aborted", js.Any.fromFunction1(value))
    
    inline def setDone(value: RangeSelectionEvent => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
  }
}
