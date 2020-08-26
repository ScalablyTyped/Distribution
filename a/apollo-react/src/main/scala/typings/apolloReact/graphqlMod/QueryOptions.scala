package typings.apolloReact.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.typedGraphql.mod.FragmentDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var forceFetch: js.UndefOr[Boolean] = js.native
  var fragments: js.UndefOr[js.Array[js.Array[FragmentDefinition] | FragmentDefinition]] = js.native
  var noFetch: js.UndefOr[Boolean] = js.native
  var pollInterval: js.UndefOr[Double] = js.native
  var returnPartialData: js.UndefOr[Boolean] = js.native
  var skip: js.UndefOr[Boolean] = js.native
  var ssr: js.UndefOr[Boolean] = js.native
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
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
    def setNoFetch(value: Boolean): Self = this.set("noFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFetch: Self = this.set("noFetch", js.undefined)
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    @scala.inline
    def setReturnPartialData(value: Boolean): Self = this.set("returnPartialData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPartialData: Self = this.set("returnPartialData", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

