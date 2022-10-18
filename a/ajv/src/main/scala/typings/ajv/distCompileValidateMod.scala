package typings.ajv

import org.scalablytyped.runtime.Instantiable1
import typings.ajv.ajvBooleans.`true`
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.CodeGen
import typings.ajv.distCompileCodegenMod.Name
import typings.ajv.distCompileErrorsMod.ErrorPaths
import typings.ajv.distCompileMod.SchemaCxt
import typings.ajv.distCompileMod.SchemaObjCxt
import typings.ajv.distCompileRulesMod.JSONType
import typings.ajv.distCompileValidateSubschemaMod.SubschemaArgs
import typings.ajv.distTypesMod.AddedKeywordDefinition
import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.KeywordCxtParams
import typings.ajv.distTypesMod.KeywordErrorCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileValidateMod {
  
  @JSImport("ajv/dist/compile/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/compile/validate", "KeywordCxt")
  @js.native
  open class KeywordCxt protected ()
    extends StObject
       with KeywordErrorCxt {
    def this(it: SchemaObjCxt, `def`: AddedKeywordDefinition, keyword: String) = this()
    
    @JSName("$dataError")
    def $dataError(): Unit = js.native
    
    /* private */ var _error: Any = js.native
    
    val allErrors: js.UndefOr[Boolean] = js.native
    
    @JSName("block$data")
    def block$data(valid: Name, codeBlock: js.Function0[Unit]): Unit = js.native
    @JSName("block$data")
    def block$data(valid: Name, codeBlock: js.Function0[Unit], $dataValid: Code): Unit = js.native
    
    @JSName("check$data")
    def check$data(): Unit = js.native
    @JSName("check$data")
    def check$data(valid: Unit, $dataValid: Code): Unit = js.native
    @JSName("check$data")
    def check$data(valid: Name): Unit = js.native
    @JSName("check$data")
    def check$data(valid: Name, $dataValid: Code): Unit = js.native
    
    /* CompleteClass */
    var data: Name = js.native
    
    val `def`: AddedKeywordDefinition = js.native
    
    def error(): Unit = js.native
    def error(append: Boolean): Unit = js.native
    def error(append: Boolean, errorParams: Unit, errorPaths: ErrorPaths): Unit = js.native
    def error(append: Boolean, errorParams: KeywordCxtParams): Unit = js.native
    def error(append: Boolean, errorParams: KeywordCxtParams, errorPaths: ErrorPaths): Unit = js.native
    def error(append: Unit, errorParams: Unit, errorPaths: ErrorPaths): Unit = js.native
    def error(append: Unit, errorParams: KeywordCxtParams): Unit = js.native
    def error(append: Unit, errorParams: KeywordCxtParams, errorPaths: ErrorPaths): Unit = js.native
    
    def fail(): Unit = js.native
    def fail(condition: Code): Unit = js.native
    
    @JSName("fail$data")
    def fail$data(condition: Code): Unit = js.native
    
    def failResult(condition: Code): Unit = js.native
    def failResult(condition: Code, successAction: js.Function0[Unit]): Unit = js.native
    def failResult(condition: Code, successAction: js.Function0[Unit], failAction: js.Function0[Unit]): Unit = js.native
    def failResult(condition: Code, successAction: Unit, failAction: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    var gen: CodeGen = js.native
    
    @JSName("invalid$data")
    def invalid$data(): Code = js.native
    
    /* CompleteClass */
    var it: SchemaCxt = js.native
    @JSName("it")
    val it_KeywordCxt: SchemaObjCxt = js.native
    
    /* CompleteClass */
    var keyword: String = js.native
    
    def mergeEvaluated(schemaCxt: SchemaCxt): Unit = js.native
    def mergeEvaluated(schemaCxt: SchemaCxt, toName: Instantiable1[/* s */ String, Name]): Unit = js.native
    
    def mergeValidEvaluated(schemaCxt: SchemaCxt, valid: Name): Boolean | Unit = js.native
    
    def ok(cond: Boolean): Unit = js.native
    def ok(cond: Code): Unit = js.native
    
    /* CompleteClass */
    var params: KeywordCxtParams = js.native
    
    @JSName("parentSchema")
    val parentSchema_KeywordCxt: AnySchemaObject = js.native
    
    def pass(condition: Code): Unit = js.native
    def pass(condition: Code, failAction: js.Function0[Unit]): Unit = js.native
    
    def reset(): Unit = js.native
    
    def result(condition: Code): Unit = js.native
    def result(condition: Code, successAction: js.Function0[Unit]): Unit = js.native
    def result(condition: Code, successAction: js.Function0[Unit], failAction: js.Function0[Unit]): Unit = js.native
    def result(condition: Code, successAction: Unit, failAction: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    var schema: Any = js.native
    
    /* CompleteClass */
    var schemaCode: Code | Double | Boolean = js.native
    
    @JSName("schemaType")
    val schemaType_KeywordCxt: js.Array[JSONType] = js.native
    
    /* CompleteClass */
    var schemaValue: Code | Double | Boolean = js.native
    
    def setParams(obj: KeywordCxtParams): Unit = js.native
    @JSName("setParams")
    def setParams_true(obj: KeywordCxtParams, assign: `true`): Unit = js.native
    
    def subschema(appl: SubschemaArgs, valid: Name): SchemaCxt = js.native
  }
  
  inline def getData($data: String, hasDataLevelDataNamesDataPathArr: SchemaCxt): Code | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")($data.asInstanceOf[js.Any], hasDataLevelDataNamesDataPathArr.asInstanceOf[js.Any])).asInstanceOf[Code | Double]
  
  inline def validateFunctionCode(it: SchemaCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFunctionCode")(it.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
