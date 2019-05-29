package typings
package apolloDashReactLib.libGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var forceFetch: js.UndefOr[scala.Boolean] = js.undefined
  var fragments: js.UndefOr[
    js.Array[
      js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition] | typedDashGraphqlLib.graphqlMod.FragmentDefinition
    ]
  ] = js.undefined
  var noFetch: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  var returnPartialData: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    forceFetch: js.UndefOr[scala.Boolean] = js.undefined,
    fragments: js.Array[
      js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition] | typedDashGraphqlLib.graphqlMod.FragmentDefinition
    ] = null,
    noFetch: js.UndefOr[scala.Boolean] = js.undefined,
    pollInterval: scala.Int | scala.Double = null,
    returnPartialData: js.UndefOr[scala.Boolean] = js.undefined,
    skip: js.UndefOr[scala.Boolean] = js.undefined,
    ssr: js.UndefOr[scala.Boolean] = js.undefined,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceFetch)) __obj.updateDynamic("forceFetch")(forceFetch)
    if (fragments != null) __obj.updateDynamic("fragments")(fragments)
    if (!js.isUndefined(noFetch)) __obj.updateDynamic("noFetch")(noFetch)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[QueryOptions]
  }
}

