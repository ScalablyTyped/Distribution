package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProgressConfig extends StObject {
  
  /**
    * Whether bars use transitions to achieve the width change.
    *
    * @default: true
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A number that specifies the total value of bars that is required.
    *
    * @default: 100
    */
  var max: js.UndefOr[Double] = js.undefined
}
object IProgressConfig {
  
  @scala.inline
  def apply(): IProgressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressConfig]
  }
  
  @scala.inline
  implicit class IProgressConfigMutableBuilder[Self <: IProgressConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
