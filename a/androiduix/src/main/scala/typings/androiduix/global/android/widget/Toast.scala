package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.Toast")
@js.native
class Toast protected ()
  extends typings.androiduix.android.widget.Toast {
  def this(context: Context) = this()
}
object Toast {
  
  @JSGlobal("android.widget.Toast")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.Toast.LENGTH_LONG")
  @js.native
  def LENGTH_LONG: Double = js.native
  @scala.inline
  def LENGTH_LONG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LENGTH_LONG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Toast.LENGTH_SHORT")
  @js.native
  def LENGTH_SHORT: Double = js.native
  @scala.inline
  def LENGTH_SHORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LENGTH_SHORT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Toast.TAG")
  @js.native
  def TAG: String = js.native
  @scala.inline
  def TAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.Toast.TN")
  @js.native
  class TN ()
    extends typings.androiduix.android.widget.Toast.TN
  
  /* static member */
  @JSGlobal("android.widget.Toast.localLOGV")
  @js.native
  def localLOGV: Boolean = js.native
  @scala.inline
  def localLOGV_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localLOGV")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Toast.makeText")
  @js.native
  def makeText(context: Context, text: String, duration: Double): typings.androiduix.android.widget.Toast = js.native
}
