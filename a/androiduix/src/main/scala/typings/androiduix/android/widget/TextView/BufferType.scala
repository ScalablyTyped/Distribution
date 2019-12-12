package typings.androiduix.android.widget.TextView

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.widget.TextView.BufferType.EDITABLE
import typings.androiduix.android.widget.TextView.BufferType.NORMAL
import typings.androiduix.android.widget.TextView.BufferType.SPANNABLE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferType with Double] = js.native
  /* 2 */ @js.native
  object EDITABLE extends TopLevel[EDITABLE with Double]
  
  /* 0 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 1 */ @js.native
  object SPANNABLE extends TopLevel[SPANNABLE with Double]
  
}

