package typings
package apolloDashReactLib.libGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var forceFetch: js.UndefOr[scala.Boolean] = js.undefined
  var fragments: js.UndefOr[
    js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition] | js.Array[js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition]]
  ] = js.undefined
  var noFetch: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  var returnPartialData: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

