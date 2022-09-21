package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionMod {
  
  @JSImport("@antv/g2plot/lib/utils/hierarchy/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def partition(data: Any, options: Options): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var field: String
    
    var ignoreParentValue: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var sort: js.UndefOr[js.Function] = js.undefined
  }
  object Options {
    
    inline def apply(field: String): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setIgnoreParentValue(value: Boolean): Self = StObject.set(x, "ignoreParentValue", value.asInstanceOf[js.Any])
      
      inline def setIgnoreParentValueUndefined: Self = StObject.set(x, "ignoreParentValue", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSort(value: js.Function): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
