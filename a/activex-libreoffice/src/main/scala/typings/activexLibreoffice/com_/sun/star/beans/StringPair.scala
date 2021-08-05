package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a pair of two strings. */
trait StringPair extends StObject {
  
  /** specifies the first of the two strings. */
  var First: String
  
  /** specifies the second of the two strings. */
  var Second: String
}
object StringPair {
  
  inline def apply(First: String, Second: String): StringPair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringPair]
  }
  
  extension [Self <: StringPair](x: Self) {
    
    inline def setFirst(value: String): Self = StObject.set(x, "First", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: String): Self = StObject.set(x, "Second", value.asInstanceOf[js.Any])
  }
}
