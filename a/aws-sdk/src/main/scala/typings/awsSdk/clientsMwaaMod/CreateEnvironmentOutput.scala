package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) returned in the response for the environment.
    */
  var Arn: js.UndefOr[EnvironmentArn] = js.undefined
}
object CreateEnvironmentOutput {
  
  inline def apply(): CreateEnvironmentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EnvironmentArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
