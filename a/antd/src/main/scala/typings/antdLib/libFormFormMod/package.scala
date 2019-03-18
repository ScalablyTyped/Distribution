package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormFormMod {
  type ComponentDecorator = js.Function1[
    /* component */ (reactLib.reactMod.ReactNs.ComponentClass[FormComponentProps[js.Any], reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[FormComponentProps[js.Any]], 
    reactLib.reactMod.ReactNs.ComponentClass[
      RcBaseFormProps with (antdLib.libUnderscoreUtilTypeMod.Omit[FormComponentProps[_], antdLib.antdLibStrings.form]), 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ]
  type FormCreateOptionMessagesCallback = js.Function1[/* repeated */ js.Any, java.lang.String]
  type FormLayout = /* import warning: ImportType.apply Failed type conversion: ['horizontal', 'inline', 'vertical'][number] */ js.Any
  type ValidateCallback[V] = js.Function2[/* errors */ js.Any, /* values */ V, scala.Unit]
}
