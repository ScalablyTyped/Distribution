package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[I] extends StObject {
  
  /**
    * 目标点的数据
    */
  var data: typings.amapJsApi.AMap.MassMarks.Data = js.native
  
  /**
    * 事件触发目标
    */
  var target: I = js.native
}
object Data {
  
  @scala.inline
  def apply[I](data: typings.amapJsApi.AMap.MassMarks.Data, target: I): Data[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[I]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[_], I] (val x: Self with Data[I]) extends AnyVal {
    
    @scala.inline
    def setData(value: typings.amapJsApi.AMap.MassMarks.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
