package typings.apolloServerCore.runHttpQueryMod

import typings.apolloServerCore.anon.PickdefaultRecordstringan
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "throwHttpGraphQLError")
@js.native
object throwHttpGraphQLError extends js.Object {
  def apply[E /* <: Error */](statusCode: Double, errors: js.Array[E]): scala.Nothing = js.native
  def apply[E /* <: Error */](statusCode: Double, errors: js.Array[E], options: PickdefaultRecordstringan): scala.Nothing = js.native
  def apply[E /* <: Error */](
    statusCode: Double,
    errors: js.Array[E],
    options: PickdefaultRecordstringan,
    extensions: Record[String, _]
  ): scala.Nothing = js.native
}

