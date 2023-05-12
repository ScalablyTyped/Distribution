package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipRange extends StObject {
  
  /**
    * The end offset of the clip range, in milliseconds, starting from the beginning of the VOD source associated with the program.
    */
  var EndOffsetMillis: _Long
}
object ClipRange {
  
  inline def apply(EndOffsetMillis: _Long): ClipRange = {
    val __obj = js.Dynamic.literal(EndOffsetMillis = EndOffsetMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipRange] (val x: Self) extends AnyVal {
    
    inline def setEndOffsetMillis(value: _Long): Self = StObject.set(x, "EndOffsetMillis", value.asInstanceOf[js.Any])
  }
}
