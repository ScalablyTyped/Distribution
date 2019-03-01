package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MutationResultQueryName extends js.Object {
  var mutationResult: apolloDashLinkLib.libTypesMod.FetchResult[js.Object, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  var queryName: js.UndefOr[java.lang.String]
  var queryVariables: stdLib.Record[java.lang.String, _]
}

object Anon_MutationResultQueryName {
  @scala.inline
  def apply(
    mutationResult: apolloDashLinkLib.libTypesMod.FetchResult[js.Object, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]],
    queryVariables: stdLib.Record[java.lang.String, _],
    queryName: java.lang.String = null
  ): Anon_MutationResultQueryName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mutationResult")(mutationResult)
    __obj.updateDynamic("queryVariables")(queryVariables)
    if (queryName != null) __obj.updateDynamic("queryName")(queryName)
    __obj.asInstanceOf[Anon_MutationResultQueryName]
  }
}

