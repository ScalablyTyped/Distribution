package typings.ajv

import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenCodeMod.Name
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileCodegenScopeMod {
  
  @JSImport("ajv/dist/compile/codegen/scope", "Scope")
  @js.native
  open class Scope () extends StObject {
    def this(hasPrefixesParent: ScopeOptions) = this()
    
    /* private */ var _nameGroup: Any = js.native
    
    /* protected */ val _names: /* import warning: importer.ImportType#apply Failed type conversion: {[ Prefix in string ]:? ajv.ajv/dist/compile/codegen/scope.NameGroup} */ js.Any = js.native
    
    /* protected */ def _newName(prefix: String): String = js.native
    
    /* protected */ val _parent: js.UndefOr[Scope] = js.native
    
    /* protected */ val _prefixes: js.UndefOr[Set[String]] = js.native
    
    def name(prefix: String): Name = js.native
    
    def toName(nameOrPrefix: String): Name = js.native
    def toName(nameOrPrefix: Name): Name = js.native
  }
  
  @js.native
  sealed trait UsedValueState extends StObject
  @JSImport("ajv/dist/compile/codegen/scope", "UsedValueState")
  @js.native
  object UsedValueState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UsedValueState & Double] = js.native
    
    @js.native
    sealed trait Completed
      extends StObject
         with UsedValueState
    /* 1 */ val Completed: typings.ajv.distCompileCodegenScopeMod.UsedValueState.Completed & Double = js.native
    
    @js.native
    sealed trait Started
      extends StObject
         with UsedValueState
    /* 0 */ val Started: typings.ajv.distCompileCodegenScopeMod.UsedValueState.Started & Double = js.native
  }
  
  @JSImport("ajv/dist/compile/codegen/scope", "ValueScope")
  @js.native
  open class ValueScope protected () extends Scope {
    def this(opts: ValueScopeOptions) = this()
    
    /* private */ var _reduceValues: Any = js.native
    
    /* protected */ val _scope: ScopeStore = js.native
    
    /* protected */ val _values: ScopeValues = js.native
    
    def get(): ScopeStore = js.native
    
    def getValue(prefix: String, keyOrRef: Any): js.UndefOr[ValueScopeName] = js.native
    
    val opts: VSOptions = js.native
    
    def scopeCode(): Code = js.native
    def scopeCode(values: Unit, usedValues: Unit, getCode: js.Function1[/* n */ ValueScopeName, js.UndefOr[Code]]): Code = js.native
    def scopeCode(values: Unit, usedValues: UsedScopeValues): Code = js.native
    def scopeCode(
      values: Unit,
      usedValues: UsedScopeValues,
      getCode: js.Function1[/* n */ ValueScopeName, js.UndefOr[Code]]
    ): Code = js.native
    def scopeCode(values: ScopeValueSets): Code = js.native
    def scopeCode(
      values: ScopeValueSets,
      usedValues: Unit,
      getCode: js.Function1[/* n */ ValueScopeName, js.UndefOr[Code]]
    ): Code = js.native
    def scopeCode(values: ScopeValueSets, usedValues: UsedScopeValues): Code = js.native
    def scopeCode(
      values: ScopeValueSets,
      usedValues: UsedScopeValues,
      getCode: js.Function1[/* n */ ValueScopeName, js.UndefOr[Code]]
    ): Code = js.native
    def scopeCode(values: ScopeValues): Code = js.native
    def scopeCode(
      values: ScopeValues,
      usedValues: Unit,
      getCode: js.Function1[/* n */ ValueScopeName, js.UndefOr[Code]]
    ): Code = js.native
    def scopeCode(values: ScopeValues, usedValues: UsedScopeValues): Code = js.native
    def scopeCode(
      values: ScopeValues,
      usedValues: UsedScopeValues,
      getCode: js.Function1[/* n */ ValueScopeName, js.UndefOr[Code]]
    ): Code = js.native
    
    def scopeRefs(scopeName: Name): Code = js.native
    def scopeRefs(scopeName: Name, values: ScopeValueSets): Code = js.native
    def scopeRefs(scopeName: Name, values: ScopeValues): Code = js.native
    
    def value(nameOrPrefix: String, value: NameValue): ValueScopeName = js.native
    def value(nameOrPrefix: ValueScopeName, value: NameValue): ValueScopeName = js.native
  }
  
  @JSImport("ajv/dist/compile/codegen/scope", "ValueScopeName")
  @js.native
  open class ValueScopeName protected () extends Name {
    def this(prefix: String, nameStr: String) = this()
    
    val prefix: String = js.native
    
    var scopePath: js.UndefOr[Code] = js.native
    
    def setValue(value: NameValue, hasPropertyItemIndex: ScopePath): Unit = js.native
    
    var value: js.UndefOr[NameValue] = js.native
  }
  
  object varKinds {
    
    @JSImport("ajv/dist/compile/codegen/scope", "varKinds")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/compile/codegen/scope", "varKinds.const")
    @js.native
    def const: Name = js.native
    inline def const_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("const")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen/scope", "varKinds.let")
    @js.native
    def let: Name = js.native
    inline def let_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("let")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/compile/codegen/scope", "varKinds.var")
    @js.native
    val `var`: Name = js.native
  }
  
  trait NameGroup extends StObject {
    
    var index: Double
    
    var prefix: String
  }
  object NameGroup {
    
    inline def apply(index: Double, prefix: String): NameGroup = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameGroup]
    }
    
    extension [Self <: NameGroup](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameValue extends StObject {
    
    var code: js.UndefOr[Code] = js.undefined
    
    var key: js.UndefOr[Any] = js.undefined
    
    var ref: ValueReference
  }
  object NameValue {
    
    inline def apply(ref: ValueReference): NameValue = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameValue]
    }
    
    extension [Self <: NameValue](x: Self) {
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRef(value: ValueReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScopeOptions extends StObject {
    
    var parent: js.UndefOr[Scope] = js.undefined
    
    var prefixes: js.UndefOr[Set[String]] = js.undefined
  }
  object ScopeOptions {
    
    inline def apply(): ScopeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScopeOptions]
    }
    
    extension [Self <: ScopeOptions](x: Self) {
      
      inline def setParent(value: Scope): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPrefixes(value: Set[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    }
  }
  
  trait ScopePath extends StObject {
    
    var itemIndex: Double
    
    var property: String
  }
  object ScopePath {
    
    inline def apply(itemIndex: Double, property: String): ScopePath = {
      val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopePath]
    }
    
    extension [Self <: ScopePath](x: Self) {
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  type ScopeStore = Record[String, js.UndefOr[js.Array[ValueReference]]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Prefix in string ]:? std.Set<ajv.ajv/dist/compile/codegen/scope.ValueScopeName>}
    }}}
    */
  @js.native
  trait ScopeValueSets extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Prefix in string ]:? std.Map<unknown, ajv.ajv/dist/compile/codegen/scope.ValueScopeName>}
    }}}
    */
  @js.native
  trait ScopeValues extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Prefix in string ]:? std.Map<ajv.ajv/dist/compile/codegen/scope.ValueScopeName, ajv.ajv/dist/compile/codegen/scope.UsedValueState | undefined>}
    }}}
    */
  @js.native
  trait UsedScopeValues extends StObject
  
  trait VSOptions
    extends StObject
       with ValueScopeOptions {
    
    var _n: Code
  }
  object VSOptions {
    
    inline def apply(_n: Code, scope: ScopeStore): VSOptions = {
      val __obj = js.Dynamic.literal(_n = _n.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSOptions]
    }
    
    extension [Self <: VSOptions](x: Self) {
      
      inline def set_n(value: Code): Self = StObject.set(x, "_n", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueReference = Any
  
  trait ValueScopeOptions
    extends StObject
       with ScopeOptions {
    
    var es5: js.UndefOr[Boolean] = js.undefined
    
    var lines: js.UndefOr[Boolean] = js.undefined
    
    var scope: ScopeStore
  }
  object ValueScopeOptions {
    
    inline def apply(scope: ScopeStore): ValueScopeOptions = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueScopeOptions]
    }
    
    extension [Self <: ValueScopeOptions](x: Self) {
      
      inline def setEs5(value: Boolean): Self = StObject.set(x, "es5", value.asInstanceOf[js.Any])
      
      inline def setEs5Undefined: Self = StObject.set(x, "es5", js.undefined)
      
      inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setScope(value: ScopeStore): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
