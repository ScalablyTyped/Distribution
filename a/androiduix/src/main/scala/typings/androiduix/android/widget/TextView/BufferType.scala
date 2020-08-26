package typings.androiduix.android.widget.TextView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferType extends js.Object

@JSGlobal("android.widget.TextView.BufferType")
@js.native
object BufferType extends js.Object {
  @js.native
  sealed trait EDITABLE extends BufferType
  
  @js.native
  sealed trait NORMAL extends BufferType
  
  @js.native
  sealed trait SPANNABLE extends BufferType
  
}

