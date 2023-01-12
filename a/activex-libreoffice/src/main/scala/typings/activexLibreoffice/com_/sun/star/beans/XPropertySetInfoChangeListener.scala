package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a listener for events related to XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeNotifier
  */
trait XPropertySetInfoChangeListener
  extends StObject
     with XEventListener {
  
  /** is called whenever changes of a {@link XPropertySetInfo} shall be propagated. */
  def propertySetInfoChange(evt: PropertySetInfoChangeEvent): Unit
}
object XPropertySetInfoChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertySetInfoChange: PropertySetInfoChangeEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XPropertySetInfoChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertySetInfoChange = js.Any.fromFunction1(propertySetInfoChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertySetInfoChangeListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPropertySetInfoChangeListener] (val x: Self) extends AnyVal {
    
    inline def setPropertySetInfoChange(value: PropertySetInfoChangeEvent => Unit): Self = StObject.set(x, "propertySetInfoChange", js.Any.fromFunction1(value))
  }
}
