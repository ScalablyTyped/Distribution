package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a single token within a formula. */
trait FormulaToken extends StObject {
  
  /**
    * is additional data in the token, depending on the OpCode.
    * @see com.sun.star.sheet.NamedRange.TokenIndex
    * @see com.sun.star.sheet.DatabaseRange.TokenIndex
    */
  var Data: Any
  
  /**
    * is the OpCode of the token.
    * @see com.sun.star.sheet.XFormulaOpCodeMapper
    */
  var OpCode: Double
}
object FormulaToken {
  
  inline def apply(Data: Any, OpCode: Double): FormulaToken = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], OpCode = OpCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaToken]
  }
  
  extension [Self <: FormulaToken](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setOpCode(value: Double): Self = StObject.set(x, "OpCode", value.asInstanceOf[js.Any])
  }
}
