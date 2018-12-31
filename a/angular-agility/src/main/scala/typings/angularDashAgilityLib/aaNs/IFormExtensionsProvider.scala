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

