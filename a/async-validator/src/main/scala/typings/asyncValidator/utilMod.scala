package typings.asyncValidator

import typings.asyncValidator.interfaceMod.InternalRuleItem
import typings.asyncValidator.interfaceMod.RuleValuePackage
import typings.asyncValidator.interfaceMod.SyncErrorType
import typings.asyncValidator.interfaceMod.ValidateError
import typings.asyncValidator.interfaceMod.ValidateOption
import typings.asyncValidator.interfaceMod.Value
import typings.asyncValidator.interfaceMod.Values
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("async-validator/dist-types/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("async-validator/dist-types/util", "AsyncValidationError")
  @js.native
  open class AsyncValidationError protected ()
    extends StObject
       with Error {
    def this(errors: js.Array[ValidateError], fields: Record[String, js.Array[ValidateError]]) = this()
    
    var errors: js.Array[ValidateError] = js.native
    
    var fields: Record[String, js.Array[ValidateError]] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def asyncMap(
    objArr: Record[String, js.Array[RuleValuePackage]],
    option: ValidateOption,
    func: ValidateFunc,
    callback: js.Function1[/* errors */ js.Array[ValidateError], Unit],
    source: Values
  ): js.Promise[Values] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncMap")(objArr.asInstanceOf[js.Any], option.asInstanceOf[js.Any], func.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Values]]
  
  inline def complementError(rule: InternalRuleItem, source: Values): js.Function1[/* oe */ ValidateError | js.Function0[String] | String, ValidateError] = (^.asInstanceOf[js.Dynamic].applyDynamic("complementError")(rule.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* oe */ ValidateError | js.Function0[String] | String, ValidateError]]
  
  inline def convertFieldsError(errors: js.Array[ValidateError]): Record[String, js.Array[ValidateError]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFieldsError")(errors.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Array[ValidateError]]]
  
  inline def deepMerge[T /* <: js.Object */](target: T, source: Partial[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMerge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def format(template: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def format(template: js.Function1[/* repeated */ Any, String], args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def isEmptyObject(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyValue(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEmptyValue(value: Value, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyValue")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("async-validator/dist-types/util", "warning")
  @js.native
  def warning: js.Function2[/* type */ String, /* errors */ js.Array[SyncErrorType], Unit] = js.native
  inline def warning_=(x: js.Function2[/* type */ String, /* errors */ js.Array[SyncErrorType], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  
  type ValidateFunc = js.Function2[
    /* data */ RuleValuePackage, 
    /* doIt */ js.Function1[/* errors */ js.Array[ValidateError], Unit], 
    Unit
  ]
}
