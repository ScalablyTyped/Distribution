package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSuccessfulResultModel extends StObject {
  
  /**
    * ARN of the resource
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * ID of the resource
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Current state of the resource
    */
  var State: js.UndefOr[string] = js.undefined
}
object BatchSuccessfulResultModel {
  
  inline def apply(): BatchSuccessfulResultModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSuccessfulResultModel]
  }
  
  extension [Self <: BatchSuccessfulResultModel](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
