package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modalPropsTypeMod {
  type Callback = js.Function2[
    /* valueOrLogin */ java.lang.String, 
    /* password */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type CallbackOnBackHandler = js.Function0[scala.Boolean]
  type CallbackOrActions[T] = typings.antDesignReactNative.modalPropsTypeMod.Callback | js.Array[typings.antDesignReactNative.modalPropsTypeMod.Action[T]]
}
