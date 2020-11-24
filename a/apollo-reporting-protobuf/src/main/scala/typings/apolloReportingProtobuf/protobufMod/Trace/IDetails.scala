package typings.apolloReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Details. */
@js.native
trait IDetails extends js.Object {
  
  /** Details deprecatedVariables */
  var deprecatedVariables: js.UndefOr[StringDictionary[Uint8Array] | Null] = js.native
  
  /** Details operationName */
  var operationName: js.UndefOr[String | Null] = js.native
  
  /** Details variablesJson */
  var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.native
}
object IDetails {
  
  @scala.inline
  def apply(): IDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetails]
  }
  
  @scala.inline
  implicit class IDetailsOps[Self <: IDetails] (val x: Self) extends AnyVal {
    
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
    def setDeprecatedVariables(value: StringDictionary[Uint8Array]): Self = this.set("deprecatedVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedVariables: Self = this.set("deprecatedVariables", js.undefined)
    
    @scala.inline
    def setDeprecatedVariablesNull: Self = this.set("deprecatedVariables", null)
    
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    
    @scala.inline
    def setOperationNameNull: Self = this.set("operationName", null)
    
    @scala.inline
    def setVariablesJson(value: StringDictionary[String]): Self = this.set("variablesJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariablesJson: Self = this.set("variablesJson", js.undefined)
    
    @scala.inline
    def setVariablesJsonNull: Self = this.set("variablesJson", null)
  }
}
