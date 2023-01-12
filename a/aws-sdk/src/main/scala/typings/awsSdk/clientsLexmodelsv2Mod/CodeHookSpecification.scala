package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeHookSpecification extends StObject {
  
  var lambdaCodeHook: LambdaCodeHook
}
object CodeHookSpecification {
  
  inline def apply(lambdaCodeHook: LambdaCodeHook): CodeHookSpecification = {
    val __obj = js.Dynamic.literal(lambdaCodeHook = lambdaCodeHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeHookSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeHookSpecification] (val x: Self) extends AnyVal {
    
    inline def setLambdaCodeHook(value: LambdaCodeHook): Self = StObject.set(x, "lambdaCodeHook", value.asInstanceOf[js.Any])
  }
}
