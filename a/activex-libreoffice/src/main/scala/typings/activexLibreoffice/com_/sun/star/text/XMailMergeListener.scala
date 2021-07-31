package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to notify listeners about mail merge events.
  *
  * Registered listeners will be notified with a {@link com.sun.star.text.MailMergeEvent} when a document is about to get merged.
  * @see com.sun.star.text.MailMerge
  * @see com.sun.star.text.MailMergeEvent
  * @since OOo 1.1.2
  */
trait XMailMergeListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the listener about mail merge events.
    * @param aEvent The Event containing the model of the document to be merged that is send to the listener.
    */
  def notifyMailMergeEvent(aEvent: MailMergeEvent): Unit
}
object XMailMergeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    notifyMailMergeEvent: MailMergeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMailMergeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), notifyMailMergeEvent = js.Any.fromFunction1(notifyMailMergeEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMailMergeListener]
  }
  
  @scala.inline
  implicit class XMailMergeListenerMutableBuilder[Self <: XMailMergeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyMailMergeEvent(value: MailMergeEvent => Unit): Self = StObject.set(x, "notifyMailMergeEvent", js.Any.fromFunction1(value))
  }
}
