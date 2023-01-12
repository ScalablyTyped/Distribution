package typings.antvG2plot

import typings.antvG2plot.libTypesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTemplateTypesMod {
  
  trait TemplateOptions
    extends StObject
       with Options {
    
    /** x 轴字段 */
    val xField: js.UndefOr[String] = js.undefined
    
    /** y 轴字段 */
    val yField: js.UndefOr[String] = js.undefined
  }
  object TemplateOptions {
    
    inline def apply(data: js.Array[Record[String, Any]]): TemplateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
}
