package typings
package ajvLib.ajvMod

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
  var dependencies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var statements: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.undefined
}

object KeywordDefinition {
  @scala.inline
  def apply(
    $data: js.UndefOr[scala.Boolean] = js.undefined,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    compile: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => ValidateFunction = null,
    dependencies: js.Array[java.lang.String] = null,
    errors: scala.Boolean | java.lang.String = null,
    `inline`: (/* it */ CompilationContext, /* keyword */ java.lang.String, /* schema */ js.Any, /* parentSchema */ js.Object) => java.lang.String = null,
    `macro`: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => js.Object | scala.Boolean = null,
    metaSchema: js.Object = null,
    modifying: js.UndefOr[scala.Boolean] = js.undefined,
    schema: js.UndefOr[scala.Boolean] = js.undefined,
    statements: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined,
    validate: SchemaValidateFunction | ValidateFunction = null
  ): KeywordDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($data)) __obj.updateDynamic("$data")($data)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (compile != null) __obj.updateDynamic("compile")(js.Any.fromFunction3(compile))
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(js.Any.fromFunction4(`inline`))
    if (`macro` != null) __obj.updateDynamic("macro")(js.Any.fromFunction3(`macro`))
    if (metaSchema != null) __obj.updateDynamic("metaSchema")(metaSchema)
    if (!js.isUndefined(modifying)) __obj.updateDynamic("modifying")(modifying)
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(statements)) __obj.updateDynamic("statements")(statements)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordDefinition]
  }
}

