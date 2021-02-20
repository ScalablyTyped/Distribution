package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.DoubleValue message. */
@js.native
trait IDoubleValue extends StObject {
  
  var value: js.UndefOr[Double] = js.native
}
object IDoubleValue {
  
  @scala.inline
  def apply(): IDoubleValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoubleValue]
  }
  
  @scala.inline
  implicit class IDoubleValueMutableBuilder[Self <: IDoubleValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
