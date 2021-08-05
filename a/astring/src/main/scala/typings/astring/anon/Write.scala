package typings.astring.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  def write(s: String): Unit
}
object Write {
  
  inline def apply(write: String => Unit): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
  
  extension [Self <: Write](x: Self) {
    
    inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
