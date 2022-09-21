package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsProvider extends StObject {
  
  def getOption(name: String): Any = js.native
  
  def getOptions(): StringDictionary[Any] = js.native
  def getOptions(optionNames: js.Array[String]): StringDictionary[Any] = js.native
  def getOptions(optionNames: StringDictionary[Any]): StringDictionary[Any] = js.native
  
  def setOption(name: String, value: Any): Unit = js.native
  
  def setOptions(optList: StringDictionary[Any]): Unit = js.native
}
