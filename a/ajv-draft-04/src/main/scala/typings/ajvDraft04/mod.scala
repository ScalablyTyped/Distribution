package typings.ajvDraft04

import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenCodeMod.CodeArg
import typings.ajv.distCompileCodegenCodeMod._Code
import typings.ajv.distCompileCodegenMod.CodeGenOptions
import typings.ajv.distCompileCodegenScopeMod.ValueScope
import typings.ajv.distCompileMod.SchemaObjCxt
import typings.ajv.distCoreMod.Options
import typings.ajv.distTypesMod.AddedKeywordDefinition
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ajv-draft-04", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv-draft-04", JSImport.Default)
  @js.native
  open class default () extends Ajv {
    def this(opts: Options) = this()
  }
  
  @JSImport("ajv-draft-04", "CodeGen")
  @js.native
  open class CodeGen protected ()
    extends typings.ajv.distCoreMod.CodeGen {
    def this(extScope: ValueScope) = this()
    def this(extScope: ValueScope, opts: CodeGenOptions) = this()
  }
  
  @JSImport("ajv-draft-04", "KeywordCxt")
  @js.native
  open class KeywordCxt protected ()
    extends typings.ajv.distCoreMod.KeywordCxt {
    def this(it: SchemaObjCxt, `def`: AddedKeywordDefinition, keyword: String) = this()
  }
  
  @JSImport("ajv-draft-04", "Name")
  @js.native
  open class Name protected ()
    extends typings.ajv.distCoreMod.Name {
    def this(s: String) = this()
  }
  
  inline def _underscore(strs: TemplateStringsArray, args: CodeArg*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("_")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  @JSImport("ajv-draft-04", "nil")
  @js.native
  val nil: _Code = js.native
  
  inline def str(strs: TemplateStringsArray, args: (CodeArg | js.Array[String])*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def stringify(x: Any): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(x.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @js.native
  trait Ajv
    extends typings.ajv.distCoreMod.default
}
