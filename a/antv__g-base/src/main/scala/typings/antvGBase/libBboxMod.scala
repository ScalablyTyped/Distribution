package typings.antvGBase

import typings.antvGBase.libBboxRegisterMod.BoxMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBboxMod {
  
  @JSImport("@antv/g-base/lib/bbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBBoxMethod(`type`: String): BoxMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxMethod")(`type`.asInstanceOf[js.Any]).asInstanceOf[BoxMethod]
  
  inline def registerBBox(`type`: String, method: BoxMethod): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBBox")(`type`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
