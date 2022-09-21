package typings.antd

import typings.antd.antdBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleCheckerMod {
  
  @JSImport("antd/lib/_util/styleChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canUseDocElement(): `false` | HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDocElement")().asInstanceOf[`false` | HTMLElement]
  
  inline def detectFlexGapSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFlexGapSupported")().asInstanceOf[Boolean]
  
  inline def isStyleSupport(styleName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isStyleSupport(styleName: String, styleValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any], styleValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isStyleSupport(styleName: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
