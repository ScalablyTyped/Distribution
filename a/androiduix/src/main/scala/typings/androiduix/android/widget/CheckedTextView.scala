package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedTextView
  extends TextView
     with Checkable {
  
  def getCheckMarkDrawable(): Drawable = js.native
  
  var mBasePadding: js.Any = js.native
  
  var mCheckMarkDrawable: js.Any = js.native
  
  var mCheckMarkResource: js.Any = js.native
  
  var mCheckMarkWidth: js.Any = js.native
  
  var mChecked: js.Any = js.native
  
  var mNeedRequestlayout: js.Any = js.native
  
  /* private */ def setBasePadding(isLayoutRtl: js.Any): js.Any = js.native
  
  def setCheckMarkDrawable(d: Drawable): Unit = js.native
  
  /* private */ def updatePadding(): js.Any = js.native
}
