package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/dynamodb/numberValue", JSImport.Namespace)
@js.native
object libDynamodbNumberValueMod extends js.Object {
  @js.native
  class NumberValue protected () extends js.Object {
    def this(value: String) = this()
    def this(value: Double) = this()
    def toJSON(): Double = js.native
    def toNumber(): Double = js.native
  }
  
}

