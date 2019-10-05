package typings.angularDashAgility.aa

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormExtensionsProvider extends IServiceProvider {
  var defaultFieldGroupStrategy: String
  var defaultLabelStrategy: String
  var defaultNotifyTarget: String
  var defaultOnNavigateAwayStrategy: String
  var defaultSpinnerClickStrategy: String
  var defaultValMsgPlacementStrategy: String
  var fieldGroupStrategies: IFieldGroupStrategies
  var globalSettings: IGlobalSettings
  var labelStrategies: ILabelStrategies
  var onNavigateAwayStrategies: IOnNavigateAwayStrategies
  var spinnerClickStrategies: ISpinnerClickStrategies
  var valMsgForTemplate: String
  var valMsgPlacementStrategies: IValMsgPlacementStrategies
  var validIconStrategy: IValidIconStrategy
  var validationMessages: IValidationMessages
  def confirmResetStrategy(): Boolean
}

object IFormExtensionsProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    confirmResetStrategy: () => Boolean,
    defaultFieldGroupStrategy: String,
    defaultLabelStrategy: String,
    defaultNotifyTarget: String,
    defaultOnNavigateAwayStrategy: String,
    defaultSpinnerClickStrategy: String,
    defaultValMsgPlacementStrategy: String,
    fieldGroupStrategies: IFieldGroupStrategies,
    globalSettings: IGlobalSettings,
    labelStrategies: ILabelStrategies,
    onNavigateAwayStrategies: IOnNavigateAwayStrategies,
    spinnerClickStrategies: ISpinnerClickStrategies,
    valMsgForTemplate: String,
    valMsgPlacementStrategies: IValMsgPlacementStrategies,
    validIconStrategy: IValidIconStrategy,
    validationMessages: IValidationMessages
  ): IFormExtensionsProvider = {
    val __obj = js.Dynamic.literal($get = $get, confirmResetStrategy = js.Any.fromFunction0(confirmResetStrategy), defaultFieldGroupStrategy = defaultFieldGroupStrategy, defaultLabelStrategy = defaultLabelStrategy, defaultNotifyTarget = defaultNotifyTarget, defaultOnNavigateAwayStrategy = defaultOnNavigateAwayStrategy, defaultSpinnerClickStrategy = defaultSpinnerClickStrategy, defaultValMsgPlacementStrategy = defaultValMsgPlacementStrategy, fieldGroupStrategies = fieldGroupStrategies, globalSettings = globalSettings, labelStrategies = labelStrategies, onNavigateAwayStrategies = onNavigateAwayStrategies, spinnerClickStrategies = spinnerClickStrategies, valMsgForTemplate = valMsgForTemplate, valMsgPlacementStrategies = valMsgPlacementStrategies, validIconStrategy = validIconStrategy, validationMessages = validationMessages)
  
    __obj.asInstanceOf[IFormExtensionsProvider]
  }
}

