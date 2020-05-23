package typings.apolloReact.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.typedGraphql.mod.FragmentDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var forceFetch: js.UndefOr[Boolean] = js.undefined
  var fragments: js.UndefOr[js.Array[js.Array[FragmentDefinition] | FragmentDefinition]] = js.undefined
  var noFetch: js.UndefOr[Boolean] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
  var returnPartialData: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Boolean] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    forceFetch: js.UndefOr[Boolean] = js.undefined,
    fragments: js.Array[js.Array[FragmentDefinition] | FragmentDefinition] = null,
    noFetch: js.UndefOr[Boolean] = js.undefined,
    pollInterval: js.UndefOr[Double] = js.undefined,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    ssr: js.UndefOr[Boolean] = js.undefined,
    variables: StringDictionary[js.Any] = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceFetch)) __obj.updateDynamic("forceFetch")(forceFetch.get.asInstanceOf[js.Any])
    if (fragments != null) __obj.updateDynamic("fragments")(fragments.asInstanceOf[js.Any])
    if (!js.isUndefined(noFetch)) __obj.updateDynamic("noFetch")(noFetch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

