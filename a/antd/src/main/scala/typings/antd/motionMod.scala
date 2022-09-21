package typings.antd

import typings.antd.antdStrings.`slide-down`
import typings.antd.antdStrings.`slide-up`
import typings.rcMotion.cssmotionMod.CSSMotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object motionMod {
  
  @JSImport("antd/lib/_util/motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/_util/motion", JSImport.Default)
  @js.native
  val default: CSSMotionProps = js.native
  
  inline def getTransitionDirection(): `slide-down` | `slide-up` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionDirection")().asInstanceOf[`slide-down` | `slide-up`]
  inline def getTransitionDirection(placement: SelectCommonPlacement): `slide-down` | `slide-up` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionDirection")(placement.asInstanceOf[js.Any]).asInstanceOf[`slide-down` | `slide-up`]
  
  inline def getTransitionName(rootPrefixCls: String, motion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionName")(rootPrefixCls.asInstanceOf[js.Any], motion.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTransitionName(rootPrefixCls: String, motion: String, transitionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionName")(rootPrefixCls.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.bottomLeft
    - typings.antd.antdStrings.bottomRight
    - typings.antd.antdStrings.topLeft
    - typings.antd.antdStrings.topRight
  */
  trait SelectCommonPlacement extends StObject
}
