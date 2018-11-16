package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Document extends js.Object {
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
  var updateQueries: ScalablyTyped.runtime.StringDictionary[apolloDashClientLib.dataStoreMod.QueryWithUpdater]
  var variables: js.Any
}

