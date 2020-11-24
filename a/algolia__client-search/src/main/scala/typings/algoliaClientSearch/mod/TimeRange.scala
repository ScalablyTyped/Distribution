package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeRange extends js.Object {
  
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
  implicit class TimeRangeOps[Self <: TimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntil(value: Double): Self = this.set("until", value.asInstanceOf[js.Any])
  }
}
