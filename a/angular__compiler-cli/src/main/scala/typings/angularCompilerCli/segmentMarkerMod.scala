package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentMarkerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/sourcemaps/src/segment_marker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareSegments(a: SegmentMarker, b: SegmentMarker): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSegments")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def offsetSegment(startOfLinePositions: js.Array[Double], marker: SegmentMarker, offset: Double): SegmentMarker = (^.asInstanceOf[js.Dynamic].applyDynamic("offsetSegment")(startOfLinePositions.asInstanceOf[js.Any], marker.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[SegmentMarker]
  
  trait SegmentMarker extends StObject {
    
    val column: Double
    
    val line: Double
    
    var next: js.UndefOr[SegmentMarker] = js.undefined
    
    val position: Double
  }
  object SegmentMarker {
    
    inline def apply(column: Double, line: Double, position: Double): SegmentMarker = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentMarker]
    }
    
    extension [Self <: SegmentMarker](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setNext(value: SegmentMarker): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
