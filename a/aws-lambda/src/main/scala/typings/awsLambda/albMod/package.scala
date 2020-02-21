package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object albMod {
  type ALBCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.albMod.ALBResult]
  type ALBHandler = typings.awsLambda.handerMod.Handler[typings.awsLambda.albMod.ALBEvent, typings.awsLambda.albMod.ALBResult]
}
