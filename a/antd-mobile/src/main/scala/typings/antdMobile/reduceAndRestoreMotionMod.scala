package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceAndRestoreMotionMod {
  
  @JSImport("antd-mobile/es/utils/reduce-and-restore-motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMotionReduced(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMotionReduced")().asInstanceOf[Boolean]
  
  inline def reduceMotion(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceMotion")().asInstanceOf[Unit]
  
  inline def restoreMotion(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreMotion")().asInstanceOf[Unit]
  
  inline def useMotionReduced(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMotionReduced")().asInstanceOf[Boolean]
}
