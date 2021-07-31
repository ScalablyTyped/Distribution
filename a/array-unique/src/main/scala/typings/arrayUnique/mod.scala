package typings.arrayUnique

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("array-unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def immutable[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("immutable")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
