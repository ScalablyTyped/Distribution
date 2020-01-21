package typings.apolloCodegen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddTypename extends js.Object {
  var addTypename: js.UndefOr[Boolean] = js.undefined
  var customScalarsPrefix: js.UndefOr[String] = js.undefined
  var generateOperationIds: js.UndefOr[Boolean] = js.undefined
  var mergeInFieldsFromFragmentSpreads: js.UndefOr[Boolean] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var operationIdsPath: js.UndefOr[String | Null] = js.undefined
  var passthroughCustomScalars: js.UndefOr[Boolean] = js.undefined
  var useFlowExactObjects: js.UndefOr[Boolean] = js.undefined
  var useFlowReadOnlyTypes: js.UndefOr[Boolean] = js.undefined
}

object AnonAddTypename {
  @scala.inline
  def apply(
    addTypename: js.UndefOr[Boolean] = js.undefined,
    customScalarsPrefix: String = null,
    generateOperationIds: js.UndefOr[Boolean] = js.undefined,
    mergeInFieldsFromFragmentSpreads: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    operationIdsPath: String = null,
    passthroughCustomScalars: js.UndefOr[Boolean] = js.undefined,
    useFlowExactObjects: js.UndefOr[Boolean] = js.undefined,
    useFlowReadOnlyTypes: js.UndefOr[Boolean] = js.undefined
  ): AnonAddTypename = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addTypename)) __obj.updateDynamic("addTypename")(addTypename.asInstanceOf[js.Any])
    if (customScalarsPrefix != null) __obj.updateDynamic("customScalarsPrefix")(customScalarsPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOperationIds)) __obj.updateDynamic("generateOperationIds")(generateOperationIds.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeInFieldsFromFragmentSpreads)) __obj.updateDynamic("mergeInFieldsFromFragmentSpreads")(mergeInFieldsFromFragmentSpreads.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (operationIdsPath != null) __obj.updateDynamic("operationIdsPath")(operationIdsPath.asInstanceOf[js.Any])
    if (!js.isUndefined(passthroughCustomScalars)) __obj.updateDynamic("passthroughCustomScalars")(passthroughCustomScalars.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlowExactObjects)) __obj.updateDynamic("useFlowExactObjects")(useFlowExactObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlowReadOnlyTypes)) __obj.updateDynamic("useFlowReadOnlyTypes")(useFlowReadOnlyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddTypename]
  }
}

