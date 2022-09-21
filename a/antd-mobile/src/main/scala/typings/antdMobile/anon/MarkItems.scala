package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkItems extends StObject {
  
  var markItems: js.Array[String]
  
  def renderYearAndMonth(year: Double, month: Double): String
}
object MarkItems {
  
  inline def apply(markItems: js.Array[String], renderYearAndMonth: (Double, Double) => String): MarkItems = {
    val __obj = js.Dynamic.literal(markItems = markItems.asInstanceOf[js.Any], renderYearAndMonth = js.Any.fromFunction2(renderYearAndMonth))
    __obj.asInstanceOf[MarkItems]
  }
  
  extension [Self <: MarkItems](x: Self) {
    
    inline def setMarkItems(value: js.Array[String]): Self = StObject.set(x, "markItems", value.asInstanceOf[js.Any])
    
    inline def setMarkItemsVarargs(value: String*): Self = StObject.set(x, "markItems", js.Array(value*))
    
    inline def setRenderYearAndMonth(value: (Double, Double) => String): Self = StObject.set(x, "renderYearAndMonth", js.Any.fromFunction2(value))
  }
}
