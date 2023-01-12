package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignSelf extends StObject {
  
  var alignSelf: String
  
  var marginRight: Double
}
object AlignSelf {
  
  inline def apply(alignSelf: String, marginRight: Double): AlignSelf = {
    val __obj = js.Dynamic.literal(alignSelf = alignSelf.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignSelf] (val x: Self) extends AnyVal {
    
    inline def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
  }
}
