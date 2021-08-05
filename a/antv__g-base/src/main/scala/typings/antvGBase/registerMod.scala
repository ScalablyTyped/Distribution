package typings.antvGBase

import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.SimpleBBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("@antv/g-base/lib/bbox/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMethod(`type`: String): BoxMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("getMethod")(`type`.asInstanceOf[js.Any]).asInstanceOf[BoxMethod]
  
  inline def register(`type`: String, method: BoxMethod): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(`type`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type BoxMethod = js.Function1[/* shape */ IShape, SimpleBBox]
}
