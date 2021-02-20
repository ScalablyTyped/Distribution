package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightNull extends StObject {
  
  var height: Null = js.native
}
object HeightNull {
  
  @scala.inline
  def apply(height: Null): HeightNull = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightNull]
  }
  
  @scala.inline
  implicit class HeightNullMutableBuilder[Self <: HeightNull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Null): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
