package typings.apolloCodegen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTypename extends js.Object {
  var addTypename: js.UndefOr[Boolean] = js.native
  var customScalarsPrefix: js.UndefOr[String] = js.native
  var generateOperationIds: js.UndefOr[Boolean] = js.native
  var mergeInFieldsFromFragmentSpreads: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
  var operationIdsPath: js.UndefOr[String | Null] = js.native
  var passthroughCustomScalars: js.UndefOr[Boolean] = js.native
  var useFlowExactObjects: js.UndefOr[Boolean] = js.native
  var useFlowReadOnlyTypes: js.UndefOr[Boolean] = js.native
}

object AddTypename {
  @scala.inline
  def apply(): AddTypename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTypename]
  }
  @scala.inline
  implicit class AddTypenameOps[Self <: AddTypename] (val x: Self) extends AnyVal {
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
    def setAddTypename(value: Boolean): Self = this.set("addTypename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddTypename: Self = this.set("addTypename", js.undefined)
    @scala.inline
    def setCustomScalarsPrefix(value: String): Self = this.set("customScalarsPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomScalarsPrefix: Self = this.set("customScalarsPrefix", js.undefined)
    @scala.inline
    def setGenerateOperationIds(value: Boolean): Self = this.set("generateOperationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateOperationIds: Self = this.set("generateOperationIds", js.undefined)
    @scala.inline
    def setMergeInFieldsFromFragmentSpreads(value: Boolean): Self = this.set("mergeInFieldsFromFragmentSpreads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeInFieldsFromFragmentSpreads: Self = this.set("mergeInFieldsFromFragmentSpreads", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOperationIdsPath(value: String): Self = this.set("operationIdsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationIdsPath: Self = this.set("operationIdsPath", js.undefined)
    @scala.inline
    def setOperationIdsPathNull: Self = this.set("operationIdsPath", null)
    @scala.inline
    def setPassthroughCustomScalars(value: Boolean): Self = this.set("passthroughCustomScalars", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthroughCustomScalars: Self = this.set("passthroughCustomScalars", js.undefined)
    @scala.inline
    def setUseFlowExactObjects(value: Boolean): Self = this.set("useFlowExactObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFlowExactObjects: Self = this.set("useFlowExactObjects", js.undefined)
    @scala.inline
    def setUseFlowReadOnlyTypes(value: Boolean): Self = this.set("useFlowReadOnlyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFlowReadOnlyTypes: Self = this.set("useFlowReadOnlyTypes", js.undefined)
  }
  
}

