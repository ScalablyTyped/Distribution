package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[__string] = js.native
  /**
    * The configuration of the Lambda function.
    */
  var FunctionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
  /**
    * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: js.UndefOr[__string] = js.native
}

