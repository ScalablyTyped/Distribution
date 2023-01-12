package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRatingConfig extends StObject {
  
  /**
    * Changes the number of icons.
    *
    * @default: 5
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * A variable used in the template to specify the state for unselected icons.
    *
    * @default: null
    */
  var stateOff: js.UndefOr[String] = js.undefined
  
  /**
    * A variable used in the template to specify the state for selected icons.
    *
    * @default: null
    */
  var stateOn: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings defining titles for all icons.
    *
    * @default: ["one", "two", "three", "four", "five"]
    */
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}
object IRatingConfig {
  
  inline def apply(): IRatingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRatingConfig] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setStateOff(value: String): Self = StObject.set(x, "stateOff", value.asInstanceOf[js.Any])
    
    inline def setStateOffUndefined: Self = StObject.set(x, "stateOff", js.undefined)
    
    inline def setStateOn(value: String): Self = StObject.set(x, "stateOn", value.asInstanceOf[js.Any])
    
    inline def setStateOnUndefined: Self = StObject.set(x, "stateOn", js.undefined)
    
    inline def setTitles(value: js.Array[String]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    
    inline def setTitlesVarargs(value: String*): Self = StObject.set(x, "titles", js.Array(value*))
  }
}
