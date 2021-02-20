package typings.antvGBase

import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.SimpleBBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("@antv/g-base/lib/bbox/register", "getMethod")
  @js.native
  def getMethod(`type`: String): BoxMethod = js.native
  
  @JSImport("@antv/g-base/lib/bbox/register", "register")
  @js.native
  def register(`type`: String, method: BoxMethod): Unit = js.native
  
  type BoxMethod = js.Function1[/* shape */ IShape, SimpleBBox]
}
