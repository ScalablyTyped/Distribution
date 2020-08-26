package typings.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Style extends js.Object

@JSGlobal("android.graphics.Paint.Style")
@js.native
object Style extends js.Object {
  @js.native
  sealed trait FILL extends Style
  
  @js.native
  sealed trait FILL_AND_STROKE extends Style
  
  @js.native
  sealed trait STROKE extends Style
  
}

