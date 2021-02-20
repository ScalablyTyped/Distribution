package typings.apolloProtobufjs.mod.common

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.UInt64Value message. */
@js.native
trait IUInt64Value extends StObject {
  
  var value: js.UndefOr[Double | Long] = js.native
}
object IUInt64Value {
  
  @scala.inline
  def apply(): IUInt64Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUInt64Value]
  }
  
  @scala.inline
  implicit class IUInt64ValueMutableBuilder[Self <: IUInt64Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double | Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
