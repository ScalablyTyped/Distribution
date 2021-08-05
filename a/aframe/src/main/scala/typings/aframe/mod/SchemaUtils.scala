package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUtils extends StObject {
  
  def isSingleProperty(schema: Schema_[js.Object]): Boolean
  
  def process(schema: Schema_[js.Object]): Boolean
}
object SchemaUtils {
  
  inline def apply(isSingleProperty: Schema_[js.Object] => Boolean, process: Schema_[js.Object] => Boolean): SchemaUtils = {
    val __obj = js.Dynamic.literal(isSingleProperty = js.Any.fromFunction1(isSingleProperty), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SchemaUtils]
  }
  
  extension [Self <: SchemaUtils](x: Self) {
    
    inline def setIsSingleProperty(value: Schema_[js.Object] => Boolean): Self = StObject.set(x, "isSingleProperty", js.Any.fromFunction1(value))
    
    inline def setProcess(value: Schema_[js.Object] => Boolean): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
