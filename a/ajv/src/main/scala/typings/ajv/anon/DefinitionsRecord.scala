package typings.ajv.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionsRecord extends StObject {
  
  var definitions: Record[String, Any]
}
object DefinitionsRecord {
  
  inline def apply(definitions: Record[String, Any]): DefinitionsRecord = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionsRecord]
  }
  
  extension [Self <: DefinitionsRecord](x: Self) {
    
    inline def setDefinitions(value: Record[String, Any]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
  }
}
