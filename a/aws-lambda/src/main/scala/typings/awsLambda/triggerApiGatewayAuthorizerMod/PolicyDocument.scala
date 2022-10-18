package typings.awsLambda.triggerApiGatewayAuthorizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDocument extends StObject {
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Statement: js.Array[typings.awsLambda.triggerApiGatewayAuthorizerMod.Statement]
  
  var Version: String
}
object PolicyDocument {
  
  inline def apply(Statement: js.Array[Statement], Version: String): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
  
  extension [Self <: PolicyDocument](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStatement(value: js.Array[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementVarargs(value: Statement*): Self = StObject.set(x, "Statement", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
