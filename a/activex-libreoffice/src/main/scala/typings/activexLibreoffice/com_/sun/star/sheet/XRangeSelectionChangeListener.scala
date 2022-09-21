package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when the selected range is changed.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait XRangeSelectionChangeListener
  extends StObject
     with XEventListener {
  
  /** is called when the selected range is changed while range selection is active. */
  def descriptorChanged(aEvent: RangeSelectionEvent): Unit
}
object XRangeSelectionChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    descriptorChanged: RangeSelectionEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XRangeSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), descriptorChanged = js.Any.fromFunction1(descriptorChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRangeSelectionChangeListener]
  }
  
  extension [Self <: XRangeSelectionChangeListener](x: Self) {
    
    inline def setDescriptorChanged(value: RangeSelectionEvent => Unit): Self = StObject.set(x, "descriptorChanged", js.Any.fromFunction1(value))
  }
}
