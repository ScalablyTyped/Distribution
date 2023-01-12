package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Substring extends StObject {
  
  /**
    * The length of the substring.
    */
  var length: Integer
  
  /**
    * The start index of the substring, starting from 0.
    */
  var start: Integer
}
object Substring {
  
  inline def apply(length: Integer, start: Integer): Substring = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Substring] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
