package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Element
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementSymbol extends StObject {
  
  /** A list of directives applied to the element. */
  var directives: js.Array[DirectiveSymbol]
  
  var kind: Element
  
  /** The location in the shim file for the variable that holds the type of the element. */
  var tcbLocation: TcbLocation
  
  var templateNode: TmplAstElement
  
  /** The `ts.Symbol` for the `HTMLElement`. */
  var tsSymbol: typings.typescript.mod.Symbol | Null
  
  /** The `ts.Type` for the `HTMLElement`. */
  var tsType: Type
}
object ElementSymbol {
  
  inline def apply(
    directives: js.Array[DirectiveSymbol],
    kind: Element,
    tcbLocation: TcbLocation,
    templateNode: TmplAstElement,
    tsType: Type
  ): ElementSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[ElementSymbol]
  }
  
  extension [Self <: ElementSymbol](x: Self) {
    
    inline def setDirectives(value: js.Array[DirectiveSymbol]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesVarargs(value: DirectiveSymbol*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setKind(value: Element): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTemplateNode(value: TmplAstElement): Self = StObject.set(x, "templateNode", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsSymbolNull: Self = StObject.set(x, "tsSymbol", null)
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
