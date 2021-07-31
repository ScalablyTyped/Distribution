package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTokenMetadata extends StObject {
  
  var identifier: js.UndefOr[CompileIdentifierMetadata | CompileTypeMetadata] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object CompileTokenMetadata {
  
  @scala.inline
  def apply(): CompileTokenMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileTokenMetadata]
  }
  
  @scala.inline
  implicit class CompileTokenMetadataMutableBuilder[Self <: CompileTokenMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: CompileIdentifierMetadata | CompileTypeMetadata): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
