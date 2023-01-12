package typings.activexLibreoffice.com_.sun.star.chart2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubIncrement extends StObject {
  
  /** should contain nothing for **auto** , or an integer value for an explicit interval count. */
  var IntervalCount: Any
  
  /** should contain nothing for **auto** , or a boolean value for an explicit setting. */
  var PostEquidistant: Any
}
object SubIncrement {
  
  inline def apply(IntervalCount: Any, PostEquidistant: Any): SubIncrement = {
    val __obj = js.Dynamic.literal(IntervalCount = IntervalCount.asInstanceOf[js.Any], PostEquidistant = PostEquidistant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubIncrement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubIncrement] (val x: Self) extends AnyVal {
    
    inline def setIntervalCount(value: Any): Self = StObject.set(x, "IntervalCount", value.asInstanceOf[js.Any])
    
    inline def setPostEquidistant(value: Any): Self = StObject.set(x, "PostEquidistant", value.asInstanceOf[js.Any])
  }
}
