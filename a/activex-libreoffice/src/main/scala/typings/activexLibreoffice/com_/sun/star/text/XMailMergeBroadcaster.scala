package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for adding/removing of mail merge event listeners.
  *
  * Registered listeners will be notified with a {@link com.sun.star.text.MailMergeEvent} when a document is about to get merged.
  * @see com.sun.star.text.MailMergeEvent
  * @see com.sun.star.text.MailMerge
  * @since OOo 1.1.2
  */
trait XMailMergeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds an entry to the list of mail merge listeners.
    * @param xListener The listener to be added.
    */
  def addMailMergeEventListener(xListener: XMailMergeListener): Unit
  
  /**
    * Removes an entry to the list of mail merge listeners.
    * @param xListener The listener to be removed.
    */
  def removeMailMergeEventListener(xListener: XMailMergeListener): Unit
}
object XMailMergeBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addMailMergeEventListener: XMailMergeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMailMergeEventListener: XMailMergeListener => Unit
  ): XMailMergeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addMailMergeEventListener = js.Any.fromFunction1(addMailMergeEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMailMergeEventListener = js.Any.fromFunction1(removeMailMergeEventListener))
    __obj.asInstanceOf[XMailMergeBroadcaster]
  }
  
  @scala.inline
  implicit class XMailMergeBroadcasterMutableBuilder[Self <: XMailMergeBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMailMergeEventListener(value: XMailMergeListener => Unit): Self = StObject.set(x, "addMailMergeEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMailMergeEventListener(value: XMailMergeListener => Unit): Self = StObject.set(x, "removeMailMergeEventListener", js.Any.fromFunction1(value))
  }
}
