package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Long
  
  /**
    * The start of the range.
    */
  var start: Long
}
object MatchRange {
  
  inline def apply(end: Long, start: Long): MatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRange]
  }
  
  extension [Self <: MatchRange](x: Self) {
    
    inline def setEnd(value: Long): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Long): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
