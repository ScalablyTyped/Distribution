package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisFirehoseTransformationMod {
  type FirehoseTransformationCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationResult]
  type FirehoseTransformationHandler = typings.awsLambda.handerMod.Handler[
    typings.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationEvent, 
    typings.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationResult
  ]
}
