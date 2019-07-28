package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "Carousel")
@js.native
/**
  * Constructor for Carousel. Accepts optional Carousel to clone or list of
  * items to copy.
  *
  * @param carousel Either a carousel to clone
  *     or an array of OptionItem to initialize a new carousel
  */
class Carousel () extends js.Object {
  def this(carousel: js.Array[OptionItem]) = this()
  def this(carousel: Carousel) = this()
  /**
    * List of 2-20 items to show in this carousel. Required.
    */
  var items: js.Array[OptionItem] = js.native
  def addItems(optionItems: js.Array[OptionItem]): Carousel = js.native
  /**
    * Adds a single item or list of items to the carousel.
    *
    * @param optionItems OptionItems to add.
    * @return Returns current constructed Carousel.
    */
  def addItems(optionItems: OptionItem): Carousel = js.native
  /**
    * Sets the display options for the images in this carousel.
    * Use one of the image display constants. If none is chosen,
    * ImageDisplays.DEFAULT will be enforced.
    *
    * @param option The option for displaying the image.
    * @return Returns current constructed Carousel.
    */
  def setImageDisplay(option: ImageDisplays): Carousel = js.native
}

