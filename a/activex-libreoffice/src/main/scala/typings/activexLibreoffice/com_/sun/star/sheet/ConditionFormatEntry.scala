package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionFormatEntry
  extends StObject
     with XConditionEntry {
  
  var Formula1: String
  
  var Formula2: String
  
  /** See {@link com.sun.star.sheet.ConditionFormatOperator} for valid values */
  var Operator: Double
  
  var StyleName: String
}
object ConditionFormatEntry {
  
  inline def apply(
    Formula1: String,
    Formula2: String,
    Operator: Double,
    StyleName: String,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): ConditionFormatEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ConditionFormatEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionFormatEntry] (val x: Self) extends AnyVal {
    
    inline def setFormula1(value: String): Self = StObject.set(x, "Formula1", value.asInstanceOf[js.Any])
    
    inline def setFormula2(value: String): Self = StObject.set(x, "Formula2", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
  }
}
