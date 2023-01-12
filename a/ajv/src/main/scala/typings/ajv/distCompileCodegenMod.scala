package typings.ajv

import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenCodeMod.CodeArg
import typings.ajv.distCompileCodegenCodeMod._Code
import typings.ajv.distCompileCodegenScopeMod.NameValue
import typings.ajv.distCompileCodegenScopeMod.ScopeOptions
import typings.ajv.distCompileCodegenScopeMod.ScopeValueSets
import typings.ajv.distCompileCodegenScopeMod.ValueScopeOptions
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileCodegenMod {
  
  @JSImport("ajv/dist/compile/codegen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/compile/codegen", "CodeGen")
  @js.native
  open class CodeGen protected () extends StObject {
    def this(extScope: typings.ajv.distCompileCodegenScopeMod.ValueScope) = this()
    def this(extScope: typings.ajv.distCompileCodegenScopeMod.ValueScope, opts: CodeGenOptions) = this()
    
    /* private */ var _blockNode: Any = js.native
    
    /* private */ val _blockStarts: Any = js.native
    
    /* private */ val _constants: Any = js.native
    
    /* private */ def _currNode: Any = js.native
    /* private */ def _currNode_=(value: Any): Unit = js.native
    
    /* private */ var _def: Any = js.native
    
    /* private */ var _elseNode: Any = js.native
    
    /* private */ var _endBlockNode: Any = js.native
    
    val _extScope: typings.ajv.distCompileCodegenScopeMod.ValueScope = js.native
    
    /* private */ var _for: Any = js.native
    
    /* private */ var _leafNode: Any = js.native
    
    /* private */ val _nodes: Any = js.native
    
    /* private */ def _root: Any = js.native
    
    val _scope: typings.ajv.distCompileCodegenScopeMod.Scope = js.native
    
    val _values: ScopeValueSets = js.native
    
    def add(lhs: Code, rhs: SafeExpr): CodeGen = js.native
    
    def assign(lhs: Code, rhs: SafeExpr): CodeGen = js.native
    def assign(lhs: Code, rhs: SafeExpr, sideEffects: Boolean): CodeGen = js.native
    
    def block(): CodeGen = js.native
    def block(body: Unit, nodeCount: Double): CodeGen = js.native
    def block(body: Block): CodeGen = js.native
    def block(body: Block, nodeCount: Double): CodeGen = js.native
    
    def break(): CodeGen = js.native
    def break(label: Code): CodeGen = js.native
    
    def code(c: Block): CodeGen = js.native
    def code(c: SafeExpr): CodeGen = js.native
    
    def const(nameOrPrefix: String, rhs: SafeExpr): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def const(nameOrPrefix: String, rhs: SafeExpr, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def const(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: SafeExpr): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def const(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: SafeExpr, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    
    def `else`(): CodeGen = js.native
    
    def elseIf(condition: Boolean): CodeGen = js.native
    def elseIf(condition: Code): CodeGen = js.native
    
    def endBlock(): CodeGen = js.native
    def endBlock(nodeCount: Double): CodeGen = js.native
    
    def endFor(): CodeGen = js.native
    
    def endFunc(): CodeGen = js.native
    
    def endIf(): CodeGen = js.native
    
    def `for`(iteration: Code): CodeGen = js.native
    def `for`(iteration: Code, forBody: Block): CodeGen = js.native
    
    def forIn(
      nameOrPrefix: String,
      obj: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]
    ): CodeGen = js.native
    def forIn(
      nameOrPrefix: String,
      obj: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      varKind: Code
    ): CodeGen = js.native
    def forIn(
      nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name,
      obj: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]
    ): CodeGen = js.native
    def forIn(
      nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name,
      obj: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      varKind: Code
    ): CodeGen = js.native
    
    def forOf(
      nameOrPrefix: String,
      iterable: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]
    ): CodeGen = js.native
    def forOf(
      nameOrPrefix: String,
      iterable: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      varKind: Code
    ): CodeGen = js.native
    def forOf(
      nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name,
      iterable: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]
    ): CodeGen = js.native
    def forOf(
      nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name,
      iterable: Code,
      forBody: js.Function1[/* item */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      varKind: Code
    ): CodeGen = js.native
    
    def forRange(
      nameOrPrefix: String,
      from: SafeExpr,
      to: SafeExpr,
      forBody: js.Function1[/* index */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]
    ): CodeGen = js.native
    def forRange(
      nameOrPrefix: String,
      from: SafeExpr,
      to: SafeExpr,
      forBody: js.Function1[/* index */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      varKind: Code
    ): CodeGen = js.native
    def forRange(
      nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name,
      from: SafeExpr,
      to: SafeExpr,
      forBody: js.Function1[/* index */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]
    ): CodeGen = js.native
    def forRange(
      nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name,
      from: SafeExpr,
      to: SafeExpr,
      forBody: js.Function1[/* index */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      varKind: Code
    ): CodeGen = js.native
    
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Unit, async: Boolean): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Unit, async: Boolean, funcBody: Block): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Unit, async: Unit, funcBody: Block): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Code): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Code, async: Boolean): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Code, async: Boolean, funcBody: Block): CodeGen = js.native
    def func(name: typings.ajv.distCompileCodegenCodeMod.Name, args: Code, async: Unit, funcBody: Block): CodeGen = js.native
    
    def getScopeValue(prefix: String, keyOrRef: Any): js.UndefOr[typings.ajv.distCompileCodegenScopeMod.ValueScopeName] = js.native
    
    def `if`(condition: Boolean): CodeGen = js.native
    def `if`(condition: Boolean, thenBody: Unit, elseBody: Block): CodeGen = js.native
    def `if`(condition: Boolean, thenBody: Block): CodeGen = js.native
    def `if`(condition: Boolean, thenBody: Block, elseBody: Block): CodeGen = js.native
    def `if`(condition: Code): CodeGen = js.native
    def `if`(condition: Code, thenBody: Unit, elseBody: Block): CodeGen = js.native
    def `if`(condition: Code, thenBody: Block): CodeGen = js.native
    def `if`(condition: Code, thenBody: Block, elseBody: Block): CodeGen = js.native
    
    def label(label: typings.ajv.distCompileCodegenCodeMod.Name): CodeGen = js.native
    
    def let(nameOrPrefix: String): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: String, rhs: Unit, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: String, rhs: SafeExpr): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: String, rhs: SafeExpr, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: Unit, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: SafeExpr): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def let(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: SafeExpr, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    
    def name(prefix: String): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    
    def `object`(keyValues: (js.Tuple2[typings.ajv.distCompileCodegenCodeMod.Name | String, SafeExpr | String])*): _Code = js.native
    
    def optimize(): Unit = js.native
    def optimize(n: Double): Unit = js.native
    
    /* private */ val opts: Any = js.native
    
    def `return`(value: Block): CodeGen = js.native
    def `return`(value: SafeExpr): CodeGen = js.native
    
    def scopeCode(): Code = js.native
    
    def scopeName(prefix: String): typings.ajv.distCompileCodegenScopeMod.ValueScopeName = js.native
    
    def scopeRefs(scopeName: typings.ajv.distCompileCodegenCodeMod.Name): Code = js.native
    
    def scopeValue(prefixOrName: String, value: NameValue): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def scopeValue(prefixOrName: typings.ajv.distCompileCodegenScopeMod.ValueScopeName, value: NameValue): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    
    def `throw`(error: Code): CodeGen = js.native
    
    def `try`(tryBody: Block): CodeGen = js.native
    def `try`(tryBody: Block, catchCode: js.Function1[/* e */ typings.ajv.distCompileCodegenCodeMod.Name, Unit]): CodeGen = js.native
    def `try`(
      tryBody: Block,
      catchCode: js.Function1[/* e */ typings.ajv.distCompileCodegenCodeMod.Name, Unit],
      finallyCode: Block
    ): CodeGen = js.native
    def `try`(tryBody: Block, catchCode: Unit, finallyCode: Block): CodeGen = js.native
    
    def `var`(nameOrPrefix: String): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: String, rhs: Unit, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: String, rhs: SafeExpr): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: String, rhs: SafeExpr, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: Unit, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: SafeExpr): typings.ajv.distCompileCodegenCodeMod.Name = js.native
    def `var`(nameOrPrefix: typings.ajv.distCompileCodegenCodeMod.Name, rhs: SafeExpr, _constant: Boolean): typings.ajv.distCompileCodegenCodeMod.Name = js.native
  }
  
  @JSImport("ajv/dist/compile/codegen", "Name")
  @js.native
  open class Name protected ()
    extends typings.ajv.distCompileCodegenCodeMod.Name {
    def this(s: String) = this()
  }
  
  @JSImport("ajv/dist/compile/codegen", "Scope")
  @js.native
  open class Scope ()
    extends typings.ajv.distCompileCodegenScopeMod.Scope {
    def this(param0: ScopeOptions) = this()
  }
  
  @JSImport("ajv/dist/compile/codegen", "ValueScope")
  @js.native
  open class ValueScope protected ()
    extends typings.ajv.distCompileCodegenScopeMod.ValueScope {
    def this(opts: ValueScopeOptions) = this()
  }
  
  @JSImport("ajv/dist/compile/codegen", "ValueScopeName")
  @js.native
  open class ValueScopeName protected ()
    extends typings.ajv.distCompileCodegenScopeMod.ValueScopeName {
    def this(prefix: String, nameStr: String) = this()
  }
  
  inline def _underscore(strs: TemplateStringsArray, args: CodeArg*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("_")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def and(args: Code*): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Code]
  
  inline def getProperty(key: String): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  inline def getProperty(key: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  inline def getProperty(key: Code): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(key.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @JSImport("ajv/dist/compile/codegen", "nil")
  @js.native
  val nil: _Code = js.native
  
  inline def not(x: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def not(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def not(x: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(x.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def not(x: typings.ajv.distCompileCodegenCodeMod.Name): typings.ajv.distCompileCodegenCodeMod.Name = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(x.asInstanceOf[js.Any]).asInstanceOf[typings.ajv.distCompileCodegenCodeMod.Name]
  inline def not(x: _Code): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(x.asInstanceOf[js.Any]).asInstanceOf[_Code]
  
  object operators {
    
    @JSImport("ajv/dist/compile/codegen", "operators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/compile/codegen", "operators.ADD")
    @js.native
    def ADD: _Code = js.native
    inline def ADD_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADD")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.AND")
    @js.native
    def AND: _Code = js.native
    inline def AND_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AND")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.EQ")
    @js.native
    def EQ: _Code = js.native
    inline def EQ_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQ")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.GT")
    @js.native
    def GT: _Code = js.native
    
    @JSImport("ajv/dist/compile/codegen", "operators.GTE")
    @js.native
    def GTE: _Code = js.native
    inline def GTE_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GTE")(x.asInstanceOf[js.Any])
    
    inline def GT_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GT")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.LT")
    @js.native
    def LT: _Code = js.native
    
    @JSImport("ajv/dist/compile/codegen", "operators.LTE")
    @js.native
    def LTE: _Code = js.native
    inline def LTE_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LTE")(x.asInstanceOf[js.Any])
    
    inline def LT_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LT")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.NEQ")
    @js.native
    def NEQ: _Code = js.native
    inline def NEQ_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEQ")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.NOT")
    @js.native
    def NOT: _Code = js.native
    inline def NOT_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "operators.OR")
    @js.native
    def OR: _Code = js.native
    inline def OR_=(x: _Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OR")(x.asInstanceOf[js.Any])
  }
  
  inline def or(args: Code*): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Code]
  
  inline def regexpCode(rx: js.RegExp): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("regexpCode")(rx.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def str(strs: TemplateStringsArray, args: (CodeArg | js.Array[String])*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def strConcat(c1: Code, c2: Code): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("strConcat")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[Code]
  
  inline def stringify(x: Any): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(x.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  object varKinds {
    
    @JSImport("ajv/dist/compile/codegen", "varKinds")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/compile/codegen", "varKinds.const")
    @js.native
    def const: typings.ajv.distCompileCodegenCodeMod.Name = js.native
    inline def const_=(x: typings.ajv.distCompileCodegenCodeMod.Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("const")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "varKinds.let")
    @js.native
    def let: typings.ajv.distCompileCodegenCodeMod.Name = js.native
    inline def let_=(x: typings.ajv.distCompileCodegenCodeMod.Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("let")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen", "varKinds.var")
    @js.native
    val `var`: typings.ajv.distCompileCodegenCodeMod.Name = js.native
  }
  
  type Block = Code | js.Function0[Unit]
  
  trait CodeGenOptions extends StObject {
    
    var es5: js.UndefOr[Boolean] = js.undefined
    
    var lines: js.UndefOr[Boolean] = js.undefined
    
    var ownProperties: js.UndefOr[Boolean] = js.undefined
  }
  object CodeGenOptions {
    
    inline def apply(): CodeGenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeGenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeGenOptions] (val x: Self) extends AnyVal {
      
      inline def setEs5(value: Boolean): Self = StObject.set(x, "es5", value.asInstanceOf[js.Any])
      
      inline def setEs5Undefined: Self = StObject.set(x, "es5", js.undefined)
      
      inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
      
      inline def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
    }
  }
  
  type SafeExpr = Code | Double | Boolean | Null
}
