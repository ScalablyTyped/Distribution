package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordDefinition extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.undefined
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  var errors: js.UndefOr[Boolean | String] = js.undefined
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      String
    ]
  ] = js.undefined
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | Boolean
    ]
  ] = js.undefined
  var metaSchema: js.UndefOr[js.Object] = js.undefined
  var modifying: js.UndefOr[Boolean] = js.undefined
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[Boolean] = js.undefined
  var statements: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.undefined
}

object KeywordDefinition {
  @scala.inline
  def apply(
    $data: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    compile: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => ValidateFunction = null,
    dependencies: js.Array[String] = null,
    errors: Boolean | String = null,
    `inline`: (/* it */ CompilationContext, /* keyword */ String, /* schema */ js.Any, /* parentSchema */ js.Object) => String = null,
    `macro`: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => js.Object | Boolean = null,
    metaSchema: js.Object = null,
    modifying: js.UndefOr[Boolean] = js.undefined,
    schema: js.UndefOr[Boolean] = js.undefined,
    statements: js.UndefOr[Boolean] = js.undefined,
    `type`: String | js.Array[String] = null,
    valid: js.UndefOr[Boolean] = js.undefined,
    validate: SchemaValidateFunction | ValidateFunction = null
  ): KeywordDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($data)) __obj.updateDynamic("$data")($data.get.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (compile != null) __obj.updateDynamic("compile")(js.Any.fromFunction3(compile))
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(js.Any.fromFunction4(`inline`))
    if (`macro` != null) __obj.updateDynamic("macro")(js.Any.fromFunction3(`macro`))
    if (metaSchema != null) __obj.updateDynamic("metaSchema")(metaSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(modifying)) __obj.updateDynamic("modifying")(modifying.get.asInstanceOf[js.Any])
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statements)) __obj.updateDynamic("statements")(statements.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordDefinition]
  }
}

