package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  /**
    * @title 箱线图
    * @description 状态样式设置
    */
  var state: typings.antvG2plot.libTypesStateMod.State
}
object State {
  
  inline def apply(state: typings.antvG2plot.libTypesStateMod.State): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setState(value: typings.antvG2plot.libTypesStateMod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
