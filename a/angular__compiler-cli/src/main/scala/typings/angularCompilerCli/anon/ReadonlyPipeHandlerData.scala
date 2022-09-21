package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompiler.mod.R3PipeMetadata
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/src/pipe.PipeHandlerData> */
trait ReadonlyPipeHandlerData extends StObject {
  
  val classMetadata: js.UndefOr[R3ClassMetadata | Null] = js.undefined
  
  val decorator: js.UndefOr[typings.typescript.mod.Decorator | Null] = js.undefined
  
  val meta: R3PipeMetadata
  
  val pipeNameExpr: Expression
}
object ReadonlyPipeHandlerData {
  
  inline def apply(meta: R3PipeMetadata, pipeNameExpr: Expression): ReadonlyPipeHandlerData = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pipeNameExpr = pipeNameExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPipeHandlerData]
  }
  
  extension [Self <: ReadonlyPipeHandlerData](x: Self) {
    
    inline def setClassMetadata(value: R3ClassMetadata): Self = StObject.set(x, "classMetadata", value.asInstanceOf[js.Any])
    
    inline def setClassMetadataNull: Self = StObject.set(x, "classMetadata", null)
    
    inline def setClassMetadataUndefined: Self = StObject.set(x, "classMetadata", js.undefined)
    
    inline def setDecorator(value: typings.typescript.mod.Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    inline def setMeta(value: R3PipeMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPipeNameExpr(value: Expression): Self = StObject.set(x, "pipeNameExpr", value.asInstanceOf[js.Any])
  }
}
