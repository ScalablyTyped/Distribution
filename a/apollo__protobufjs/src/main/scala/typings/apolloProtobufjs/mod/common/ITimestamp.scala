package typings.apolloProtobufjs.mod.common

import typings.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Timestamp message. */
trait ITimestamp extends StObject {
  
  var nanos: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[Double | Long] = js.undefined
}
object ITimestamp {
  
  @scala.inline
  def apply(): ITimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimestamp]
  }
  
  @scala.inline
  implicit class ITimestampMutableBuilder[Self <: ITimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double | Long): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
