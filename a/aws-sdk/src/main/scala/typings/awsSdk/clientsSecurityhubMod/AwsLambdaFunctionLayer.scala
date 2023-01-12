package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionLayer extends StObject {
  
  /**
    * The ARN of the function layer.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Integer] = js.undefined
}
object AwsLambdaFunctionLayer {
  
  inline def apply(): AwsLambdaFunctionLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsLambdaFunctionLayer] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCodeSize(value: Integer): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
  }
}
