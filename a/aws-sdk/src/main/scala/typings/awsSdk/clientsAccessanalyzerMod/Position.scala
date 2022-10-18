package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  /**
    * The column of the position, starting from 0.
    */
  var column: Integer
  
  /**
    * The line of the position, starting from 1.
    */
  var line: Integer
  
  /**
    * The offset within the policy that corresponds to the position, starting from 0.
    */
  var offset: Integer
}
object Position {
  
  inline def apply(column: Integer, line: Integer, offset: Integer): Position = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setColumn(value: Integer): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
