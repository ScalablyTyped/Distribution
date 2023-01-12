package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.DomBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomBindingSymbol
  extends StObject
     with Symbol {
  
  /** The symbol for the element or template of the text attribute. */
  var host: ElementSymbol | TemplateSymbol
  
  var kind: DomBinding
}
object DomBindingSymbol {
  
  inline def apply(host: ElementSymbol | TemplateSymbol, kind: DomBinding): DomBindingSymbol = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomBindingSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomBindingSymbol] (val x: Self) extends AnyVal {
    
    inline def setHost(value: ElementSymbol | TemplateSymbol): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DomBinding): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
