package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtil extends StObject {
  
  def assert(condition: Boolean, message: String): Unit = js.native
}
object IUtil {
  
  @scala.inline
  def apply(assert: (Boolean, String) => Unit): IUtil = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
    __obj.asInstanceOf[IUtil]
  }
  
  @scala.inline
  implicit class IUtilMutableBuilder[Self <: IUtil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: (Boolean, String) => Unit): Self = StObject.set(x, "assert", js.Any.fromFunction2(value))
  }
}
