package typings.angularFormly.AngularFormly

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
@js.native
trait IWatcher extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
   //Defaults to false
  var expression: js.UndefOr[
    String | (js.Function2[/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope, Boolean])
  ] = js.native
  var `type`: js.UndefOr[String] = js.native
  def listener(
    field: IFieldRuntimeObject,
    newValue: js.Any,
    oldValue: js.Any,
    scope: ITemplateScope,
    stopWatching: js.Function
  ): Unit = js.native
}

object IWatcher {
  @scala.inline
  def apply(listener: (IFieldRuntimeObject, js.Any, js.Any, ITemplateScope, js.Function) => Unit): IWatcher = {
    val __obj = js.Dynamic.literal(listener = js.Any.fromFunction5(listener))
    __obj.asInstanceOf[IWatcher]
  }
  @scala.inline
  implicit class IWatcherOps[Self <: IWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListener(value: (IFieldRuntimeObject, js.Any, js.Any, ITemplateScope, js.Function) => Unit): Self = this.set("listener", js.Any.fromFunction5(value))
    @scala.inline
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setExpressionFunction2(value: (/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope) => Boolean): Self = this.set("expression", js.Any.fromFunction2(value))
    @scala.inline
    def setExpression(
      value: String | (js.Function2[/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope, Boolean])
    ): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

