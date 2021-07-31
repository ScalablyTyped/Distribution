package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a listener for events related to XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentEventListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called whenever a content wishes to notify changes.
    * @param evt the event.
    */
  def contentEvent(evt: ContentEvent): Unit
}
object XContentEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    contentEvent: ContentEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), contentEvent = js.Any.fromFunction1(contentEvent), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentEventListener]
  }
  
  @scala.inline
  implicit class XContentEventListenerMutableBuilder[Self <: XContentEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentEvent(value: ContentEvent => Unit): Self = StObject.set(x, "contentEvent", js.Any.fromFunction1(value))
  }
}
