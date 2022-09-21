package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An instance of this interface is used by the {@link XGridRowSelection} to get notifications about selection changes. */
trait XGridSelectionListener
  extends StObject
     with XEventListener {
  
  /** Invoked after a selection was changed. */
  def selectionChanged(gridSelectionEvent: GridSelectionEvent): Unit
}
object XGridSelectionListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    selectionChanged: GridSelectionEvent => Unit
  ): XGridSelectionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectionChanged = js.Any.fromFunction1(selectionChanged))
    __obj.asInstanceOf[XGridSelectionListener]
  }
  
  extension [Self <: XGridSelectionListener](x: Self) {
    
    inline def setSelectionChanged(value: GridSelectionEvent => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
  }
}
