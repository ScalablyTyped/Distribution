package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hit extends js.Object {
  /**
    * The expressions returned from a document that matches the search request.
    */
  var exprs: js.UndefOr[Exprs] = js.undefined
  /**
    * The fields returned from a document that matches the search request.
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /**
    * The highlights returned from a document that matches the search request.
    */
  var highlights: js.UndefOr[Highlights] = js.undefined
  /**
    * The document ID of a document that matches the search request.
    */
  var id: js.UndefOr[String] = js.undefined
}

object Hit {
  @scala.inline
  def apply(exprs: Exprs = null, fields: Fields = null, highlights: Highlights = null, id: String = null): Hit = {
    val __obj = js.Dynamic.literal()
    if (exprs != null) __obj.updateDynamic("exprs")(exprs)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (highlights != null) __obj.updateDynamic("highlights")(highlights)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Hit]
  }
}

