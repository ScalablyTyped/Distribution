package typings.ahooks

import typings.ahooks.anon.GetIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseDynamicListMod {
  
  @JSImport("ahooks/lib/useDynamicList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): GetIndex[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[GetIndex[T]]
  inline def default[T](initialList: js.Array[T]): GetIndex[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialList.asInstanceOf[js.Any]).asInstanceOf[GetIndex[T]]
}
