package typings.asenv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEnv(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[String]
  
  @scala.inline
  def isDevelopment(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevelopment")().asInstanceOf[Boolean]
  
  @scala.inline
  def isProduction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProduction")().asInstanceOf[Boolean]
  
  @scala.inline
  def isTest(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTest")().asInstanceOf[Boolean]
  
  @scala.inline
  def setEnv(env: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnv")(env.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unlessProduction(handle: js.Function0[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unlessProduction")(handle.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
