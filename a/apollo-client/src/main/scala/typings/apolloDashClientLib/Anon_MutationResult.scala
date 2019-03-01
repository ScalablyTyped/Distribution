package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MutationResult[T] extends js.Object {
  var mutationResult: apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  var queryName: js.UndefOr[java.lang.String]
  var queryVariables: stdLib.Record[java.lang.String, _]
}

object Anon_MutationResult {
  @scala.inline
  def apply[T](
    mutationResult: apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]],
    queryVariables: stdLib.Record[java.lang.String, _],
    queryName: java.lang.String = null
  ): Anon_MutationResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mutationResult")(mutationResult)
    __obj.updateDynamic("queryVariables")(queryVariables)
    if (queryName != null) __obj.updateDynamic("queryName")(queryName)
    __obj.asInstanceOf[Anon_MutationResult[T]]
  }
}

