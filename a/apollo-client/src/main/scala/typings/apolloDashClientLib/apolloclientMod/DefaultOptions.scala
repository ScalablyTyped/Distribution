package typings
package apolloDashClientLib.apolloclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[
    apolloDashClientLib.coreWatchQueryOptionsMod.MutationBaseOptions[
      ScalablyTyped.runtime.StringDictionary[_], 
      apolloDashClientLib.coreTypesMod.OperationVariables
    ]
  ] = js.undefined
  var query: js.UndefOr[
    apolloDashClientLib.coreWatchQueryOptionsMod.QueryBaseOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ] = js.undefined
  var watchQuery: js.UndefOr[
    apolloDashClientLib.coreWatchQueryOptionsMod.ModifiableWatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ] = js.undefined
}

