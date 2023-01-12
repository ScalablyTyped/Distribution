package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /**
    * The travel distance between the step's StartPosition and EndPosition.
    */
  var Distance: StepDistanceDouble
  
  /**
    * The estimated travel time, in seconds, from the step's StartPosition to the EndPosition. . The travel mode and departure time that you specify in the request determines the calculated time.
    */
  var DurationSeconds: StepDurationSecondsDouble
  
  /**
    * The end position of a step. If the position the last step in the leg, this position is the same as the end position of the leg.
    */
  var EndPosition: Position
  
  /**
    * Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For example, the index of the first step in a leg geometry is 0.  Included in the response for queries that set IncludeLegGeometry to True. 
    */
  var GeometryOffset: js.UndefOr[StepGeometryOffsetInteger] = js.undefined
  
  /**
    * The starting position of a step. If the position is the first step in the leg, this position is the same as the start position of the leg.
    */
  var StartPosition: Position
}
object Step {
  
  inline def apply(
    Distance: StepDistanceDouble,
    DurationSeconds: StepDurationSecondsDouble,
    EndPosition: Position,
    StartPosition: Position
  ): Step = {
    val __obj = js.Dynamic.literal(Distance = Distance.asInstanceOf[js.Any], DurationSeconds = DurationSeconds.asInstanceOf[js.Any], EndPosition = EndPosition.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: StepDistanceDouble): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setDurationSeconds(value: StepDurationSecondsDouble): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setEndPosition(value: Position): Self = StObject.set(x, "EndPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionVarargs(value: Double*): Self = StObject.set(x, "EndPosition", js.Array(value*))
    
    inline def setGeometryOffset(value: StepGeometryOffsetInteger): Self = StObject.set(x, "GeometryOffset", value.asInstanceOf[js.Any])
    
    inline def setGeometryOffsetUndefined: Self = StObject.set(x, "GeometryOffset", js.undefined)
    
    inline def setStartPosition(value: Position): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionVarargs(value: Double*): Self = StObject.set(x, "StartPosition", js.Array(value*))
  }
}
