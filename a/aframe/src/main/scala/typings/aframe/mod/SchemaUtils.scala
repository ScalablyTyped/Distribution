package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUtils extends StObject {
  
  def isSingleProperty(schema: Schema_[js.Object]): Boolean = js.native
  
  def process(schema: Schema_[js.Object]): Boolean = js.native
}
object SchemaUtils {
  
  @scala.inline
  def apply(isSingleProperty: Schema_[js.Object] => Boolean, process: Schema_[js.Object] => Boolean): SchemaUtils = {
    val __obj = js.Dynamic.literal(isSingleProperty = js.Any.fromFunction1(isSingleProperty), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SchemaUtils]
  }
  
  @scala.inline
  implicit class SchemaUtilsMutableBuilder[Self <: SchemaUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSingleProperty(value: Schema_[js.Object] => Boolean): Self = StObject.set(x, "isSingleProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcess(value: Schema_[js.Object] => Boolean): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
