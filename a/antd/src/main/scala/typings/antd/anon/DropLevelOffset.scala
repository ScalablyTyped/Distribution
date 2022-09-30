package typings.antd.anon

import typings.antd.antdInts.`-1`
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropLevelOffset extends StObject {
  
  var direction: ltr | rtl
  
  var dropLevelOffset: Double
  
  var dropPosition: `-1` | typings.antd.antdInts.`0` | typings.antd.antdInts.`1`
  
  var indent: Double
  
  var prefixCls: String
}
object DropLevelOffset {
  
  inline def apply(
    direction: ltr | rtl,
    dropLevelOffset: Double,
    dropPosition: `-1` | typings.antd.antdInts.`0` | typings.antd.antdInts.`1`,
    indent: Double,
    prefixCls: String
  ): DropLevelOffset = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLevelOffset]
  }
  
  extension [Self <: DropLevelOffset](x: Self) {
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `-1` | typings.antd.antdInts.`0` | typings.antd.antdInts.`1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
