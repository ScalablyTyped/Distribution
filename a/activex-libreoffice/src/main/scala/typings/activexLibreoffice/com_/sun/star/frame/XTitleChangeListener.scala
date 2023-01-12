package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to receive notifications when the frame title changes */
trait XTitleChangeListener
  extends StObject
     with XEventListener {
  
  /** The frame title has changed */
  def titleChanged(aEvent: TitleChangedEvent): Unit
}
object XTitleChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    titleChanged: TitleChangedEvent => Unit
  ): XTitleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), titleChanged = js.Any.fromFunction1(titleChanged))
    __obj.asInstanceOf[XTitleChangeListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTitleChangeListener] (val x: Self) extends AnyVal {
    
    inline def setTitleChanged(value: TitleChangedEvent => Unit): Self = StObject.set(x, "titleChanged", js.Any.fromFunction1(value))
  }
}
