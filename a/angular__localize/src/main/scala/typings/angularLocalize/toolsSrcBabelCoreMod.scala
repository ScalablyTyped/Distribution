package typings.angularLocalize

import typings.babelCore.mod.BabelFileResult
import typings.babelCore.mod.ParseResult
import typings.babelCore.mod.PluginPass
import typings.babelTraverse.anon.Container
import typings.babelTraverse.mod.Hub
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcBabelCoreMod {
  
  @JSImport("@angular/localize/tools/src/babel_core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object NodePath {
    
    @JSImport("@angular/localize/tools/src/babel_core", "NodePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get[C /* <: Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typings.babelTraverse.mod.NodePath[
        /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.babelTraverse.mod.NodePath[
        /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
      ]]
  }
  type NodePath[T] = typings.babelCore.mod.NodePath[T]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/localize/tools/src/babel_core", "NodePath")
  @js.native
  open class NodePathCls[T] protected ()
    extends typings.babelCore.mod.NodePath[T] {
    def this(hub: Hub, parent: Node) = this()
  }
  
  inline def parseSync(code: String): ParseResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any]).asInstanceOf[ParseResult | Null]
  inline def parseSync(code: String, options: typings.babelCore.mod.TransformOptions): ParseResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult | Null]
  
  inline def transformFromAstSync(ast: typings.babelCore.mod.Node): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
  inline def transformFromAstSync(ast: typings.babelCore.mod.Node, code: String): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  inline def transformFromAstSync(ast: typings.babelCore.mod.Node, code: String, opts: typings.babelCore.mod.TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  inline def transformFromAstSync(ast: typings.babelCore.mod.Node, code: Unit, opts: typings.babelCore.mod.TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  
  inline def transformSync(code: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
  inline def transformSync(code: String, opts: typings.babelCore.mod.TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  
  type ConfigAPI = typings.babelCore.mod.ConfigAPI
  
  type PluginObj = typings.babelCore.mod.PluginObj[PluginPass]
  
  type TransformOptions = typings.babelCore.mod.TransformOptions
}
