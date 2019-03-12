package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentMutationId extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var mutationId: java.lang.String
  var optimisticResponse: js.UndefOr[js.Object | js.Function]
  var update: js.UndefOr[
    js.Function2[
      /* proxy */ apolloDashCacheLib.libTypesDataProxyMod.DataProxy, 
      /* mutationResult */ js.Object, 
      scala.Unit
    ]
  ]
  var updateQueries: org.scalablytyped.runtime.StringDictionary[apolloDashClientLib.dataStoreMod.QueryWithUpdater]
  var variables: js.Any
}

object Anon_DocumentMutationId {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    mutationId: java.lang.String,
    updateQueries: org.scalablytyped.runtime.StringDictionary[apolloDashClientLib.dataStoreMod.QueryWithUpdater],
    variables: js.Any,
    optimisticResponse: js.Object | js.Function = null,
    update: (/* proxy */ apolloDashCacheLib.libTypesDataProxyMod.DataProxy, /* mutationResult */ js.Object) => scala.Unit = null
  ): Anon_DocumentMutationId = {
    val __obj = js.Dynamic.literal(document = document, mutationId = mutationId, updateQueries = updateQueries, variables = variables)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[Anon_DocumentMutationId]
  }
}

