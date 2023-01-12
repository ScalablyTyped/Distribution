package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon MWAA environment. For example, arn:aws:airflow:us-east-1:123456789012:environment/MyMWAAEnvironment.
    */
  var Arn: js.UndefOr[EnvironmentArn] = js.undefined
}
object UpdateEnvironmentOutput {
  
  inline def apply(): UpdateEnvironmentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnvironmentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EnvironmentArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
