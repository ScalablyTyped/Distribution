package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPaginationConfig extends js.Object {
  /**
               * Whether to always display the first and last page numbers. If max-size is smaller than the number of pages, then the first and last page numbers are still shown with ellipses in-between as necessary. NOTE: max-size refers to the center of the range. This option may add up to 2 more numbers on each side of the displayed range for the end value and what would be an ellipsis but is replaced by a number because it is sequential.
               *
               * @default false
               */
  var boundaryLinkNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether to display First / Last buttons.
               *
               * @default false
               */
  var boundaryLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether to display Previous / Next buttons.
               *
               * @default true
               */
  var directionLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Text for First button.
               *
               * @default 'First'
               */
  var firstText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Also displays ellipses when rotate is true and max-size is smaller than the number of pages.
               *
               * @default  false
               */
  var forceEllipses: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Maximum number of items per page. A value less than one indicates all items on one page.
               *
               * @default 10
               */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
               * Text for Last button.
               *
               * @default 'Last'
               */
  var lastText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Limit number for pagination size.
               *
               * @default: null
               */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
               * Text for Next button.
               *
               * @default 'Next'
               */
  var nextText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An optional expression assigned the total number of pages to display.
               *
               * @default angular.noop
               */
  var numPages: js.UndefOr[scala.Double] = js.undefined
  /**
               * Text for Previous button.
               *
               * @default 'Previous'
               */
  var previousText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether to keep current page in the middle of the visible ones.
               *
               * @default true
               */
  var rotate: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Override the template for the component with a custom provided template.
               *
               * @default  'template/pagination/pagination.html'
               */
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Total number of items in all pages.
               */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

