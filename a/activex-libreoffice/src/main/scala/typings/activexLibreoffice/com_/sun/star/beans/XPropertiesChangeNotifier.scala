package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a notifier for changed property values
  * @see XPropertiesChangeListener
  */
trait XPropertiesChangeNotifier
  extends StObject
     with XInterface {
  
  /** adds an {@link XPropertiesChangeListener} to the specified properties with the specified names. */
  def addPropertiesChangeListener(PropertyNames: SeqEquiv[String], Listener: XPropertiesChangeListener): Unit
  
  /** removes an {@link XPropertiesChangeListener} from the listener list. */
  def removePropertiesChangeListener(PropertyNames: SeqEquiv[String], Listener: XPropertiesChangeListener): Unit
}
object XPropertiesChangeNotifier {
  
  inline def apply(
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit
  ): XPropertiesChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener))
    __obj.asInstanceOf[XPropertiesChangeNotifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPropertiesChangeNotifier] (val x: Self) extends AnyVal {
    
    inline def setAddPropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = StObject.set(x, "addPropertiesChangeListener", js.Any.fromFunction2(value))
    
    inline def setRemovePropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = StObject.set(x, "removePropertiesChangeListener", js.Any.fromFunction2(value))
  }
}
