package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudformationCustomResourceMod {
  type CloudFormationCustomResourceHandler = typings.awsLambda.handlerMod.Handler[
    typings.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceEvent, 
    scala.Unit
  ]
}
