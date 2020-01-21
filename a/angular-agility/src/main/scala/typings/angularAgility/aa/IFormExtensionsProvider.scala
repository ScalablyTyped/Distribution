package typings.angularAgility.aa

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormExtensionsProvider extends IServiceProvider {
  var defaultFieldGroupStrategy: String = js.native
  var defaultLabelStrategy: String = js.native
  var defaultNotifyTarget: String = js.native
  var defaultOnNavigateAwayStrategy: String = js.native
  var defaultSpinnerClickStrategy: String = js.native
  var defaultValMsgPlacementStrategy: String = js.native
  var fieldGroupStrategies: IFieldGroupStrategies = js.native
  var globalSettings: IGlobalSettings = js.native
  var labelStrategies: ILabelStrategies = js.native
  var onNavigateAwayStrategies: IOnNavigateAwayStrategies = js.native
  var spinnerClickStrategies: ISpinnerClickStrategies = js.native
  var valMsgForTemplate: String = js.native
  var valMsgPlacementStrategies: IValMsgPlacementStrategies = js.native
  var validIconStrategy: IValidIconStrategy = js.native
  var validationMessages: IValidationMessages = js.native
  def confirmResetStrategy(): Boolean = js.native
}

