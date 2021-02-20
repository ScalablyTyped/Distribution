package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printable extends StObject {
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Printable {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Printable")
  @js.native
  val ^ : Type[Printable] = js.native
  
  @scala.inline
  implicit class PrintableMutableBuilder[Self <: Printable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
