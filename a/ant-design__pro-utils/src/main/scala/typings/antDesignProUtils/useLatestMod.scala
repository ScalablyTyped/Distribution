package typings.antDesignProUtils

import typings.antDesignProUtils.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLatestMod {
  
  @JSImport("@ant-design/pro-utils/es/hooks/useLatest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLatest[T](value: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLatest")(value.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
}
