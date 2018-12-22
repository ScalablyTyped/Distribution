package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodePipelineCloudWatchStageEvent extends js.Object {
  var account: java.lang.String
  var detail: awsDashLambdaLib.Anon_StageState
  var `detail-type`: awsDashLambdaLib.awsDashLambdaLibStrings.`CodePipeline Stage Execution State Change`
  var id: java.lang.String
  var region: java.lang.String
  var resources: js.Array[java.lang.String]
  var source: awsDashLambdaLib.awsDashLambdaLibStrings.awsDOTcodepipeline
  var time: java.lang.String
  var version: java.lang.String
}

