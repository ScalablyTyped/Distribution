package typings.activexLibreoffice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sequence[T] extends StObject {
  
  var typekey: sequence[T] = js.native
}
object sequence {
  
  @scala.inline
  def apply[T](typekey: sequence[T]): sequence[T] = {
    val __obj = js.Dynamic.literal(typekey = typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[sequence[T]]
  }
  
  @scala.inline
  implicit class sequenceMutableBuilder[Self <: sequence[_], T] (val x: Self with sequence[T]) extends AnyVal {
    
    @scala.inline
    def setTypekey(value: sequence[T]): Self = StObject.set(x, "typekey", value.asInstanceOf[js.Any])
  }
}
