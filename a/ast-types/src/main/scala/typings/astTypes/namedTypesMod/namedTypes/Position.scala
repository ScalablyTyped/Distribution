package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var column: Double
  
  var line: Double
}
object Position {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Position")
  @js.native
  val ^ : Type[Position] = js.native
  
  extension [Self <: Position](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
