package typings.antvCoord

import typings.antvCoord.baseMod.CoordinateCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/coord/lib/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  
  def getCoordinate(`type`: String): CoordinateCtor = js.native
  
  def registerCoordinate(`type`: String, ctor: CoordinateCtor): Unit = js.native
}
