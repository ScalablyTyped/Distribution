package typings.autokanji

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("autokanji", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def find(input: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def setLenience(level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLenience")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
