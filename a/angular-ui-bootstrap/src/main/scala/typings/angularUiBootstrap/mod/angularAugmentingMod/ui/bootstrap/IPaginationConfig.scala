package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaginationConfig extends js.Object {
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
  @scala.inline
  def apply(
    boundaryLinkNumbers: js.UndefOr[Boolean] = js.undefined,
    boundaryLinks: js.UndefOr[Boolean] = js.undefined,
    directionLinks: js.UndefOr[Boolean] = js.undefined,
    firstText: String = null,
    forceEllipses: js.UndefOr[Boolean] = js.undefined,
    itemsPerPage: Int | Double = null,
    lastText: String = null,
    maxSize: Int | Double = null,
    nextText: String = null,
    numPages: Int | Double = null,
    previousText: String = null,
    rotate: js.UndefOr[Boolean] = js.undefined,
    templateUrl: String = null,
    totalItems: Int | Double = null
  ): IPaginationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boundaryLinkNumbers)) __obj.updateDynamic("boundaryLinkNumbers")(boundaryLinkNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(boundaryLinks)) __obj.updateDynamic("boundaryLinks")(boundaryLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(directionLinks)) __obj.updateDynamic("directionLinks")(directionLinks.asInstanceOf[js.Any])
    if (firstText != null) __obj.updateDynamic("firstText")(firstText.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEllipses)) __obj.updateDynamic("forceEllipses")(forceEllipses.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (lastText != null) __obj.updateDynamic("lastText")(lastText.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (numPages != null) __obj.updateDynamic("numPages")(numPages.asInstanceOf[js.Any])
    if (previousText != null) __obj.updateDynamic("previousText")(previousText.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaginationConfig]
  }
}

