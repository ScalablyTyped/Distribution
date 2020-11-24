package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object modalPropsTypeMod {
  
  type Callback = js.Function2[
    /* valueOrLogin */ java.lang.String, 
    /* password */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type CallbackOrActions[T] = typings.antdMobile.modalPropsTypeMod.Callback | js.Array[typings.antdMobile.modalPropsTypeMod.Action[T]]
}
