package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a collection of scenarios. */
trait XScenariosSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  val Scenarios: XScenarios
  
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  def getScenarios(): XScenarios
}
object XScenariosSupplier {
  
  inline def apply(
    Scenarios: XScenarios,
    acquire: () => Unit,
    getScenarios: () => XScenarios,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XScenariosSupplier = {
    val __obj = js.Dynamic.literal(Scenarios = Scenarios.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getScenarios = js.Any.fromFunction0(getScenarios), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScenariosSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XScenariosSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetScenarios(value: () => XScenarios): Self = StObject.set(x, "getScenarios", js.Any.fromFunction0(value))
    
    inline def setScenarios(value: XScenarios): Self = StObject.set(x, "Scenarios", value.asInstanceOf[js.Any])
  }
}
