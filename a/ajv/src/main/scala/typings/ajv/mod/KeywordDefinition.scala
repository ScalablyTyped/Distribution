package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordDefinition extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.native
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  var errors: js.UndefOr[Boolean | String] = js.native
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      String
    ]
  ] = js.native
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | Boolean
    ]
  ] = js.native
  var metaSchema: js.UndefOr[js.Object] = js.native
  var modifying: js.UndefOr[Boolean] = js.native
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[Boolean] = js.native
  var statements: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var valid: js.UndefOr[Boolean] = js.native
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.native
}

