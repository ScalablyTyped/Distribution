package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cols extends StObject {
  
  var cols: js.Array[Key]
  
  var selMinute: js.Any
}
object Cols {
  
  @scala.inline
  def apply(cols: js.Array[Key], selMinute: js.Any): Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
  
  @scala.inline
  implicit class ColsMutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: js.Array[Key]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsVarargs(value: Key*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setSelMinute(value: js.Any): Self = StObject.set(x, "selMinute", value.asInstanceOf[js.Any])
  }
}
