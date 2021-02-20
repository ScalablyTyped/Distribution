package typings.ajv.mod

import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateFunction extends StObject {
  
  def apply(
    data: js.Any,
    dataPath: js.UndefOr[String],
    parentData: js.UndefOr[js.Object | js.Array[_]],
    parentDataProperty: js.UndefOr[String | Double],
    rootData: js.UndefOr[js.Object | js.Array[_]]
  ): Boolean | js.Thenable[_] = js.native
  
  @JSName("$async")
  var $async: js.UndefOr[`true`] = js.native
  
  var errors: js.UndefOr[Null | js.Array[ErrorObject]] = js.native
  
  var refVal: js.UndefOr[js.Array[_]] = js.native
  
  var refs: js.UndefOr[js.Object] = js.native
  
  var root: js.UndefOr[ValidateFunction | js.Object] = js.native
  
  var schema: js.UndefOr[js.Object | Boolean] = js.native
  
  var source: js.UndefOr[js.Object] = js.native
}
