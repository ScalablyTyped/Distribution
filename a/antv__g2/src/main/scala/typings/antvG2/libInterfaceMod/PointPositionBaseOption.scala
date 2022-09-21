package typings.antvG2.libInterfaceMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointPositionBaseOption
  extends StObject
     with AnnotationBaseOption {
  
  /**
    * @title Point 定位位置
    */
  val position: AnnotationPosition
}
object PointPositionBaseOption {
  
  inline def apply(position: AnnotationPosition): PointPositionBaseOption = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointPositionBaseOption]
  }
  
  extension [Self <: PointPositionBaseOption](x: Self) {
    
    inline def setPosition(value: AnnotationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionFunction2(
      value: (/* xScales */ (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ]) | (Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ]), /* yScales */ (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ]) | (Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ])) => js.Tuple2[Double | String, Double | String]
    ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
  }
}
