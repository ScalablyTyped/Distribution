package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.`Scheduled Event`
import typings.awsLambda.eventbridgeMod.EventBridgeEvent
import typings.awsLambda.eventbridgeMod.EventBridgeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-lambda/trigger/cloudwatch-events", JSImport.Namespace)
@js.native
object cloudwatchEventsMod extends js.Object {
  type ScheduledEvent[TDetail] = EventBridgeEvent[`Scheduled Event`, TDetail]
  type ScheduledHandler[TDetail] = EventBridgeHandler[`Scheduled Event`, TDetail, Unit]
}

