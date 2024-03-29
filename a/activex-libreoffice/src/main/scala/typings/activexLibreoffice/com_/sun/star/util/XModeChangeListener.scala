package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to listen for changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeListener
  extends StObject
     with XEventListener {
  
  /** indicates that the mode of the broadcasting component has changed. */
  def modeChanged(rSource: ModeChangeEvent): Unit
}
object XModeChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    modeChanged: ModeChangeEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XModeChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), modeChanged = js.Any.fromFunction1(modeChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModeChangeListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XModeChangeListener] (val x: Self) extends AnyVal {
    
    inline def setModeChanged(value: ModeChangeEvent => Unit): Self = StObject.set(x, "modeChanged", js.Any.fromFunction1(value))
  }
}
