package typings.apolloReact.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloClient.typesMod.MutationQueryReducersMap
import typings.typedGraphql.mod.FragmentDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions extends js.Object {
  var forceFetch: js.UndefOr[Boolean] = js.native
  var fragments: js.UndefOr[js.Array[js.Array[FragmentDefinition] | FragmentDefinition]] = js.native
  var optimisticResponse: js.UndefOr[js.Object] = js.native
  var resultBehaviors: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MutationBehavior */ _
    ]
  ] = js.native
  var updateQueries: js.UndefOr[MutationQueryReducersMap[StringDictionary[_]]] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object MutationOptions {
  @scala.inline
  def apply(): MutationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationOptions]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self <: MutationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForceFetch(value: Boolean): Self = this.set("forceFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFetch: Self = this.set("forceFetch", js.undefined)
    @scala.inline
    def setFragmentsVarargs(value: (js.Array[FragmentDefinition] | FragmentDefinition)*): Self = this.set("fragments", js.Array(value :_*))
    @scala.inline
    def setFragments(value: js.Array[js.Array[FragmentDefinition] | FragmentDefinition]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragments: Self = this.set("fragments", js.undefined)
    @scala.inline
    def setOptimisticResponse(value: js.Object): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    @scala.inline
    def setResultBehaviorsVarargs(value: js.Any*): Self = this.set("resultBehaviors", js.Array(value :_*))
    @scala.inline
    def setResultBehaviors(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MutationBehavior */ _
        ]
    ): Self = this.set("resultBehaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultBehaviors: Self = this.set("resultBehaviors", js.undefined)
    @scala.inline
    def setUpdateQueries(value: MutationQueryReducersMap[StringDictionary[_]]): Self = this.set("updateQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateQueries: Self = this.set("updateQueries", js.undefined)
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

