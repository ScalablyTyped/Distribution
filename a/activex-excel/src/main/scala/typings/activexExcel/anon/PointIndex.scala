package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointIndex extends StObject {
  
  val PointIndex: Double
  
  val SeriesIndex: Double
}
object PointIndex {
  
  inline def apply(PointIndex: Double, SeriesIndex: Double): PointIndex = {
    val __obj = js.Dynamic.literal(PointIndex = PointIndex.asInstanceOf[js.Any], SeriesIndex = SeriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointIndex]
  }
  
  extension [Self <: PointIndex](x: Self) {
    
    inline def setPointIndex(value: Double): Self = StObject.set(x, "PointIndex", value.asInstanceOf[js.Any])
    
    inline def setSeriesIndex(value: Double): Self = StObject.set(x, "SeriesIndex", value.asInstanceOf[js.Any])
  }
}
