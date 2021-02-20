package typings.androiduix.android.view.animation

import typings.androiduix.java_.util.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationSet extends Animation {
  
  def addAnimation(a: Animation): Unit = js.native
  
  def getAnimations(): List[Animation] = js.native
  
  /* private */ def init(): js.Any = js.native
  
  var mAnimations: js.Any = js.native
  
  var mDirty: js.Any = js.native
  
  var mFlags: js.Any = js.native
  
  var mHasAlpha: js.Any = js.native
  
  var mLastEnd: js.Any = js.native
  
  var mStoredOffsets: js.Any = js.native
  
  var mTempTransformation: js.Any = js.native
  
  def restoreChildrenStartOffset(): Unit = js.native
  
  /* private */ def setFlag(mask: js.Any, value: js.Any): js.Any = js.native
}
