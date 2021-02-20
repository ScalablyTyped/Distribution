package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchRange extends StObject {
  
  /**
    * The end of the range.
    */
  var end: Long = js.native
  
  /**
    * The start of the range.
    */
  var start: Long = js.native
}
object MatchRange {
  
  @scala.inline
  def apply(end: Long, start: Long): MatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRange]
  }
  
  @scala.inline
  implicit class MatchRangeMutableBuilder[Self <: MatchRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Long): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Long): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
