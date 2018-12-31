package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordDefinition extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[scala.Boolean] = js.undefined
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.undefined
  var errors: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ java.lang.String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      java.lang.String
    ]
  ] = js.undefined
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | scala.Boolean
    ]
  ] = js.undefined
  var metaSchema: js.UndefOr[js.Object] = js.undefined
  var modifying: js.UndefOr[scala.Boolean] = js.undefined
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.undefined
}

