package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.PositionKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLocation extends StObject {
  
  var end: PositionKind
  
  var source: js.UndefOr[String | Null] = js.undefined
  
  var start: PositionKind
}
object SourceLocation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.SourceLocation")
  @js.native
  val ^ : Type[SourceLocation] = js.native
  
  extension [Self <: SourceLocation](x: Self) {
    
    inline def setEnd(value: PositionKind): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStart(value: PositionKind): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
