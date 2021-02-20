package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.Drawable.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsetDrawable
  extends Drawable
     with Callback {
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MInsetDrawable(who: Drawable): js.Any = js.native
  
  def getDrawable(): Drawable = js.native
  
  var mInsetState: js.Any = js.native
  
  var mMutated: js.Any = js.native
  
  var mTmpRect: js.Any = js.native
}
