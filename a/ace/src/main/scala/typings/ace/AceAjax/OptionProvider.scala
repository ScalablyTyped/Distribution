package typings.ace.AceAjax

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionProvider extends StObject {
  
  /**
    * Get a Configuration Option
    **/
  def getOption(name: String): Any = js.native
  
  /**
    * Get Configuration Options
    **/
  def getOptions(): StringDictionary[Any] = js.native
  def getOptions(optionNames: js.Array[String]): StringDictionary[Any] = js.native
  def getOptions(optionNames: StringDictionary[Any]): StringDictionary[Any] = js.native
  
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: String, optionValue: Any): Unit = js.native
  
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: StringDictionary[Any]): Unit = js.native
}
