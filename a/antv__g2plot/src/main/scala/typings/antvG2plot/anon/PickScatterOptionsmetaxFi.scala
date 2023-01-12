package typings.antvG2plot.anon

import typings.antvG2plot.libTypesMetaMod.Meta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/scatter/types.ScatterOptions, 'meta' | 'xField' | 'yField' | 'data'> */
trait PickScatterOptionsmetaxFi extends StObject {
  
  var data: js.Array[Record[String, Any]]
  
  var meta: js.UndefOr[Record[String, Meta]] = js.undefined
  
  var xField: String
  
  var yField: String
}
object PickScatterOptionsmetaxFi {
  
  inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): PickScatterOptionsmetaxFi = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickScatterOptionsmetaxFi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickScatterOptionsmetaxFi] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
  }
}
