package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to user-visible strings for a solver. */
trait XSolverDescription
  extends StObject
     with XInterface {
  
  /** A user-visible name of the component. */
  var ComponentDescription: String
  
  /** After calling solve, a message describing the status (explaining why no solution was found). */
  var StatusDescription: String
  
  /** returns a short description for a property in the component's {@link com.sun.star.beans.XPropertySet} interface. */
  def getPropertyDescription(aPropertyName: String): String
}
object XSolverDescription {
  
  inline def apply(
    ComponentDescription: String,
    StatusDescription: String,
    acquire: () => Unit,
    getPropertyDescription: String => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSolverDescription = {
    val __obj = js.Dynamic.literal(ComponentDescription = ComponentDescription.asInstanceOf[js.Any], StatusDescription = StatusDescription.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPropertyDescription = js.Any.fromFunction1(getPropertyDescription), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSolverDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSolverDescription] (val x: Self) extends AnyVal {
    
    inline def setComponentDescription(value: String): Self = StObject.set(x, "ComponentDescription", value.asInstanceOf[js.Any])
    
    inline def setGetPropertyDescription(value: String => String): Self = StObject.set(x, "getPropertyDescription", js.Any.fromFunction1(value))
    
    inline def setStatusDescription(value: String): Self = StObject.set(x, "StatusDescription", value.asInstanceOf[js.Any])
  }
}
