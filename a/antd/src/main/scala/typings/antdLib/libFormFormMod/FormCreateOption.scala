package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormCreateOption[T] extends js.Object {
  var mapPropsToFields: js.UndefOr[js.Function1[/* props */ T, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onFieldsChange: js.UndefOr[
    js.Function4[
      /* props */ T, 
      /* fields */ js.Object, 
      /* allFields */ js.Any, 
      /* add */ java.lang.String, 
      scala.Unit
    ]
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
    mapPropsToFields: js.Function1[/* props */ T, scala.Unit] = null,
    name: java.lang.String = null,
    onFieldsChange: js.Function4[
      /* props */ T, 
      /* fields */ js.Object, 
      /* allFields */ js.Any, 
      /* add */ java.lang.String, 
      scala.Unit
    ] = null,
    onValuesChange: js.Function3[/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any, scala.Unit] = null,
    validateMessages: FormCreateOptionMessages = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): FormCreateOption[T] = {
    val __obj = js.Dynamic.literal()
    if (mapPropsToFields != null) __obj.updateDynamic("mapPropsToFields")(mapPropsToFields)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onFieldsChange != null) __obj.updateDynamic("onFieldsChange")(onFieldsChange)
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(onValuesChange)
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[FormCreateOption[T]]
  }
}

