package typings.agGrid.componentMetadataProviderMod

import typings.agGrid.anon.InstantiableIComponent
import typings.agGrid.componentProviderMod.AgGridComponentFunctionInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentMetadata extends js.Object {
  var functionAdapter: js.UndefOr[
    js.Function1[/* callback */ AgGridComponentFunctionInput, InstantiableIComponent]
  ] = js.native
  var mandatoryMethodList: js.Array[String] = js.native
  var optionalMethodList: js.Array[String] = js.native
}

object ComponentMetadata {
  @scala.inline
  def apply(mandatoryMethodList: js.Array[String], optionalMethodList: js.Array[String]): ComponentMetadata = {
    val __obj = js.Dynamic.literal(mandatoryMethodList = mandatoryMethodList.asInstanceOf[js.Any], optionalMethodList = optionalMethodList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentMetadata]
  }
  @scala.inline
  implicit class ComponentMetadataOps[Self <: ComponentMetadata] (val x: Self) extends AnyVal {
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
    def setMandatoryMethodListVarargs(value: String*): Self = this.set("mandatoryMethodList", js.Array(value :_*))
    @scala.inline
    def setMandatoryMethodList(value: js.Array[String]): Self = this.set("mandatoryMethodList", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalMethodListVarargs(value: String*): Self = this.set("optionalMethodList", js.Array(value :_*))
    @scala.inline
    def setOptionalMethodList(value: js.Array[String]): Self = this.set("optionalMethodList", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionAdapter(value: /* callback */ AgGridComponentFunctionInput => InstantiableIComponent): Self = this.set("functionAdapter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFunctionAdapter: Self = this.set("functionAdapter", js.undefined)
  }
  
}

