package typings.antvG2plot

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptorMod {
  
  type Adaptor[O] = js.Function1[/* params */ Params[O], Unit]
  
  trait Params[O] extends StObject {
    
    val chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    
    /** 一些存储一些扩展信息，用户上游 adaptor 向下游传递临时数据 */
    val ext: js.UndefOr[Record[String, Any]] = js.undefined
    
    val options: O
  }
  object Params {
    
    inline def apply[O](
      chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
      options: O
    ): Params[O] = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params[O]]
    }
    
    extension [Self <: Params[?], O](x: Self & Params[O]) {
      
      inline def setChart(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
      ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setExt(value: Record[String, Any]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setOptions(value: O): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
