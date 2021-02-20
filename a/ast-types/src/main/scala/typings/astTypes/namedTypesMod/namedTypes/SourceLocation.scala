package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.PositionKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceLocation extends StObject {
  
  var end: PositionKind = js.native
  
  var source: js.UndefOr[String | Null] = js.native
  
  var start: PositionKind = js.native
}
object SourceLocation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.SourceLocation")
  @js.native
  val ^ : Type[SourceLocation] = js.native
  
  @scala.inline
  implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: PositionKind): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStart(value: PositionKind): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
