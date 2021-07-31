package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.XSingleComponentFactory
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the internal structure of a configurable user interface element.
  *
  * No assumption is made about any graphical representation: You could have a menu or a toolbar working with the same {@link UIElementSettings} although
  * limitations based on the real user interface element may be visible.
  * @since OOo 2.0
  */
trait UIElementSettings
  extends StObject
     with XIndexAccess
     with XSingleComponentFactory {
  
  /**
    * determine an optional user interface name of the user interface element.
    *
    * A toolbar can show a its user interface name on the window title, when it is in floating mode.
    */
  var UIName: String
}
object UIElementSettings {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    UIName: String,
    acquire: () => Unit,
    createInstanceWithArgumentsAndContext: (SeqEquiv[js.Any], XComponentContext) => XInterface,
    createInstanceWithContext: XComponentContext => XInterface,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): UIElementSettings = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], UIName = UIName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction2(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction1(createInstanceWithContext), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[UIElementSettings]
  }
  
  @scala.inline
  implicit class UIElementSettingsMutableBuilder[Self <: UIElementSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUIName(value: String): Self = StObject.set(x, "UIName", value.asInstanceOf[js.Any])
  }
}
