package typings.apolloDashReact.libGraphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashClient.coreTypesMod.MutationQueryReducersMap
import typings.typedDashGraphql.graphqlMod.FragmentDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOptions extends js.Object {
  var forceFetch: js.UndefOr[Boolean] = js.undefined
  var fragments: js.UndefOr[js.Array[js.Array[FragmentDefinition] | FragmentDefinition]] = js.undefined
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var resultBehaviors: js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MutationBehavior */ _
    ]
  ] = js.undefined
  var updateQueries: js.UndefOr[MutationQueryReducersMap[StringDictionary[_]]] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object MutationOptions {
  @scala.inline
  def apply(
    forceFetch: js.UndefOr[Boolean] = js.undefined,
    fragments: js.Array[js.Array[FragmentDefinition] | FragmentDefinition] = null,
    optimisticResponse: js.Object = null,
    resultBehaviors: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MutationBehavior */ _
    ] = null,
    updateQueries: MutationQueryReducersMap[StringDictionary[_]] = null,
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

