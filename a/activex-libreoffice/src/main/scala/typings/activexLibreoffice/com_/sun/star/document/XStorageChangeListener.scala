package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to be notified when a document is switched to a new storage. */
trait XStorageChangeListener
  extends StObject
     with typings.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /**
    * is called when document switches to another storage.
    * @param xDocument the document that has changed the storage it is based on
    * @param xStorage the new storage the document is based on
    */
  def notifyStorageChange(xDocument: XInterface, xStorage: XStorage): Unit
}
object XStorageChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: typings.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    notifyStorageChange: (XInterface, XStorage) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStorageChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyStorageChange = js.Any.fromFunction2(notifyStorageChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStorageChangeListener]
  }
  
  @scala.inline
  implicit class XStorageChangeListenerMutableBuilder[Self <: XStorageChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyStorageChange(value: (XInterface, XStorage) => Unit): Self = StObject.set(x, "notifyStorageChange", js.Any.fromFunction2(value))
  }
}
