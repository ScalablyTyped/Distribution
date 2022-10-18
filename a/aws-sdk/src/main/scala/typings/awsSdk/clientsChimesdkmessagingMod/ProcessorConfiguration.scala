package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorConfiguration extends StObject {
  
  /**
    * Indicates that the processor is of type Lambda.
    */
  var Lambda: LambdaConfiguration
}
object ProcessorConfiguration {
  
  inline def apply(Lambda: LambdaConfiguration): ProcessorConfiguration = {
    val __obj = js.Dynamic.literal(Lambda = Lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorConfiguration]
  }
  
  extension [Self <: ProcessorConfiguration](x: Self) {
    
    inline def setLambda(value: LambdaConfiguration): Self = StObject.set(x, "Lambda", value.asInstanceOf[js.Any])
  }
}
