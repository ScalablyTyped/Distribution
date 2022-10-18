package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[I] extends StObject {
  
  /**
    * 目标点的数据
    */
  var data: /* import warning: importer.ImportType#apply Failed type conversion: I extends amap-js-api.AMap.MassMarks<infer D> ? D : amap-js-api.AMap.MassMarks.Data */ js.Any
  
  /**
    * 事件触发目标
    */
  var target: I
}
object Data {
  
  inline def apply[I](
    data: /* import warning: importer.ImportType#apply Failed type conversion: I extends amap-js-api.AMap.MassMarks<infer D> ? D : amap-js-api.AMap.MassMarks.Data */ js.Any,
    target: I
  ): Data[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[I]]
  }
  
  extension [Self <: Data[?], I](x: Self & Data[I]) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: I extends amap-js-api.AMap.MassMarks<infer D> ? D : amap-js-api.AMap.MassMarks.Data */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
