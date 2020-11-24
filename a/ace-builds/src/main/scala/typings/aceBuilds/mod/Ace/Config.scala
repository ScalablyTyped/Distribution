package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  def all(): StringDictionary[js.Any] = js.native
  
  def defineOptions(obj: js.Any, path: String, options: StringDictionary[js.Any]): Config = js.native
  
  def get(key: String): js.Any = js.native
  
  def init(packaged: js.Any): js.Any = js.native
  
  def loadModule(moduleName: String, onLoad: js.Function1[/* module */ js.Any, Unit]): Unit = js.native
  def loadModule(moduleName: js.Tuple2[String, String], onLoad: js.Function1[/* module */ js.Any, Unit]): Unit = js.native
  
  def moduleUrl(name: String): String = js.native
  def moduleUrl(name: String, component: String): String = js.native
  
  def resetOptions(obj: js.Any): Unit = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  
  def setDefaultValue(path: String, name: String, value: js.Any): Unit = js.native
  
  def setDefaultValues(path: String, optionHash: StringDictionary[js.Any]): Unit = js.native
  
  def setModuleUrl(name: String, subst: String): String = js.native
}
