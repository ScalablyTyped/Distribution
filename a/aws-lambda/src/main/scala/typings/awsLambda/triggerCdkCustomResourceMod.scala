package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.ResponseURL
import typings.awsLambda.awsLambdaBooleans.`false`
import typings.awsLambda.awsLambdaBooleans.`true`
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCloudformationCustomResourceMod.CloudFormationCustomResourceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCdkCustomResourceMod {
  
  type CdkCustomResourceCallback = Callback[CdkCustomResourceResponse]
  
  type CdkCustomResourceEvent = CloudFormationCustomResourceEvent & ResponseURL
  
  type CdkCustomResourceHandler = Handler[CdkCustomResourceEvent, CdkCustomResourceResponse]
  
  type CdkCustomResourceIsCompleteCallback = Callback[CdkCustomResourceIsCompleteResponse]
  
  type CdkCustomResourceIsCompleteEvent = CdkCustomResourceEvent & CdkCustomResourceResponse
  
  type CdkCustomResourceIsCompleteHandler = Handler[CdkCustomResourceIsCompleteEvent, CdkCustomResourceIsCompleteResponse]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.triggerCdkCustomResourceMod.CdkCustomResourceIsCompleteResponseSuccess
    - typings.awsLambda.triggerCdkCustomResourceMod.CdkCustomResourceIsCompleteResponseWaiting
  */
  trait CdkCustomResourceIsCompleteResponse extends StObject
  object CdkCustomResourceIsCompleteResponse {
    
    inline def CdkCustomResourceIsCompleteResponseSuccess(): typings.awsLambda.triggerCdkCustomResourceMod.CdkCustomResourceIsCompleteResponseSuccess = {
      val __obj = js.Dynamic.literal(IsComplete = true)
      __obj.asInstanceOf[typings.awsLambda.triggerCdkCustomResourceMod.CdkCustomResourceIsCompleteResponseSuccess]
    }
    
    inline def CdkCustomResourceIsCompleteResponseWaiting(): typings.awsLambda.triggerCdkCustomResourceMod.CdkCustomResourceIsCompleteResponseWaiting = {
      val __obj = js.Dynamic.literal(IsComplete = false)
      __obj.asInstanceOf[typings.awsLambda.triggerCdkCustomResourceMod.CdkCustomResourceIsCompleteResponseWaiting]
    }
  }
  
  trait CdkCustomResourceIsCompleteResponseSuccess
    extends StObject
       with CdkCustomResourceIsCompleteResponse {
    
    /**
      * This will be merged with the `Data` property of the onEvent handler's response.
      */
    var Data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var IsComplete: `true`
  }
  object CdkCustomResourceIsCompleteResponseSuccess {
    
    inline def apply(): CdkCustomResourceIsCompleteResponseSuccess = {
      val __obj = js.Dynamic.literal(IsComplete = true)
      __obj.asInstanceOf[CdkCustomResourceIsCompleteResponseSuccess]
    }
    
    extension [Self <: CdkCustomResourceIsCompleteResponseSuccess](x: Self) {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setIsComplete(value: `true`): Self = StObject.set(x, "IsComplete", value.asInstanceOf[js.Any])
    }
  }
  
  trait CdkCustomResourceIsCompleteResponseWaiting
    extends StObject
       with CdkCustomResourceIsCompleteResponse {
    
    var IsComplete: `false`
  }
  object CdkCustomResourceIsCompleteResponseWaiting {
    
    inline def apply(): CdkCustomResourceIsCompleteResponseWaiting = {
      val __obj = js.Dynamic.literal(IsComplete = false)
      __obj.asInstanceOf[CdkCustomResourceIsCompleteResponseWaiting]
    }
    
    extension [Self <: CdkCustomResourceIsCompleteResponseWaiting](x: Self) {
      
      inline def setIsComplete(value: `false`): Self = StObject.set(x, "IsComplete", value.asInstanceOf[js.Any])
    }
  }
  
  trait CdkCustomResourceResponse
    extends StObject
       with /* Key */ StringDictionary[Any] {
    
    var Data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var PhysicalResourceId: js.UndefOr[String] = js.undefined
  }
  object CdkCustomResourceResponse {
    
    inline def apply(): CdkCustomResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CdkCustomResourceResponse]
    }
    
    extension [Self <: CdkCustomResourceResponse](x: Self) {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setPhysicalResourceId(value: String): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
      
      inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    }
  }
}
