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
    confirmResetStrategy: () => scala.Boolean,
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
    val __obj = js.Dynamic.literal($get = $get, confirmResetStrategy = js.Any.fromFunction0(confirmResetStrategy), defaultFieldGroupStrategy = defaultFieldGroupStrategy, defaultLabelStrategy = defaultLabelStrategy, defaultNotifyTarget = defaultNotifyTarget, defaultOnNavigateAwayStrategy = defaultOnNavigateAwayStrategy, defaultSpinnerClickStrategy = defaultSpinnerClickStrategy, defaultValMsgPlacementStrategy = defaultValMsgPlacementStrategy, fieldGroupStrategies = fieldGroupStrategies, globalSettings = globalSettings, labelStrategies = labelStrategies, onNavigateAwayStrategies = onNavigateAwayStrategies, spinnerClickStrategies = spinnerClickStrategies, valMsgForTemplate = valMsgForTemplate, valMsgPlacementStrategies = valMsgPlacementStrategies, validIconStrategy = validIconStrategy, validationMessages = validationMessages)
  
    __obj.asInstanceOf[IFormExtensionsProvider]
  }
}

