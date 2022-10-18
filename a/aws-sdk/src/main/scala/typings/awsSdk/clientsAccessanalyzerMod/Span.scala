package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Span extends StObject {
  
  /**
    * The end position of the span (exclusive).
    */
  var end: Position
  
  /**
    * The start position of the span (inclusive).
    */
  var start: Position
}
object Span {
  
  inline def apply(end: Position, start: Position): Span = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Span]
  }
  
  extension [Self <: Span](x: Self) {
    
    inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
