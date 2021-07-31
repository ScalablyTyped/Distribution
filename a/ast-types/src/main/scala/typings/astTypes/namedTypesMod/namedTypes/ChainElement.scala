package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainElement
  extends StObject
     with Node {
  
  var optional: js.UndefOr[Boolean] = js.undefined
}
object ChainElement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ChainElement")
  @js.native
  val ^ : Type[ChainElement] = js.native
  
  @scala.inline
  implicit class ChainElementMutableBuilder[Self <: ChainElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
