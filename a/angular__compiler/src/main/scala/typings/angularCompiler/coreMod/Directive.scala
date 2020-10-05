package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive extends js.Object {
  var exportAs: js.UndefOr[String] = js.native
  var guards: js.UndefOr[StringDictionary[js.Any]] = js.native
  var host: js.UndefOr[StringDictionary[String]] = js.native
  var inputs: js.UndefOr[js.Array[String]] = js.native
  var outputs: js.UndefOr[js.Array[String]] = js.native
  var providers: js.UndefOr[js.Array[Provider]] = js.native
  var queries: js.UndefOr[StringDictionary[js.Any]] = js.native
  var selector: js.UndefOr[String] = js.native
}

object Directive {
  @scala.inline
  def apply(): Directive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directive]
  }
  @scala.inline
  implicit class DirectiveOps[Self <: Directive] (val x: Self) extends AnyVal {
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
    def setExportAs(value: String): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportAs: Self = this.set("exportAs", js.undefined)
    @scala.inline
    def setGuards(value: StringDictionary[js.Any]): Self = this.set("guards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuards: Self = this.set("guards", js.undefined)
    @scala.inline
    def setHost(value: StringDictionary[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setInputsVarargs(value: String*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: String*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setQueries(value: StringDictionary[js.Any]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

