package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleCheckerMod {
  
  @JSImport("antd/lib/_util/styleChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/_util/styleChecker", "isFlexSupported")
  @js.native
  val isFlexSupported: Boolean = js.native
  
  @scala.inline
  def isStyleSupport(styleName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isStyleSupport(styleName: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
