package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DocumentResult extends js.Object {
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

