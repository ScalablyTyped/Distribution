package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilEventMod {
  
  @JSImport("@antv/g2/lib/util/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventName(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getEventName(`type`: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
