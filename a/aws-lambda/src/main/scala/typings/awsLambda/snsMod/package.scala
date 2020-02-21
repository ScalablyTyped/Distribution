package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snsMod {
  type SNSHandler = typings.awsLambda.handerMod.Handler[typings.awsLambda.snsMod.SNSEvent, scala.Unit]
  type SNSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.snsMod.SNSMessageAttribute]
}
