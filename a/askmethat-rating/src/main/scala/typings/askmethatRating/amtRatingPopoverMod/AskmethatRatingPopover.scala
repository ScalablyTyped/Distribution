package typings.askmethatRating.amtRatingPopoverMod

import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopover")
@js.native
class AskmethatRatingPopover protected () extends js.Object {
  /**
    *
    */
  def this(options: AskmethatRatingPopoverOptions) = this()
  
  var _options: js.Any = js.native
  
  /**
    * @function get the default option for the rating
    *
    * @return  options based on @type AskmethatRatingOptions
    */
  /**
    * @function set the default option for the rating
    *
    * @return  options based on @type AskmethatRatingOptions
    */
  var options: AskmethatRatingPopoverOptions = js.native
  
  /**
    * Return a list of elements
    */
  def render(): HTMLUListElement = js.native
}
