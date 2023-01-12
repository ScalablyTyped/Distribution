package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyTimestamp extends StObject {
  
  /**
    * The nanosecond offset converted from timeInSeconds. The valid range is between 0-999999999.
    */
  var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.undefined
  
  /**
    * The timestamp, in seconds, in the Unix epoch format. The valid range is between 1-31556889864403199.
    */
  var timeInSeconds: AssetPropertyTimeInSeconds
}
object AssetPropertyTimestamp {
  
  inline def apply(timeInSeconds: AssetPropertyTimeInSeconds): AssetPropertyTimestamp = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetPropertyTimestamp] (val x: Self) extends AnyVal {
    
    inline def setOffsetInNanos(value: AssetPropertyOffsetInNanos): Self = StObject.set(x, "offsetInNanos", value.asInstanceOf[js.Any])
    
    inline def setOffsetInNanosUndefined: Self = StObject.set(x, "offsetInNanos", js.undefined)
    
    inline def setTimeInSeconds(value: AssetPropertyTimeInSeconds): Self = StObject.set(x, "timeInSeconds", value.asInstanceOf[js.Any])
  }
}
