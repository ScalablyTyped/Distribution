package typings.angularAgility.aa

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormExtensionsProvider extends IServiceProvider {
  
  def confirmResetStrategy(): Boolean = js.native
  
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
  
  @scala.inline
  implicit class IFormExtensionsProviderOps[Self <: IFormExtensionsProvider] (val x: Self) extends AnyVal {
    
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
    def setConfirmResetStrategy(value: () => Boolean): Self = this.set("confirmResetStrategy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultFieldGroupStrategy(value: String): Self = this.set("defaultFieldGroupStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLabelStrategy(value: String): Self = this.set("defaultLabelStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNotifyTarget(value: String): Self = this.set("defaultNotifyTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOnNavigateAwayStrategy(value: String): Self = this.set("defaultOnNavigateAwayStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSpinnerClickStrategy(value: String): Self = this.set("defaultSpinnerClickStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValMsgPlacementStrategy(value: String): Self = this.set("defaultValMsgPlacementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldGroupStrategies(value: IFieldGroupStrategies): Self = this.set("fieldGroupStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSettings(value: IGlobalSettings): Self = this.set("globalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStrategies(value: ILabelStrategies): Self = this.set("labelStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNavigateAwayStrategies(value: IOnNavigateAwayStrategies): Self = this.set("onNavigateAwayStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerClickStrategies(value: ISpinnerClickStrategies): Self = this.set("spinnerClickStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValMsgForTemplate(value: String): Self = this.set("valMsgForTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValMsgPlacementStrategies(value: IValMsgPlacementStrategies): Self = this.set("valMsgPlacementStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidIconStrategy(value: IValidIconStrategy): Self = this.set("validIconStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMessages(value: IValidationMessages): Self = this.set("validationMessages", value.asInstanceOf[js.Any])
  }
}
