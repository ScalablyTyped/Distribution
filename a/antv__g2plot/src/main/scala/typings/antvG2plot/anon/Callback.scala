package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  def callback(x: js.Array[Double], name: String): Content
  
  var fields: js.Array[String]
}
object Callback {
  
  inline def apply(callback: (js.Array[Double], String) => Content, fields: js.Array[String]): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(value: (js.Array[Double], String) => Content): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
