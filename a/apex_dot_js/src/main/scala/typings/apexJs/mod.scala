package typings.apexJs

import typings.awsLambda.handerMod.Callback
import typings.awsLambda.handerMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apex.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(fn: js.Function2[/* event */ js.Any, /* context */ Context, _]): js.Function3[/* event */ js.Any, /* context */ Context, /* callback */ Callback[_], Unit] = js.native
}

