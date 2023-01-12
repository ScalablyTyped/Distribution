package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterizedStatement extends StObject {
  
  /**
    *  The parameter values. 
    */
  var Parameters: js.UndefOr[PreparedStatementParameters] = js.undefined
  
  /**
    *  A PartiQL statment that uses parameters. 
    */
  var Statement: PartiQLStatement
}
object ParameterizedStatement {
  
  inline def apply(Statement: PartiQLStatement): ParameterizedStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterizedStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterizedStatement] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PreparedStatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setStatement(value: PartiQLStatement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
  }
}
