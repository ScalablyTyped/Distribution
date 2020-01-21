package typings.applicationinsights.pageViewDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of PageView represents a generic action on a page like a button click. It is also the base type for PageView.
  */
@js.native
trait PageViewData
  extends typings.applicationinsights.eventDataMod.^ {
  /**
    * Request duration in format: DD.HH:MM:SS.MMMMMM. For a page view (PageViewData), this is the duration. For a page view with performance information (PageViewPerfData), this is the page load time. Must be less than 1000 days.
    */
  var duration: String = js.native
  /**
    * Request URL with all query string parameters
    */
  var url: String = js.native
}

