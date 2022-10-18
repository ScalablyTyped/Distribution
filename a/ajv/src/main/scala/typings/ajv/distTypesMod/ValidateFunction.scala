package typings.ajv.distTypesMod

import typings.ajv.distCompileMod.SchemaEnv
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateFunction[T]
  extends StObject
     with AnyValidateFunction[T] {
  
  def apply(data: Any): /* is T */ Boolean = js.native
  def apply(data: Any, dataCxt: DataValidationCxt[String | Double]): /* is T */ Boolean = js.native
  
  var errors: js.UndefOr[Null | (js.Array[ErrorObject[String, Record[String, Any], Any]])] = js.native
  
  var evaluated: js.UndefOr[Evaluated] = js.native
  
  var schema: AnySchema = js.native
  
  var schemaEnv: SchemaEnv = js.native
  
  var source: js.UndefOr[SourceCode] = js.native
}
