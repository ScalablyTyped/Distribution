package typings.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexResult extends js.Object {
  
  var dialogAction: LexDialogAction = js.native
  
  var sessionAttributes: js.UndefOr[StringDictionary[String]] = js.native
}
object LexResult {
  
  @scala.inline
  def apply(dialogAction: LexDialogAction): LexResult = {
    val __obj = js.Dynamic.literal(dialogAction = dialogAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexResult]
  }
  
  @scala.inline
  implicit class LexResultOps[Self <: LexResult] (val x: Self) extends AnyVal {
    
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
    def setDialogAction(value: LexDialogAction): Self = this.set("dialogAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAttributes(value: StringDictionary[String]): Self = this.set("sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAttributes: Self = this.set("sessionAttributes", js.undefined)
  }
}
