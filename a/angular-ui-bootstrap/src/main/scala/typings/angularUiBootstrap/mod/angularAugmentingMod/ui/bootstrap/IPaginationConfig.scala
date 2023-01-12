package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaginationConfig extends StObject {
  
  /**
    * Whether to always display the first and last page numbers. If max-size is smaller than the number of pages, then the first and last page numbers are still shown with ellipses in-between as necessary. NOTE: max-size refers to the center of the range. This option may add up to 2 more numbers on each side of the displayed range for the end value and what would be an ellipsis but is replaced by a number because it is sequential.
    *
    * @default false
    */
  var boundaryLinkNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display First / Last buttons.
    *
    * @default false
    */
  var boundaryLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display Previous / Next buttons.
    *
    * @default true
    */
  var directionLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text for First button.
    *
    * @default 'First'
    */
  var firstText: js.UndefOr[String] = js.undefined
  
  /**
    * Also displays ellipses when rotate is true and max-size is smaller than the number of pages.
    *
    * @default  false
    */
  var forceEllipses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Text for Last button.
    *
    * @default 'Last'
    */
  var lastText: js.UndefOr[String] = js.undefined
  
  /**
    * Limit number for pagination size.
    *
    * @default: null
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Text for Next button.
    *
    * @default 'Next'
    */
  var nextText: js.UndefOr[String] = js.undefined
  
  /**
    * An optional expression assigned the total number of pages to display.
    *
    * @default angular.noop
    */
  var numPages: js.UndefOr[Double] = js.undefined
  
  /**
    * Text for Previous button.
    *
    * @default 'Previous'
    */
  var previousText: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to keep current page in the middle of the visible ones.
    *
    * @default true
    */
  var rotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override the template for the component with a custom provided template.
    *
    * @default  'template/pagination/pagination.html'
    */
  var templateUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of items in all pages.
    */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object IPaginationConfig {
  
  inline def apply(): IPaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaginationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPaginationConfig] (val x: Self) extends AnyVal {
    
    inline def setBoundaryLinkNumbers(value: Boolean): Self = StObject.set(x, "boundaryLinkNumbers", value.asInstanceOf[js.Any])
    
    inline def setBoundaryLinkNumbersUndefined: Self = StObject.set(x, "boundaryLinkNumbers", js.undefined)
    
    inline def setBoundaryLinks(value: Boolean): Self = StObject.set(x, "boundaryLinks", value.asInstanceOf[js.Any])
    
    inline def setBoundaryLinksUndefined: Self = StObject.set(x, "boundaryLinks", js.undefined)
    
    inline def setDirectionLinks(value: Boolean): Self = StObject.set(x, "directionLinks", value.asInstanceOf[js.Any])
    
    inline def setDirectionLinksUndefined: Self = StObject.set(x, "directionLinks", js.undefined)
    
    inline def setFirstText(value: String): Self = StObject.set(x, "firstText", value.asInstanceOf[js.Any])
    
    inline def setFirstTextUndefined: Self = StObject.set(x, "firstText", js.undefined)
    
    inline def setForceEllipses(value: Boolean): Self = StObject.set(x, "forceEllipses", value.asInstanceOf[js.Any])
    
    inline def setForceEllipsesUndefined: Self = StObject.set(x, "forceEllipses", js.undefined)
    
    inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    inline def setLastText(value: String): Self = StObject.set(x, "lastText", value.asInstanceOf[js.Any])
    
    inline def setLastTextUndefined: Self = StObject.set(x, "lastText", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
    
    inline def setNumPagesUndefined: Self = StObject.set(x, "numPages", js.undefined)
    
    inline def setPreviousText(value: String): Self = StObject.set(x, "previousText", value.asInstanceOf[js.Any])
    
    inline def setPreviousTextUndefined: Self = StObject.set(x, "previousText", js.undefined)
    
    inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
