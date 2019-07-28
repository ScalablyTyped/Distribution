package typings.apolloDashClient

import typings.apolloDashLink.libTypesMod.FetchResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MutationResult[T] extends js.Object {
  var mutationResult: FetchResult[T, Record[String, _], Record[String, _]]
  var queryName: js.UndefOr[String] = js.undefined
  var queryVariables: Record[String, _]
}

object Anon_MutationResult {
  @scala.inline
  def apply[T](
    mutationResult: FetchResult[T, Record[String, _], Record[String, _]],
    queryVariables: Record[String, _],
    queryName: String = null
  ): Anon_MutationResult[T] = {
    val __obj = js.Dynamic.literal(mutationResult = mutationResult, queryVariables = queryVariables)
    if (queryName != null) __obj.updateDynamic("queryName")(queryName)
    __obj.asInstanceOf[Anon_MutationResult[T]]
  }
}

