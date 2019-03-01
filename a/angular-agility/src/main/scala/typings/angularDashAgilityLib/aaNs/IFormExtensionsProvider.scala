package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormExtensionsProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  var defaultFieldGroupStrategy: java.lang.String
  var defaultLabelStrategy: java.lang.String
  var defaultNotifyTarget: java.lang.String
  var defaultOnNavigateAwayStrategy: java.lang.String
  var defaultSpinnerClickStrategy: java.lang.String
  var defaultValMsgPlacementStrategy: java.lang.String
  var fieldGroupStrategies: IFieldGroupStrategies
  var globalSettings: IGlobalSettings
  var labelStrategies: ILabelStrategies
  var onNavigateAwayStrategies: IOnNavigateAwayStrategies
  var spinnerClickStrategies: ISpinnerClickStrategies
  var valMsgForTemplate: java.lang.String
  var valMsgPlacementStrategies: IValMsgPlacementStrategies
  var validIconStrategy: IValidIconStrategy
  var validationMessages: IValidationMessages
  def confirmResetStrategy(): scala.Boolean
}

object IFormExtensionsProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    confirmResetStrategy: js.Function0[scala.Boolean],
    defaultFieldGroupStrategy: java.lang.String,
    defaultLabelStrategy: java.lang.String,
    defaultNotifyTarget: java.lang.String,
    defaultOnNavigateAwayStrategy: java.lang.String,
    defaultSpinnerClickStrategy: java.lang.String,
    defaultValMsgPlacementStrategy: java.lang.String,
    fieldGroupStrategies: IFieldGroupStrategies,
    globalSettings: IGlobalSettings,
    labelStrategies: ILabelStrategies,
    onNavigateAwayStrategies: IOnNavigateAwayStrategies,
    spinnerClickStrategies: ISpinnerClickStrategies,
    valMsgForTemplate: java.lang.String,
    valMsgPlacementStrategies: IValMsgPlacementStrategies,
    validIconStrategy: IValidIconStrategy,
    validationMessages: IValidationMessages
  ): IFormExtensionsProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("confirmResetStrategy")(confirmResetStrategy)
    __obj.updateDynamic("defaultFieldGroupStrategy")(defaultFieldGroupStrategy)
    __obj.updateDynamic("defaultLabelStrategy")(defaultLabelStrategy)
    __obj.updateDynamic("defaultNotifyTarget")(defaultNotifyTarget)
    __obj.updateDynamic("defaultOnNavigateAwayStrategy")(defaultOnNavigateAwayStrategy)
    __obj.updateDynamic("defaultSpinnerClickStrategy")(defaultSpinnerClickStrategy)
    __obj.updateDynamic("defaultValMsgPlacementStrategy")(defaultValMsgPlacementStrategy)
    __obj.updateDynamic("fieldGroupStrategies")(fieldGroupStrategies)
    __obj.updateDynamic("globalSettings")(globalSettings)
    __obj.updateDynamic("labelStrategies")(labelStrategies)
    __obj.updateDynamic("onNavigateAwayStrategies")(onNavigateAwayStrategies)
    __obj.updateDynamic("spinnerClickStrategies")(spinnerClickStrategies)
    __obj.updateDynamic("valMsgForTemplate")(valMsgForTemplate)
    __obj.updateDynamic("valMsgPlacementStrategies")(valMsgPlacementStrategies)
    __obj.updateDynamic("validIconStrategy")(validIconStrategy)
    __obj.updateDynamic("validationMessages")(validationMessages)
    __obj.asInstanceOf[IFormExtensionsProvider]
  }
}

