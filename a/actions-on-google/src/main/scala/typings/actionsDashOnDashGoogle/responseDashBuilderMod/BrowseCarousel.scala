package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "BrowseCarousel")
@js.native
/**
  * Constructor for BrowseCarousel. Accepts optional BrowseCarousel to
  * clone or list of items to copy.
  *
  * @param carousel Either a carousel to clone
  *     or an array of BrowseItem to initialize a new carousel
  */
class BrowseCarousel () extends js.Object {
  def this(carousel: js.Array[BrowseItem]) = this()
  def this(carousel: BrowseCarousel) = this()
  /**
    * List of 2-20 items to show in this carousel. Required.
    */
  var items: js.Array[BrowseItem] = js.native
  def addItems(browseItems: js.Array[BrowseItem]): BrowseCarousel = js.native
  /**
    * Adds a single item or list of items to the carousel.
    *
    * @param browseItems BrowseItems to add.
    * @return Returns current constructed BrowseCarousel.
    */
  def addItems(browseItems: BrowseItem): BrowseCarousel = js.native
  /**
    * Sets the display options for the images in this carousel.
    * Use one of the image display constants. If none is chosen,
    * ImageDisplays.DEFAULT will be enforced.
    *
    * @param option The option for displaying the image.
    * @return Returns current constructed BrowseCarousel.
    */
  def setImageDisplay(option: ImageDisplays): BrowseCarousel = js.native
}

