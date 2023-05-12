package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationConfiguration extends StObject {
  
  /**
    * A string that contains the code for the calculation.
    */
  var CodeBlock: js.UndefOr[typings.awsSdk.clientsAthenaMod.CodeBlock] = js.undefined
}
object CalculationConfiguration {
  
  inline def apply(): CalculationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCodeBlock(value: CodeBlock): Self = StObject.set(x, "CodeBlock", value.asInstanceOf[js.Any])
    
    inline def setCodeBlockUndefined: Self = StObject.set(x, "CodeBlock", js.undefined)
  }
}
