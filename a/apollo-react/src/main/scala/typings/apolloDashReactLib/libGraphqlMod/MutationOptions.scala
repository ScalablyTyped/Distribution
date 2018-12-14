package typings
package apolloDashReactLib.libGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationOptions extends js.Object {
  var forceFetch: js.UndefOr[scala.Boolean] = js.undefined
  var fragments: js.UndefOr[
    js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition] | js.Array[js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition]]
  ] = js.undefined
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var resultBehaviors: js.UndefOr[js.Array[_]] = js.undefined
  var updateQueries: js.UndefOr[
    apolloDashClientLib.coreTypesMod.MutationQueryReducersMap[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

