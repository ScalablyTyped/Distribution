package typings.apolloClient.anon

import typings.apolloLink.typesMod.FetchResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult[T] extends js.Object {
  var mutationResult: FetchResult[T, Record[String, _], Record[String, _]]
  var queryName: js.UndefOr[String] = js.undefined
  var queryVariables: Record[String, _]
}

object MutationResult {
  @scala.inline
  def apply[T](
    mutationResult: FetchResult[T, Record[String, _], Record[String, _]],
    queryVariables: Record[String, _],
    queryName: String = null
  ): MutationResult[T] = {
    val __obj = js.Dynamic.literal(mutationResult = mutationResult.asInstanceOf[js.Any], queryVariables = queryVariables.asInstanceOf[js.Any])
    if (queryName != null) __obj.updateDynamic("queryName")(queryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[T]]
  }
}

