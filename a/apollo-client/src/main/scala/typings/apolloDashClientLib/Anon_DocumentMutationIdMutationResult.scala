package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentMutationIdMutationResult extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var mutationId: java.lang.String
  var result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
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

object Anon_DocumentMutationIdMutationResult {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    mutationId: java.lang.String,
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    updateQueries: org.scalablytyped.runtime.StringDictionary[apolloDashClientLib.dataStoreMod.QueryWithUpdater],
    variables: js.Any,
    update: js.Function2[
      /* proxy */ apolloDashCacheLib.libTypesDataProxyMod.DataProxy, 
      /* mutationResult */ js.Object, 
      scala.Unit
    ] = null
  ): Anon_DocumentMutationIdMutationResult = {
    val __obj = js.Dynamic.literal(document = document, mutationId = mutationId, result = result, updateQueries = updateQueries, variables = variables)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_DocumentMutationIdMutationResult]
  }
}

