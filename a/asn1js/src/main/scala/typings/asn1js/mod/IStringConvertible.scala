package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStringConvertible extends StObject {
  
  /**
    * Creates a class object from the string
    * @param data Input string to convert from
    */
  def fromString(data: String): Unit
}
object IStringConvertible {
  
  inline def apply(fromString: String => Unit): IStringConvertible = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
    __obj.asInstanceOf[IStringConvertible]
  }
  
  extension [Self <: IStringConvertible](x: Self) {
    
    inline def setFromString(value: String => Unit): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
  }
}
