package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Testability API.
  * `declare` keyword causes tsickle to generate externs, so these methods are
  * not renamed by Closure Compiler.
  * @publicApi
  */
@js.native
trait PublicTestability extends StObject {
  
  def findProviders(`using`: js.Any, provider: String, exactMatch: Boolean): js.Array[js.Any] = js.native
  
  def isStable(): Boolean = js.native
  
  def whenStable(callback: js.Function): Unit = js.native
  def whenStable(callback: js.Function, timeout: Double): Unit = js.native
  def whenStable(callback: js.Function, timeout: Double, updateCallback: js.Function): Unit = js.native
  def whenStable(callback: js.Function, timeout: Unit, updateCallback: js.Function): Unit = js.native
}
