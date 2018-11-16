package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "RichResponse")
@js.native
class RichResponse () extends js.Object {
  /**
       * Constructor for RichResponse. Accepts optional RichResponse to clone.
       *
       * @param richResponse Optional RichResponse to clone.
       */
  def this(richResponse: RichResponse) = this()
  /**
       * Ordered list of either SimpleResponse objects or BasicCard objects.
       * First item must be SimpleResponse. There can be at most one card.
       */
  var items: js.Array[RichResponseItem] = js.native
  /**
       * Link Out Suggestion chip for this rich response. Optional.
       */
  var linkOutSuggestion: js.UndefOr[LinkOutSuggestion] = js.native
  /**
       * Ordered list of text suggestions to display. Optional.
       */
  var suggestions: js.Array[Suggestion] = js.native
  /**
       * Adds a BasicCard to list of items.
       *
       * @param basicCard Basic card to include in response.
       * @return Returns current constructed RichResponse.
       */
  def addBasicCard(basicCard: BasicCard): RichResponse = js.native
  /**
       * Adds a Browse Carousel to list of items.
       *
       * @param browseCarousel Browse Carousel to present to user
       * @return Returns current constructed RichResponse.
       */
  def addBrowseCarousel(browseCarousel: BrowseCarousel): RichResponse = js.native
  /**
       * Adds a Browse Carousel to list of items.
       *
       * @param browseCarousel Browse Carousel to present to user
       * @return Returns current constructed RichResponse.
       */
  def addBrowseCarousel(browseCarousel: java.lang.String): RichResponse = js.native
  /**
       * Adds media to this response.
       *
       * @param mediaResponse MediaResponse to include in response.
       * @return Returns current constructed RichResponse.
       */
  def addMediaResponse(mediaResponse: MediaResponse): RichResponse = js.native
  /**
       * Adds an order update to this response. Use after a successful transaction
       * decision to confirm the order.
       *
       * @param orderUpdate OrderUpdate object to add.
       * @return Returns current constructed RichResponse.
       */
  def addOrderUpdate(orderUpdate: actionsDashOnDashGoogleLib.transactionsMod.OrderUpdate): RichResponse = js.native
  /**
       * Adds a SimpleResponse to list of items.
       *
       * @param simpleResponse Simple response to present to
       *     user. If just a string, display text will not be set.
       * @return Returns current constructed RichResponse.
       */
  def addSimpleResponse(simpleResponse: SimpleResponse): RichResponse = js.native
  /**
       * Adds a SimpleResponse to list of items.
       *
       * @param simpleResponse Simple response to present to
       *     user. If just a string, display text will not be set.
       * @return Returns current constructed RichResponse.
       */
  def addSimpleResponse(simpleResponse: java.lang.String): RichResponse = js.native
  /**
       * Sets the suggestion link for this rich response. The destination site must be verified
       * (https://developers.google.com/actions/console/brand-verification).
       *
       * @param destinationName Name of the link out destination.
       * @param suggestionUrl - String URL to open when suggestion is used.
       * @return Returns current constructed RichResponse.
       */
  def addSuggestionLink(destinationName: java.lang.String, suggestionUrl: java.lang.String): RichResponse = js.native
  /**
       * Adds a single suggestion or list of suggestions to list of items.
       *
       * @param suggestions Either a single string suggestion
       *     or list of suggestions to add.
       * @return Returns current constructed RichResponse.
       */
  def addSuggestions(suggestions: java.lang.String): RichResponse = js.native
  /**
       * Adds a single suggestion or list of suggestions to list of items.
       *
       * @param suggestions Either a single string suggestion
       *     or list of suggestions to add.
       * @return Returns current constructed RichResponse.
       */
  def addSuggestions(suggestions: js.Array[java.lang.String]): RichResponse = js.native
  /**
       * Returns true if the given suggestion text is valid to be added to the suggestion list. A valid
       * text string is not longer than 25 characters.
       * @param suggestionText Text to validate as suggestion.
       * @return True if the text is valid, false otherwise.s
       */
  def isValidSuggestionText(suggestionText: java.lang.String): scala.Boolean = js.native
}

