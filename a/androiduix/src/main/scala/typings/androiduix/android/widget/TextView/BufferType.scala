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
  
  /* 2 */ val EDITABLE: typings.androiduix.android.widget.TextView.BufferType.EDITABLE with Double = js.native
  /* 0 */ val NORMAL: typings.androiduix.android.widget.TextView.BufferType.NORMAL with Double = js.native
  /* 1 */ val SPANNABLE: typings.androiduix.android.widget.TextView.BufferType.SPANNABLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferType with Double] = js.native
}

