package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  def all(): StringDictionary[Any] = js.native
  
  def defineOptions(obj: Any, path: String, options: StringDictionary[Any]): Config = js.native
  
  def get(key: String): Any = js.native
  
  def init(packaged: Any): Any = js.native
  
  def loadModule(moduleName: String): Unit = js.native
  def loadModule(moduleName: String, onLoad: js.Function1[/* module */ Any, Unit]): Unit = js.native
  def loadModule(moduleName: js.Tuple2[String, String]): Unit = js.native
  def loadModule(moduleName: js.Tuple2[String, String], onLoad: js.Function1[/* module */ Any, Unit]): Unit = js.native
  
  def moduleUrl(name: String): String = js.native
  def moduleUrl(name: String, component: String): String = js.native
  
  def resetOptions(obj: Any): Unit = js.native
  
  def set(key: String, value: Any): Unit = js.native
  
  def setDefaultValue(path: String, name: String, value: Any): Unit = js.native
  
  def setDefaultValues(path: String, optionHash: StringDictionary[Any]): Unit = js.native
  
  def setModuleUrl(name: String, subst: String): String = js.native
}
