package typings.asyncValidator.mod

import typings.asyncValidator.AnonType
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleItem extends js.Object {
  var asyncValidator: js.UndefOr[
    js.Function5[
      /* rule */ Rules, 
      /* value */ js.Any, 
      /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], 
      /* source */ ValidateSource, 
      /* options */ ValidateOption, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  var defaultField: js.UndefOr[AnonType] = js.undefined
   // Length of type 'string' and 'array'
  var enum: js.UndefOr[js.Array[js.UndefOr[String | Double | Boolean | Null]]] = js.undefined
  var fields: js.UndefOr[Rules] = js.undefined
   // Range of type 'string' and 'array'
  var len: js.UndefOr[Double] = js.undefined
   // Range of type 'string' and 'array'
  var max: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
   // ignore when without required
  var options: js.UndefOr[ValidateOption] = js.undefined
  var pattern: js.UndefOr[RegExp | String] = js.undefined
   // default type is 'string'
  var required: js.UndefOr[Boolean] = js.undefined
   // 'object' or 'array' containing validation rules
  var transform: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var `type`: js.UndefOr[RuleType] = js.undefined
  var validator: js.UndefOr[
    js.Function5[
      /* rule */ Rules, 
      /* value */ js.Any, 
      /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], 
      /* source */ ValidateSource, 
      /* options */ ValidateOption, 
      Unit
    ]
  ] = js.undefined
   // possible values of type 'enum'
  var whitespace: js.UndefOr[Boolean] = js.undefined
}

object RuleItem {
  @scala.inline
  def apply(
    asyncValidator: (/* rule */ Rules, /* value */ js.Any, /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], /* source */ ValidateSource, /* options */ ValidateOption) => Unit | js.Promise[Unit] = null,
    defaultField: AnonType = null,
    enum: js.Array[js.UndefOr[String | Double | Boolean | Null]] = null,
    fields: Rules = null,
    len: Int | Double = null,
    max: Int | Double = null,
    message: String = null,
    min: Int | Double = null,
    options: ValidateOption = null,
    pattern: RegExp | String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    transform: /* value */ js.Any => _ = null,
    `type`: RuleType = null,
    validator: (/* rule */ Rules, /* value */ js.Any, /* callback */ js.Function1[/* error */ String | js.Array[String] | Unit, Unit], /* source */ ValidateSource, /* options */ ValidateOption) => Unit = null,
    whitespace: js.UndefOr[Boolean] = js.undefined
  ): RuleItem = {
    val __obj = js.Dynamic.literal()
    if (asyncValidator != null) __obj.updateDynamic("asyncValidator")(js.Any.fromFunction5(asyncValidator))
    if (defaultField != null) __obj.updateDynamic("defaultField")(defaultField.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction5(validator))
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleItem]
  }
}

