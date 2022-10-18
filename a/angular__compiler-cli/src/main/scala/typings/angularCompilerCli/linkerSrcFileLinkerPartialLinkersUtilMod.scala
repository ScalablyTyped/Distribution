package typings.angularCompilerCli

import typings.angularCompiler.mod.MaybeForwardRefExpression
import typings.angularCompiler.mod.R3DeclareDependencyMetadata
import typings.angularCompiler.mod.R3DependencyMetadata
import typings.angularCompiler.mod.R3Reference
import typings.angularCompiler.mod.WrappedNodeExpr
import typings.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typings.angularCompilerCli.linkerSrcAstAstValueMod.AstValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersUtilMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractForwardRef[TExpression](expr: AstValue[Any, TExpression]): MaybeForwardRefExpression[WrappedNodeExpr[TExpression]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractForwardRef")(expr.asInstanceOf[js.Any]).asInstanceOf[MaybeForwardRefExpression[WrappedNodeExpr[TExpression]]]
  
  inline def getDependency[TExpression](depObj: AstObject[R3DeclareDependencyMetadata, TExpression]): R3DependencyMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependency")(depObj.asInstanceOf[js.Any]).asInstanceOf[R3DependencyMetadata]
  
  inline def parseEnum[TExpression, TEnum](value: AstValue[Any, TExpression], Enum: TEnum): /* import warning: importer.ImportType#apply Failed type conversion: TEnum[keyof TEnum] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEnum")(value.asInstanceOf[js.Any], Enum.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TEnum[keyof TEnum] */ js.Any]
  
  inline def wrapReference[TExpression](wrapped: WrappedNodeExpr[TExpression]): R3Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapReference")(wrapped.asInstanceOf[js.Any]).asInstanceOf[R3Reference]
}
