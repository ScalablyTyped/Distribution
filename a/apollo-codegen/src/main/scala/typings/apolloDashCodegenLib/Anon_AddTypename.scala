package typings
package apolloDashCodegenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddTypename extends js.Object {
  var addTypename: js.UndefOr[scala.Boolean] = js.undefined
  var customScalarsPrefix: js.UndefOr[java.lang.String] = js.undefined
  var generateOperationIds: js.UndefOr[scala.Boolean] = js.undefined
  var mergeInFieldsFromFragmentSpreads: js.UndefOr[scala.Boolean] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var operationIdsPath: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var passthroughCustomScalars: js.UndefOr[scala.Boolean] = js.undefined
  var useFlowExactObjects: js.UndefOr[scala.Boolean] = js.undefined
  var useFlowReadOnlyTypes: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AddTypename {
  @scala.inline
  def apply(
    addTypename: js.UndefOr[scala.Boolean] = js.undefined,
    customScalarsPrefix: java.lang.String = null,
    generateOperationIds: js.UndefOr[scala.Boolean] = js.undefined,
    mergeInFieldsFromFragmentSpreads: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null,
    operationIdsPath: java.lang.String = null,
    passthroughCustomScalars: js.UndefOr[scala.Boolean] = js.undefined,
    useFlowExactObjects: js.UndefOr[scala.Boolean] = js.undefined,
    useFlowReadOnlyTypes: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AddTypename = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addTypename)) __obj.updateDynamic("addTypename")(addTypename)
    if (customScalarsPrefix != null) __obj.updateDynamic("customScalarsPrefix")(customScalarsPrefix)
    if (!js.isUndefined(generateOperationIds)) __obj.updateDynamic("generateOperationIds")(generateOperationIds)
    if (!js.isUndefined(mergeInFieldsFromFragmentSpreads)) __obj.updateDynamic("mergeInFieldsFromFragmentSpreads")(mergeInFieldsFromFragmentSpreads)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (operationIdsPath != null) __obj.updateDynamic("operationIdsPath")(operationIdsPath)
    if (!js.isUndefined(passthroughCustomScalars)) __obj.updateDynamic("passthroughCustomScalars")(passthroughCustomScalars)
    if (!js.isUndefined(useFlowExactObjects)) __obj.updateDynamic("useFlowExactObjects")(useFlowExactObjects)
    if (!js.isUndefined(useFlowReadOnlyTypes)) __obj.updateDynamic("useFlowReadOnlyTypes")(useFlowReadOnlyTypes)
    __obj.asInstanceOf[Anon_AddTypename]
  }
}

