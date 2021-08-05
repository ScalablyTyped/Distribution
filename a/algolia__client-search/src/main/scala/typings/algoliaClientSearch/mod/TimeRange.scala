package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRange extends StObject {
  
  /**
    * DateTime with UTC offset for Serialization/Deserialization in unix timespam.
    */
  val from: Double
  
  /**
    * DateTime with UTC offset for Serialization/Deserialization in unix timespam.
    */
  val until: Double
}
object TimeRange {
  
  inline def apply(from: Double, until: Double): TimeRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
  
  extension [Self <: TimeRange](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
  }
}
