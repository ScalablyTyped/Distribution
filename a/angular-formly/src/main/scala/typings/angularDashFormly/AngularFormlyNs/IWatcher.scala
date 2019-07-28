package typings.angularDashFormly.AngularFormlyNs

import typings.angularDashFormly.Fn_Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object which has at least two properties called expression and listener. The watch.expression
	 * is added to the formly-form directive's scope (to allow it to run even when hide is true). You
	 * can specify a type ($watchCollection or $watchGroup) via the watcher.type property (defaults to
	 * $watch) and whether you want it to be a deep watch via the watcher.deep property (defaults to false).
	 *
	 * see http://docs.angular-formly.com/docs/field-configuration-object#watcher-objectarray-of-watches
	 */
trait IWatcher extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
   //Defaults to false
  var expression: js.UndefOr[String | Fn_Field] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  def listener(
    field: IFieldRuntimeObject,
    newValue: js.Any,
    oldValue: js.Any,
    scope: ITemplateScope,
    stopWatching: js.Function
  ): Unit
}

object IWatcher {
  @scala.inline
  def apply(
    listener: (IFieldRuntimeObject, js.Any, js.Any, ITemplateScope, js.Function) => Unit,
    deep: js.UndefOr[Boolean] = js.undefined,
    expression: String | Fn_Field = null,
    `type`: String = null
  ): IWatcher = {
    val __obj = js.Dynamic.literal(listener = js.Any.fromFunction5(listener))
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IWatcher]
  }
}

