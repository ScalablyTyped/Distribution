package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor
  extends StObject
     with EventEmitter {
  
  def attach(doc: Document): Unit = js.native
  
  def detach(): Unit = js.native
  
  def getDocument(): Document = js.native
  
  def getPosition(): Point = js.native
  
  def setPosition(row: Double, column: Double): Unit = js.native
  def setPosition(row: Double, column: Double, noClip: Boolean): Unit = js.native
}
