package typings
package antdLib.esFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormCreateOption[T] extends js.Object {
  var mapPropsToFields: js.UndefOr[js.Function1[/* props */ T, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onFieldsChange: js.UndefOr[
    js.Function3[/* props */ T, /* fields */ js.Object, /* allFields */ js.Any, scala.Unit]
  ] = js.undefined
  var onValuesChange: js.UndefOr[
    js.Function3[/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any, scala.Unit]
  ] = js.undefined
  var validateMessages: js.UndefOr[FormCreateOptionMessages] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object FormCreateOption {
  @scala.inline
  def apply[T](
    mapPropsToFields: /* props */ T => scala.Unit = null,
    name: java.lang.String = null,
    onFieldsChange: (/* props */ T, /* fields */ js.Object, /* allFields */ js.Any) => scala.Unit = null,
    onValuesChange: (/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any) => scala.Unit = null,
    validateMessages: FormCreateOptionMessages = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): FormCreateOption[T] = {
    val __obj = js.Dynamic.literal()
    if (mapPropsToFields != null) __obj.updateDynamic("mapPropsToFields")(js.Any.fromFunction1(mapPropsToFields))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onFieldsChange != null) __obj.updateDynamic("onFieldsChange")(js.Any.fromFunction3(onFieldsChange))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction3(onValuesChange))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[FormCreateOption[T]]
  }
}

