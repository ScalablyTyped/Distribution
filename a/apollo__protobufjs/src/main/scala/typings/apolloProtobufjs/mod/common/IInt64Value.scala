package typings.apolloProtobufjs.mod.common

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Int64Value message. */
trait IInt64Value extends StObject {
  
  var value: js.UndefOr[Double | Long] = js.undefined
}
object IInt64Value {
  
  inline def apply(): IInt64Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInt64Value]
  }
  
  extension [Self <: IInt64Value](x: Self) {
    
    inline def setValue(value: Double | Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
