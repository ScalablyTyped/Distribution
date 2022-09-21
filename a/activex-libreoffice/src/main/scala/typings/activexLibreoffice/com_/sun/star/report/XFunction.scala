package typings.activexLibreoffice.com_.sun.star.report

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Optional
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a format condition for a control. */
trait XFunction
  extends StObject
     with XPropertySet
     with XComponent
     with XChild {
  
  /** specifies if sub reports should be traversed as well. */
  var DeepTraversing: Boolean
  
  /** defines the formula of this function */
  var Formula: String
  
  /** defines the formula for the initial value */
  var InitialFormula: Optional[String]
  
  /** defines the name of the function */
  var Name: String
  
  /** specifies if the function should be evaluated before the report element will be executed. */
  var PreEvaluated: Boolean
}
object XFunction {
  
  inline def apply(
    DeepTraversing: Boolean,
    Formula: String,
    InitialFormula: Optional[String],
    Name: String,
    Parent: XInterface,
    PreEvaluated: Boolean,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getParent: () => XInterface,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setParent: XInterface => Unit,
    setPropertyValue: (String, Any) => Unit
  ): XFunction = {
    val __obj = js.Dynamic.literal(DeepTraversing = DeepTraversing.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], InitialFormula = InitialFormula.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PreEvaluated = PreEvaluated.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XFunction]
  }
  
  extension [Self <: XFunction](x: Self) {
    
    inline def setDeepTraversing(value: Boolean): Self = StObject.set(x, "DeepTraversing", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setInitialFormula(value: Optional[String]): Self = StObject.set(x, "InitialFormula", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPreEvaluated(value: Boolean): Self = StObject.set(x, "PreEvaluated", value.asInstanceOf[js.Any])
  }
}
