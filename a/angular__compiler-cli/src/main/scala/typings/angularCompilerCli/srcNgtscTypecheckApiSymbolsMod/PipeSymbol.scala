package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Pipe
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeSymbol
  extends StObject
     with Symbol {
  
  /** The symbol for the pipe class as an instance that appears in the TCB. */
  var classSymbol: ClassSymbol
  
  var kind: Pipe
  
  /** The position of the transform call in the template. */
  var tcbLocation: TcbLocation
  
  /**
    * The `ts.Symbol` for the transform call. This could be `null` when `checkTypeOfPipes` is set to
    * `false` because the transform call would be of the form `(_pipe1 as any).transform()`
    */
  var tsSymbol: typings.typescript.mod.Symbol | Null
  
  /** The `ts.Type` of the transform node. */
  var tsType: Type
}
object PipeSymbol {
  
  inline def apply(classSymbol: ClassSymbol, kind: Pipe, tcbLocation: TcbLocation, tsType: Type): PipeSymbol = {
    val __obj = js.Dynamic.literal(classSymbol = classSymbol.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[PipeSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeSymbol] (val x: Self) extends AnyVal {
    
    inline def setClassSymbol(value: ClassSymbol): Self = StObject.set(x, "classSymbol", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Pipe): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsSymbolNull: Self = StObject.set(x, "tsSymbol", null)
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
