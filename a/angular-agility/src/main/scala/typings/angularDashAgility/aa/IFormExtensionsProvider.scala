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
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], confirmResetStrategy = js.Any.fromFunction0(confirmResetStrategy), defaultFieldGroupStrategy = defaultFieldGroupStrategy.asInstanceOf[js.Any], defaultLabelStrategy = defaultLabelStrategy.asInstanceOf[js.Any], defaultNotifyTarget = defaultNotifyTarget.asInstanceOf[js.Any], defaultOnNavigateAwayStrategy = defaultOnNavigateAwayStrategy.asInstanceOf[js.Any], defaultSpinnerClickStrategy = defaultSpinnerClickStrategy.asInstanceOf[js.Any], defaultValMsgPlacementStrategy = defaultValMsgPlacementStrategy.asInstanceOf[js.Any], fieldGroupStrategies = fieldGroupStrategies.asInstanceOf[js.Any], globalSettings = globalSettings.asInstanceOf[js.Any], labelStrategies = labelStrategies.asInstanceOf[js.Any], onNavigateAwayStrategies = onNavigateAwayStrategies.asInstanceOf[js.Any], spinnerClickStrategies = spinnerClickStrategies.asInstanceOf[js.Any], valMsgForTemplate = valMsgForTemplate.asInstanceOf[js.Any], valMsgPlacementStrategies = valMsgPlacementStrategies.asInstanceOf[js.Any], validIconStrategy = validIconStrategy.asInstanceOf[js.Any], validationMessages = validationMessages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFormExtensionsProvider]
  }
}

