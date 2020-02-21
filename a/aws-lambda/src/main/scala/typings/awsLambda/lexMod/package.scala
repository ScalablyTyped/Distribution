package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lexMod {
  type LexCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.lexMod.LexResult]
  type LexHandler = typings.awsLambda.handerMod.Handler[typings.awsLambda.lexMod.LexEvent, typings.awsLambda.lexMod.LexResult]
  type LexSlotDetails = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.AnonOriginalValue]
}
