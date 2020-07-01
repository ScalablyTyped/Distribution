package typings.antd.formContextMod

import typings.rcFieldForm.formContextMod.FormChangeInfo
import typings.rcFieldForm.formContextMod.FormFinishInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-field-form.rc-field-form/es/FormContext.FormProviderProps, 'validateMessages'> */
trait FormProviderProps extends js.Object {
  var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
  var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
}

object FormProviderProps {
  @scala.inline
  def apply(
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Unit = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Unit = null
  ): FormProviderProps = {
    val __obj = js.Dynamic.literal()
    if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2(onFormChange))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2(onFormFinish))
    __obj.asInstanceOf[FormProviderProps]
  }
}

