package typings.ajv

import org.scalablytyped.runtime.Instantiable1
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.CodeGen
import typings.ajv.distCompileCodegenMod.Name
import typings.ajv.distCompileMod.SchemaCxt
import typings.ajv.distCompileMod.SchemaObjCxt
import typings.ajv.distCompileRulesMod.ValidationRules
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.EvaluatedItems
import typings.ajv.distTypesMod.EvaluatedProperties
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileUtilMod {
  
  @JSImport("ajv/dist/compile/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("ajv/dist/compile/util", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type & Double] = js.native
    
    @js.native
    sealed trait Num
      extends StObject
         with Type
    /* 0 */ val Num: typings.ajv.distCompileUtilMod.Type.Num & Double = js.native
    
    @js.native
    sealed trait Str
      extends StObject
         with Type
    /* 1 */ val Str: typings.ajv.distCompileUtilMod.Type.Str & Double = js.native
  }
  
  inline def alwaysValidSchema(it: SchemaCxt, schema: AnySchema): Boolean | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alwaysValidSchema")(it.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Boolean | Unit]
  
  inline def checkStrictMode(it: SchemaCxt, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStrictMode")(it.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.annotation.targetName("checkStrictMode_log")
  inline def checkStrictMode(it: SchemaCxt, msg: String, mode: "log"): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStrictMode")(it.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkStrictMode(it: SchemaCxt, msg: String, mode: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStrictMode")(it.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUnknownRules(it: SchemaCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUnknownRules")(it.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkUnknownRules(it: SchemaCxt, schema: AnySchema): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUnknownRules")(it.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachItem[T](xs: T, f: js.Function1[/* x */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachItem")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachItem[T](xs: js.Array[T], f: js.Function1[/* x */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachItem")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def escapeFragment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeFragment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escapeFragment(str: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeFragment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeJsonPointer(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJsonPointer")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escapeJsonPointer(str: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJsonPointer")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def evaluatedPropsToName(gen: CodeGen): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluatedPropsToName")(gen.asInstanceOf[js.Any]).asInstanceOf[Name]
  inline def evaluatedPropsToName(gen: CodeGen, ps: EvaluatedProperties): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluatedPropsToName")(gen.asInstanceOf[js.Any], ps.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  inline def getErrorPath(dataProp: String): Code | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any]).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: String, dataPropType: Unit, jsPropertySyntax: Boolean): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any], jsPropertySyntax.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: String, dataPropType: Type): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: String, dataPropType: Type, jsPropertySyntax: Boolean): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any], jsPropertySyntax.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Double): Code | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any]).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Double, dataPropType: Unit, jsPropertySyntax: Boolean): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any], jsPropertySyntax.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Double, dataPropType: Type): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Double, dataPropType: Type, jsPropertySyntax: Boolean): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any], jsPropertySyntax.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Name): Code | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any]).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Name, dataPropType: Unit, jsPropertySyntax: Boolean): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any], jsPropertySyntax.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Name, dataPropType: Type): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  inline def getErrorPath(dataProp: Name, dataPropType: Type, jsPropertySyntax: Boolean): Code | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorPath")(dataProp.asInstanceOf[js.Any], dataPropType.asInstanceOf[js.Any], jsPropertySyntax.asInstanceOf[js.Any])).asInstanceOf[Code | String]
  
  @JSImport("ajv/dist/compile/util", "mergeEvaluated")
  @js.native
  val mergeEvaluated: MergeEvaluated_ = js.native
  
  inline def schemaHasRules(
    schema: AnySchema,
    rules: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean | ajv.ajv/dist/compile/rules.Rule} */ js.Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaHasRules")(schema.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def schemaHasRulesButRef(schema: AnySchema, RULES: ValidationRules): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaHasRulesButRef")(schema.asInstanceOf[js.Any], RULES.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def schemaRefOrVal(param0: SchemaObjCxt, schema: Any, keyword: String): Code | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaRefOrVal")(param0.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], keyword.asInstanceOf[js.Any])).asInstanceOf[Code | Double | Boolean]
  @scala.annotation.targetName("schemaRefOrVal_false")
  inline def schemaRefOrVal(param0: SchemaObjCxt, schema: Any, keyword: String, $data: false): Code | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaRefOrVal")(param0.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], keyword.asInstanceOf[js.Any], $data.asInstanceOf[js.Any])).asInstanceOf[Code | Double | Boolean]
  inline def schemaRefOrVal(param0: SchemaObjCxt, schema: Any, keyword: String, $data: String): Code | Double | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaRefOrVal")(param0.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], keyword.asInstanceOf[js.Any], $data.asInstanceOf[js.Any])).asInstanceOf[Code | Double | Boolean]
  
  @scala.annotation.targetName("setEvaluated_true")
  inline def setEvaluated(
    gen: CodeGen,
    props: Name,
    ps: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in string ]:? true} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEvaluated")(gen.asInstanceOf[js.Any], props.asInstanceOf[js.Any], ps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toHash[T /* <: String */](arr: js.Array[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]:? true} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toHash")(arr.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]:? true} */ js.Any]
  
  inline def unescapeFragment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeFragment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeJsonPointer(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeJsonPointer")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useFunc(gen: CodeGen, f: typings.ajv.anon.Code): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("useFunc")(gen.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  type MergeEvaluatedFunc[T /* <: SomeEvaluated */] = js.Function4[
    /* gen */ CodeGen, 
    /* from */ Name | T, 
    /* to */ js.UndefOr[Name | (Exclude[T, true])], 
    /* toName */ js.UndefOr[Instantiable1[/* s */ String, Name]], 
    Name | T
  ]
  
  trait MergeEvaluated_ extends StObject {
    
    def items(gen: CodeGen, from: Name): Name | EvaluatedItems
    def items(gen: CodeGen, from: Name, to: Unit, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedItems
    def items(gen: CodeGen, from: Name, to: Name): Name | EvaluatedItems
    def items(gen: CodeGen, from: Name, to: Name, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedItems
    @JSName("items")
    @scala.annotation.targetName("items_true")
    def items(gen: CodeGen, from: Name, to: Exclude[EvaluatedItems, true]): Name | EvaluatedItems
    @JSName("items")
    @scala.annotation.targetName("items_true")
    def items(
      gen: CodeGen,
      from: Name,
      to: Exclude[EvaluatedItems, true],
      toName: Instantiable1[/* s */ String, Name]
    ): Name | EvaluatedItems
    def items(gen: CodeGen, from: EvaluatedItems): Name | EvaluatedItems
    def items(gen: CodeGen, from: EvaluatedItems, to: Unit, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedItems
    def items(gen: CodeGen, from: EvaluatedItems, to: Name): Name | EvaluatedItems
    def items(gen: CodeGen, from: EvaluatedItems, to: Name, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedItems
    @JSName("items")
    @scala.annotation.targetName("items_true")
    def items(gen: CodeGen, from: EvaluatedItems, to: Exclude[EvaluatedItems, true]): Name | EvaluatedItems
    @JSName("items")
    @scala.annotation.targetName("items_true")
    def items(
      gen: CodeGen,
      from: EvaluatedItems,
      to: Exclude[EvaluatedItems, true],
      toName: Instantiable1[/* s */ String, Name]
    ): Name | EvaluatedItems
    @JSName("items")
    var items_Original: MergeEvaluatedFunc[EvaluatedItems]
    
    def props(gen: CodeGen, from: Name): Name | EvaluatedProperties
    def props(gen: CodeGen, from: Name, to: Unit, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedProperties
    def props(gen: CodeGen, from: Name, to: Name): Name | EvaluatedProperties
    def props(gen: CodeGen, from: Name, to: Name, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedProperties
    @JSName("props")
    @scala.annotation.targetName("props_true")
    def props(gen: CodeGen, from: Name, to: Exclude[EvaluatedProperties, true]): Name | EvaluatedProperties
    @JSName("props")
    @scala.annotation.targetName("props_true")
    def props(
      gen: CodeGen,
      from: Name,
      to: Exclude[EvaluatedProperties, true],
      toName: Instantiable1[/* s */ String, Name]
    ): Name | EvaluatedProperties
    def props(gen: CodeGen, from: EvaluatedProperties): Name | EvaluatedProperties
    def props(gen: CodeGen, from: EvaluatedProperties, to: Unit, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedProperties
    def props(gen: CodeGen, from: EvaluatedProperties, to: Name): Name | EvaluatedProperties
    def props(gen: CodeGen, from: EvaluatedProperties, to: Name, toName: Instantiable1[/* s */ String, Name]): Name | EvaluatedProperties
    @JSName("props")
    @scala.annotation.targetName("props_true")
    def props(gen: CodeGen, from: EvaluatedProperties, to: Exclude[EvaluatedProperties, true]): Name | EvaluatedProperties
    @JSName("props")
    @scala.annotation.targetName("props_true")
    def props(
      gen: CodeGen,
      from: EvaluatedProperties,
      to: Exclude[EvaluatedProperties, true],
      toName: Instantiable1[/* s */ String, Name]
    ): Name | EvaluatedProperties
    @JSName("props")
    var props_Original: MergeEvaluatedFunc[EvaluatedProperties]
  }
  object MergeEvaluated_ {
    
    inline def apply(
      items: (/* gen */ CodeGen, /* from */ Name | EvaluatedItems, /* to */ js.UndefOr[Name | (Exclude[EvaluatedItems, true])], /* toName */ js.UndefOr[Instantiable1[/* s */ String, Name]]) => Name | EvaluatedItems,
      props: (/* gen */ CodeGen, /* from */ Name | EvaluatedProperties, /* to */ js.UndefOr[Name | (Exclude[EvaluatedProperties, true])], /* toName */ js.UndefOr[Instantiable1[/* s */ String, Name]]) => Name | EvaluatedProperties
    ): MergeEvaluated_ = {
      val __obj = js.Dynamic.literal(items = js.Any.fromFunction4(items), props = js.Any.fromFunction4(props))
      __obj.asInstanceOf[MergeEvaluated_]
    }
    
    extension [Self <: MergeEvaluated_](x: Self) {
      
      inline def setItems(
        value: (/* gen */ CodeGen, /* from */ Name | EvaluatedItems, /* to */ js.UndefOr[Name | (Exclude[EvaluatedItems, true])], /* toName */ js.UndefOr[Instantiable1[/* s */ String, Name]]) => Name | EvaluatedItems
      ): Self = StObject.set(x, "items", js.Any.fromFunction4(value))
      
      inline def setProps(
        value: (/* gen */ CodeGen, /* from */ Name | EvaluatedProperties, /* to */ js.UndefOr[Name | (Exclude[EvaluatedProperties, true])], /* toName */ js.UndefOr[Instantiable1[/* s */ String, Name]]) => Name | EvaluatedProperties
      ): Self = StObject.set(x, "props", js.Any.fromFunction4(value))
    }
  }
  
  type SomeEvaluated = EvaluatedProperties | EvaluatedItems
}
