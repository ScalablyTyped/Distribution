package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHeight extends StObject {
  
  var listHeight: Double
  
  var listWidth: Double
  
  var listWidthLG: Double
}
object ListHeight {
  
  inline def apply(listHeight: Double, listWidth: Double, listWidthLG: Double): ListHeight = {
    val __obj = js.Dynamic.literal(listHeight = listHeight.asInstanceOf[js.Any], listWidth = listWidth.asInstanceOf[js.Any], listWidthLG = listWidthLG.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHeight] (val x: Self) extends AnyVal {
    
    inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
    
    inline def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    inline def setListWidthLG(value: Double): Self = StObject.set(x, "listWidthLG", value.asInstanceOf[js.Any])
  }
}
