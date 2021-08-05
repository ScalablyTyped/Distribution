package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionProvider extends StObject {
  
  /**
    * Get a Configuration Option
    **/
  def getOption(name: String): js.Any
  
  /**
    * Get Configuration Options
    **/
  def getOptions(): js.Any
  
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: String, optionValue: js.Any): Unit
  
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: js.Any): Unit
}
object OptionProvider {
  
  inline def apply(
    getOption: String => js.Any,
    getOptions: () => js.Any,
    setOption: (String, js.Any) => Unit,
    setOptions: js.Any => Unit
  ): OptionProvider = {
    val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), getOptions = js.Any.fromFunction0(getOptions), setOption = js.Any.fromFunction2(setOption), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[OptionProvider]
  }
  
  extension [Self <: OptionProvider](x: Self) {
    
    inline def setGetOption(value: String => js.Any): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
    
    inline def setGetOptions(value: () => js.Any): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    inline def setSetOption(value: (String, js.Any) => Unit): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    inline def setSetOptions(value: js.Any => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
