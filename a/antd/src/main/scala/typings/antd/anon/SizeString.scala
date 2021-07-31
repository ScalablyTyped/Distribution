package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeString extends StObject {
  
  var size: String
}
object SizeString {
  
  @scala.inline
  def apply(size: String): SizeString = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeString]
  }
  
  @scala.inline
  implicit class SizeStringMutableBuilder[Self <: SizeString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
