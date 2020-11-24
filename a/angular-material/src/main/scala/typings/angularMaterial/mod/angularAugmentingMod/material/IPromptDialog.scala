package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromptDialog extends IPresetDialog[IPromptDialog] {
  
  def cancel(cancel: String): IPromptDialog = js.native
  
  def initialValue(initialValue: String): IPromptDialog = js.native
  
   // default: false
  def placeholder(placeholder: String): IPromptDialog = js.native
  
  def required(required: Boolean): IPromptDialog = js.native
}
