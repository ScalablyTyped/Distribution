package typings
package apolloDashReactLib.libGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOptions extends js.Object {
  var forceFetch: js.UndefOr[scala.Boolean] = js.undefined
  var fragments: js.UndefOr[
    js.Array[
      js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition] | typedDashGraphqlLib.graphqlMod.FragmentDefinition
    ]
  ] = js.undefined
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var resultBehaviors: js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MutationBehavior */ _
    ]
  ] = js.undefined
  var updateQueries: js.UndefOr[
    apolloDashClientLib.coreTypesMod.MutationQueryReducersMap[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object MutationOptions {
  @scala.inline
  def apply(
    forceFetch: js.UndefOr[scala.Boolean] = js.undefined,
    fragments: js.Array[
      js.Array[typedDashGraphqlLib.graphqlMod.FragmentDefinition] | typedDashGraphqlLib.graphqlMod.FragmentDefinition
    ] = null,
    optimisticResponse: js.Object = null,
    resultBehaviors: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MutationBehavior */ _
    ] = null,
    updateQueries: apolloDashClientLib.coreTypesMod.MutationQueryReducersMap[org.scalablytyped.runtime.StringDictionary[_]] = null,
    variables: js.Object = null
  ): MutationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceFetch)) __obj.updateDynamic("forceFetch")(forceFetch)
    if (fragments != null) __obj.updateDynamic("fragments")(fragments)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (resultBehaviors != null) __obj.updateDynamic("resultBehaviors")(resultBehaviors)
    if (updateQueries != null) __obj.updateDynamic("updateQueries")(updateQueries)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[MutationOptions]
  }
}

