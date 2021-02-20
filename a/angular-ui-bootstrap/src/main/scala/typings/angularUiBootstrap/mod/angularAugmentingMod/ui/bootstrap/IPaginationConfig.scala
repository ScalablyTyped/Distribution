package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaginationConfig extends StObject {
  
  /**
    * Whether to always display the first and last page numbers. If max-size is smaller than the number of pages, then the first and last page numbers are still shown with ellipses in-between as necessary. NOTE: max-size refers to the center of the range. This option may add up to 2 more numbers on each side of the displayed range for the end value and what would be an ellipsis but is replaced by a number because it is sequential.
    *
    * @default false
    */
  var boundaryLinkNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display First / Last buttons.
    *
    * @default false
    */
  var boundaryLinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display Previous / Next buttons.
    *
    * @default true
    */
  var directionLinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Text for First button.
    *
    * @default 'First'
    */
  var firstText: js.UndefOr[String] = js.native
  
  /**
    * Also displays ellipses when rotate is true and max-size is smaller than the number of pages.
    *
    * @default  false
    */
  var forceEllipses: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Text for Last button.
    *
    * @default 'Last'
    */
  var lastText: js.UndefOr[String] = js.native
  
  /**
    * Limit number for pagination size.
    *
    * @default: null
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * Text for Next button.
    *
    * @default 'Next'
    */
  var nextText: js.UndefOr[String] = js.native
  
  /**
    * An optional expression assigned the total number of pages to display.
    *
    * @default angular.noop
    */
  var numPages: js.UndefOr[Double] = js.native
  
  /**
    * Text for Previous button.
    *
    * @default 'Previous'
    */
  var previousText: js.UndefOr[String] = js.native
  
  /**
    * Whether to keep current page in the middle of the visible ones.
    *
    * @default true
    */
  var rotate: js.UndefOr[Boolean] = js.native
  
  /**
    * Override the template for the component with a custom provided template.
    *
    * @default  'template/pagination/pagination.html'
    */
  var templateUrl: js.UndefOr[String] = js.native
  
  /**
    * Total number of items in all pages.
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object IPaginationConfig {
  
  @scala.inline
  def apply(): IPaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaginationConfig]
  }
  
  @scala.inline
  implicit class IPaginationConfigMutableBuilder[Self <: IPaginationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundaryLinkNumbers(value: Boolean): Self = StObject.set(x, "boundaryLinkNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryLinkNumbersUndefined: Self = StObject.set(x, "boundaryLinkNumbers", js.undefined)
    
    @scala.inline
    def setBoundaryLinks(value: Boolean): Self = StObject.set(x, "boundaryLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryLinksUndefined: Self = StObject.set(x, "boundaryLinks", js.undefined)
    
    @scala.inline
    def setDirectionLinks(value: Boolean): Self = StObject.set(x, "directionLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLinksUndefined: Self = StObject.set(x, "directionLinks", js.undefined)
    
    @scala.inline
    def setFirstText(value: String): Self = StObject.set(x, "firstText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTextUndefined: Self = StObject.set(x, "firstText", js.undefined)
    
    @scala.inline
    def setForceEllipses(value: Boolean): Self = StObject.set(x, "forceEllipses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceEllipsesUndefined: Self = StObject.set(x, "forceEllipses", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    @scala.inline
    def setLastText(value: String): Self = StObject.set(x, "lastText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTextUndefined: Self = StObject.set(x, "lastText", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    @scala.inline
    def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPagesUndefined: Self = StObject.set(x, "numPages", js.undefined)
    
    @scala.inline
    def setPreviousText(value: String): Self = StObject.set(x, "previousText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTextUndefined: Self = StObject.set(x, "previousText", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
