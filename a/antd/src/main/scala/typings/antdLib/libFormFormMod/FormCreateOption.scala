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

