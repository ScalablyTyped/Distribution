package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterModelStepMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var Arn: js.UndefOr[String256] = js.undefined
}
object RegisterModelStepMetadata {
  
  inline def apply(): RegisterModelStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterModelStepMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterModelStepMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String256): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
