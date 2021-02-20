package typings.asenv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asenv", "getEnv")
  @js.native
  def getEnv(): String = js.native
  
  @JSImport("asenv", "isDevelopment")
  @js.native
  def isDevelopment(): Boolean = js.native
  
  @JSImport("asenv", "isProduction")
  @js.native
  def isProduction(): Boolean = js.native
  
  @JSImport("asenv", "isTest")
  @js.native
  def isTest(): Boolean = js.native
  
  @JSImport("asenv", "setEnv")
  @js.native
  def setEnv(env: String): Unit = js.native
  
  @JSImport("asenv", "unlessProduction")
  @js.native
  def unlessProduction(handle: js.Function0[_]): js.Any = js.native
}
