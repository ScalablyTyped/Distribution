package typings.awsLambda

import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerEventbridgeMod {
  
  trait EventBridgeEvent[TDetailType /* <: String */, TDetail] extends StObject {
    
    var account: String
    
    var detail: TDetail
    
    var `detail-type`: TDetailType
    
    var id: String
    
    var region: String
    
    var `replay-name`: js.UndefOr[String] = js.undefined
    
    var resources: js.Array[String]
    
    var source: String
    
    var time: String
    
    var version: String
  }
  object EventBridgeEvent {
    
    inline def apply[TDetailType /* <: String */, TDetail](
      account: String,
      detail: TDetail,
      `detail-type`: TDetailType,
      id: String,
      region: String,
      resources: js.Array[String],
      source: String,
      time: String,
      version: String
    ): EventBridgeEvent[TDetailType, TDetail] = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBridgeEvent[TDetailType, TDetail]]
    }
    
    extension [Self <: EventBridgeEvent[?, ?], TDetailType /* <: String */, TDetail](x: Self & (EventBridgeEvent[TDetailType, TDetail])) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: TDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def `setDetail-type`(value: TDetailType): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def `setReplay-name`(value: String): Self = StObject.set(x, "replay-name", value.asInstanceOf[js.Any])
      
      inline def `setReplay-nameUndefined`: Self = StObject.set(x, "replay-name", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type EventBridgeHandler[TDetailType /* <: String */, TDetail, TResult] = Handler[EventBridgeEvent[TDetailType, TDetail], TResult]
}
