package typings.awsSdk.accessanalyzerMod

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
  
  extension [Self <: Substring](x: Self) {
    
    inline def setLength(value: Integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
