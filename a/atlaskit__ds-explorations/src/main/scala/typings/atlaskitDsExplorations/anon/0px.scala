package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0px` extends StObject {
  
  var `0px`: SerializedStyles
  
  var `1px`: SerializedStyles
  
  var `2px`: SerializedStyles
  
  var `3px`: SerializedStyles
}
object `0px` {
  
  inline def apply(`0px`: SerializedStyles, `1px`: SerializedStyles, `2px`: SerializedStyles, `3px`: SerializedStyles): `0px` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0px")(`0px`.asInstanceOf[js.Any])
    __obj.updateDynamic("1px")(`1px`.asInstanceOf[js.Any])
    __obj.updateDynamic("2px")(`2px`.asInstanceOf[js.Any])
    __obj.updateDynamic("3px")(`3px`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0px`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0px`] (val x: Self) extends AnyVal {
    
    inline def set0px(value: SerializedStyles): Self = StObject.set(x, "0px", value.asInstanceOf[js.Any])
    
    inline def set1px(value: SerializedStyles): Self = StObject.set(x, "1px", value.asInstanceOf[js.Any])
    
    inline def set2px(value: SerializedStyles): Self = StObject.set(x, "2px", value.asInstanceOf[js.Any])
    
    inline def set3px(value: SerializedStyles): Self = StObject.set(x, "3px", value.asInstanceOf[js.Any])
  }
}
