package typings.antvG2.libInterfaceMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionPositionBaseOption
  extends StObject
     with AnnotationBaseOption {
  
  /**
    * @title 结束位置
    */
  val end: AnnotationPosition
  
  /**
    * @title 起始位置
    */
  val start: AnnotationPosition
  
  /**
    * @title 图形样式属性
    */
  val style: js.UndefOr[ShapeAttrs] = js.undefined
}
object RegionPositionBaseOption {
  
  inline def apply(end: AnnotationPosition, start: AnnotationPosition): RegionPositionBaseOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionPositionBaseOption]
  }
  
  extension [Self <: RegionPositionBaseOption](x: Self) {
    
    inline def setEnd(value: AnnotationPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndFunction2(
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
    ): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
    
    inline def setStart(value: AnnotationPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartFunction2(
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
    ): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
