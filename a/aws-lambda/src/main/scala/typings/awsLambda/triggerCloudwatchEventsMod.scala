package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.`Scheduled Event`
import typings.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import typings.awsLambda.triggerEventbridgeMod.EventBridgeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCloudwatchEventsMod {
  
  type ScheduledEvent[TDetail] = EventBridgeEvent[`Scheduled Event`, TDetail]
  
  type ScheduledHandler[TDetail] = EventBridgeHandler[`Scheduled Event`, TDetail, Unit]
}
