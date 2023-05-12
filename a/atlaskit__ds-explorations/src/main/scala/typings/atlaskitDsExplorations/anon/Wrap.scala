package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wrap extends StObject {
  
  var wrap: SerializedStyles
}
object Wrap {
  
  inline def apply(wrap: SerializedStyles): Wrap = {
    val __obj = js.Dynamic.literal(wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Wrap] (val x: Self) extends AnyVal {
    
    inline def setWrap(value: SerializedStyles): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
  }
}
