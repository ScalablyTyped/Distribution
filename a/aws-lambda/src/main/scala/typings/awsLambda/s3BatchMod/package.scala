package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3BatchMod {
  type S3BatchCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.s3BatchMod.S3BatchResult]
  type S3BatchHandler = typings.awsLambda.handerMod.Handler[
    typings.awsLambda.s3BatchMod.S3BatchEvent, 
    typings.awsLambda.s3BatchMod.S3BatchResult
  ]
}
