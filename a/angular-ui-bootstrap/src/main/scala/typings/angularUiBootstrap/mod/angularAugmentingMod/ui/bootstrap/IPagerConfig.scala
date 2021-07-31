package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPagerConfig extends StObject {
  
  /**
    * Whether to align each link to the sides.
    *
    * @default true
    */
  var align: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Text for Next button.
    *
    * @default 'Next »'
    */
  var nextText: js.UndefOr[String] = js.undefined
  
  /**
    * Text for Previous button.
    *
    * @default '« Previous'
    */
  var previousText: js.UndefOr[String] = js.undefined
}
object IPagerConfig {
  
  @scala.inline
  def apply(): IPagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagerConfig]
  }
  
  @scala.inline
  implicit class IPagerConfigMutableBuilder[Self <: IPagerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Boolean): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    @scala.inline
    def setPreviousText(value: String): Self = StObject.set(x, "previousText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTextUndefined: Self = StObject.set(x, "previousText", js.undefined)
  }
}
