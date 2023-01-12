package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for running an action.
  * @since OOo 1.1.2
  */
trait XAction
  extends StObject
     with XInterface {
  
  /**
    * Action to be done.
    * @returns result
    * @throws com::sun::star::uno::Exception any UNO exception may be thrown
    */
  def run(): Any
}
object XAction {
  
  inline def apply(acquire: () => Unit, queryInterface: `type` => Any, release: () => Unit, run: () => Any): XAction = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[XAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAction] (val x: Self) extends AnyVal {
    
    inline def setRun(value: () => Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
  }
}
