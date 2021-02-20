package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaValidateFunction extends StObject {
  
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.UndefOr[js.Object],
    dataPath: js.UndefOr[String],
    parentData: js.UndefOr[js.Object | js.Array[_]],
    parentDataProperty: js.UndefOr[String | Double],
    rootData: js.UndefOr[js.Object | js.Array[_]]
  ): Boolean | js.Thenable[_] = js.native
  
  var errors: js.UndefOr[js.Array[ErrorObject]] = js.native
}
