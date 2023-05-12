package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monospace extends StObject {
  
  var monospace: SerializedStyles
  
  var sans: SerializedStyles
}
object Monospace {
  
  inline def apply(monospace: SerializedStyles, sans: SerializedStyles): Monospace = {
    val __obj = js.Dynamic.literal(monospace = monospace.asInstanceOf[js.Any], sans = sans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monospace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Monospace] (val x: Self) extends AnyVal {
    
    inline def setMonospace(value: SerializedStyles): Self = StObject.set(x, "monospace", value.asInstanceOf[js.Any])
    
    inline def setSans(value: SerializedStyles): Self = StObject.set(x, "sans", value.asInstanceOf[js.Any])
  }
}
