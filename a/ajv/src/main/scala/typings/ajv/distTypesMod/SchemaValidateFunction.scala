package typings.ajv.distTypesMod

import typings.ajv.anon.PartialErrorObjectstringR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaValidateFunction extends StObject {
  
  def apply(schema: Any, data: Any): Boolean | js.Promise[Any] = js.native
  def apply(schema: Any, data: Any, parentSchema: Unit, dataCxt: DataValidationCxt[String | Double]): Boolean | js.Promise[Any] = js.native
  def apply(schema: Any, data: Any, parentSchema: AnySchemaObject): Boolean | js.Promise[Any] = js.native
  def apply(schema: Any, data: Any, parentSchema: AnySchemaObject, dataCxt: DataValidationCxt[String | Double]): Boolean | js.Promise[Any] = js.native
  
  var errors: js.UndefOr[js.Array[PartialErrorObjectstringR]] = js.native
}
