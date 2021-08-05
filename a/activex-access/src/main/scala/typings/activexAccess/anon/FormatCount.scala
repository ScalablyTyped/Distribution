package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatCount extends StObject {
  
  var Cancel: Double
  
  var FormatCount: Double
}
object FormatCount {
  
  inline def apply(Cancel: Double, FormatCount: Double): FormatCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FormatCount = FormatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCount]
  }
  
  extension [Self <: FormatCount](x: Self) {
    
    inline def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setFormatCount(value: Double): Self = StObject.set(x, "FormatCount", value.asInstanceOf[js.Any])
  }
}
