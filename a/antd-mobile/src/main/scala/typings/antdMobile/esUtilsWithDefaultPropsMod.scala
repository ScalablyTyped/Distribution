package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsWithDefaultPropsMod {
  
  @JSImport("antd-mobile/es/utils/with-default-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeProps[A, B](a: A, b: B): B & A = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[B & A]
  inline def mergeProps[A, B, C](a: A, b: B, c: C): C & B & A = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[C & B & A]
}
