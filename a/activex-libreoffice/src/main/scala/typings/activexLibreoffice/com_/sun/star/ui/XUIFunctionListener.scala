package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * special interface to receive notification that a user interface element will execute a function.
  * @since OOo 2.0
  */
trait XUIFunctionListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called to notify a component that a user interface element wants to execute a function.
    * @param aUIElementName a string which identifies the user interface element that wants to execute a function.
    * @param aCommand a string which identifies the function that has been selected by a user.
    */
  def functionExecute(aUIElementName: String, aCommand: String): Unit
}
object XUIFunctionListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    functionExecute: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIFunctionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), functionExecute = js.Any.fromFunction2(functionExecute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIFunctionListener]
  }
  
  @scala.inline
  implicit class XUIFunctionListenerMutableBuilder[Self <: XUIFunctionListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionExecute(value: (String, String) => Unit): Self = StObject.set(x, "functionExecute", js.Any.fromFunction2(value))
  }
}
