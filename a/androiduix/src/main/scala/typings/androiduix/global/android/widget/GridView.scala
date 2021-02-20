package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.GridView")
@js.native
class GridView protected ()
  extends typings.androiduix.android.widget.GridView {
  def this(context: Context, attrs: HTMLElement) = this()
  def this(context: Context, attrs: HTMLElement, defStyle: Map[String, String]) = this()
}
object GridView {
  
  @JSGlobal("android.widget.GridView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.GridView.AUTO_FIT")
  @js.native
  def AUTO_FIT: Double = js.native
  @scala.inline
  def AUTO_FIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_FIT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.GridView.NO_STRETCH")
  @js.native
  def NO_STRETCH: Double = js.native
  @scala.inline
  def NO_STRETCH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_STRETCH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.GridView.STRETCH_COLUMN_WIDTH")
  @js.native
  def STRETCH_COLUMN_WIDTH: Double = js.native
  @scala.inline
  def STRETCH_COLUMN_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH_COLUMN_WIDTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.GridView.STRETCH_SPACING")
  @js.native
  def STRETCH_SPACING: Double = js.native
  @scala.inline
  def STRETCH_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH_SPACING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.GridView.STRETCH_SPACING_UNIFORM")
  @js.native
  def STRETCH_SPACING_UNIFORM: Double = js.native
  @scala.inline
  def STRETCH_SPACING_UNIFORM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH_SPACING_UNIFORM")(x.asInstanceOf[js.Any])
}
