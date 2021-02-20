package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.StringValue message. */
@js.native
trait IStringValue extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object IStringValue {
  
  @scala.inline
  def apply(): IStringValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStringValue]
  }
  
  @scala.inline
  implicit class IStringValueMutableBuilder[Self <: IStringValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
