package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeRange extends StObject {
  
  /**
    * DateTime with UTC offset for Serialization/Deserialization in unix timespam.
    */
  val from: Double = js.native
  
  /**
    * DateTime with UTC offset for Serialization/Deserialization in unix timespam.
    */
  val until: Double = js.native
}
object TimeRange {
  
  @scala.inline
  def apply(from: Double, until: Double): TimeRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
  
  @scala.inline
  implicit class TimeRangeMutableBuilder[Self <: TimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
  }
}
