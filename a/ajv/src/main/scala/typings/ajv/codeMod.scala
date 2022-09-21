package typings.ajv

import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeMod {
  
  @JSImport("ajv/dist/compile/codegen/code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/compile/codegen/code", "_CodeOrName")
  @js.native
  abstract class CodeOrName () extends StObject {
    
    def emptyStr(): Boolean = js.native
    
    val names: UsedNames = js.native
    
    val str: String = js.native
  }
  
  @JSImport("ajv/dist/compile/codegen/code", "IDENTIFIER")
  @js.native
  val IDENTIFIER: js.RegExp = js.native
  
  @JSImport("ajv/dist/compile/codegen/code", "Name")
  @js.native
  open class Name protected ()
    extends CodeOrName
       with Code {
    def this(s: String) = this()
    
    @JSName("names")
    def names_MName: UsedNames = js.native
  }
  
  @JSImport("ajv/dist/compile/codegen/code", "_Code")
  @js.native
  open class _Code protected ()
    extends CodeOrName
       with Code {
    def this(code: String) = this()
    def this(code: js.Array[CodeItem]) = this()
    
    val _items: js.Array[CodeItem] = js.native
    
    /* private */ var _names: Any = js.native
    
    /* private */ var _str: Any = js.native
    
    @JSName("names")
    def names_M_Code: UsedNames = js.native
    
    @JSName("str")
    def str_M_Code: String = js.native
  }
  
  inline def _underscore(strs: TemplateStringsArray, args: CodeArg*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("_")(List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def addCodeArg(code: js.Array[CodeItem], arg: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCodeArg")(code.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCodeArg(code: js.Array[CodeItem], arg: CodeArg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCodeArg")(code.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getEsmExportName(key: String): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getEsmExportName")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  inline def getEsmExportName(key: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getEsmExportName")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  inline def getEsmExportName(key: Code): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getEsmExportName")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def getProperty(key: String): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  inline def getProperty(key: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  inline def getProperty(key: Code): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @JSImport("ajv/dist/compile/codegen/code", "nil")
  @js.native
  val nil: _Code = js.native
  
  inline def regexpCode(rx: js.RegExp): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("regexpCode")(rx.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def safeStringify(x: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeStringify")(x.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def str(strs: TemplateStringsArray, args: (CodeArg | js.Array[String])*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def strConcat(c1: Code, c2: Code): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("strConcat")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def stringify(x: Any): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(x.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.codeMod._Code
    - typings.ajv.codeMod.Name
  */
  trait Code extends StObject
  
  type CodeArg = js.UndefOr[SafeExpr | String]
  
  type CodeItem = Name | String | Double | Boolean | Null
  
  type SafeExpr = Code | Double | Boolean | Null
  
  type UsedNames = Record[String, js.UndefOr[Double]]
}
