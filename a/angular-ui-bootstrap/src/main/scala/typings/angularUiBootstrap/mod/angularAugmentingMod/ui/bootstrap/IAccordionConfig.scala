package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccordionConfig extends StObject {
  
  /**
    * Controls whether expanding an item will cause the other items to close.
    *
    * @default true
    */
  var closeOthers: js.UndefOr[Boolean] = js.native
}
object IAccordionConfig {
  
  @scala.inline
  def apply(): IAccordionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionConfig]
  }
  
  @scala.inline
  implicit class IAccordionConfigMutableBuilder[Self <: IAccordionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseOthers(value: Boolean): Self = StObject.set(x, "closeOthers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOthersUndefined: Self = StObject.set(x, "closeOthers", js.undefined)
  }
}
