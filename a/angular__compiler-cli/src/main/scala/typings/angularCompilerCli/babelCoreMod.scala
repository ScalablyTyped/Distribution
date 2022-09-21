package typings.angularCompilerCli

import typings.babelCore.mod.BabelFileResult
import typings.babelCore.mod.FileParseCallback
import typings.babelCore.mod.ParseResult
import typings.babelCore.mod.PluginPass
import typings.babelCore.mod.TransformOptions
import typings.babelTraverse.anon.Container
import typings.babelTraverse.mod.Hub
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelCoreMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/babel_core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object NodePath {
    
    @JSImport("@angular/compiler-cli/linker/babel/src/babel_core", "NodePath")
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
  @JSImport("@angular/compiler-cli/linker/babel/src/babel_core", "NodePath")
  @js.native
  open class NodePathCls[T] protected ()
    extends typings.babelCore.mod.NodePath[T] {
    def this(hub: Hub, parent: Node) = this()
  }
  
  inline def parse(code: String): ParseResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[ParseResult | Null]
  inline def parse(code: String, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(code: String, options: Unit, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(code: String, options: TransformOptions): ParseResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult | Null]
  inline def parse(code: String, options: TransformOptions, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformSync(code: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
  inline def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  
  type BabelFile = typings.babelCore.mod.BabelFile
  
  type ConfigAPI = typings.babelCore.mod.ConfigAPI
  
  type PluginObj = typings.babelCore.mod.PluginObj[PluginPass]
}
