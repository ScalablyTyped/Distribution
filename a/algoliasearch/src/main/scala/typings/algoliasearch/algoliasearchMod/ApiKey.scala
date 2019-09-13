package typings.algoliasearch.algoliasearchMod

import typings.algoliasearch.algoliasearchStrings.addObject
import typings.algoliasearch.algoliasearchStrings.analytics
import typings.algoliasearch.algoliasearchStrings.browse
import typings.algoliasearch.algoliasearchStrings.deleteIndex
import typings.algoliasearch.algoliasearchStrings.deleteObject
import typings.algoliasearch.algoliasearchStrings.editSettings
import typings.algoliasearch.algoliasearchStrings.listIndexes
import typings.algoliasearch.algoliasearchStrings.logs
import typings.algoliasearch.algoliasearchStrings.search
import typings.algoliasearch.algoliasearchStrings.seeUnretrievableAttributes
import typings.algoliasearch.algoliasearchStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  var acl: js.Array[
    search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
  ]
  var createdAt: Double
  var description: js.UndefOr[String] = js.undefined
  var validity: Double
  var value: String
}

object ApiKey {
  @scala.inline
  def apply(
    acl: js.Array[
      search | browse | addObject | deleteObject | deleteIndex | settings | editSettings | analytics | listIndexes | logs | seeUnretrievableAttributes
    ],
    createdAt: Double,
    validity: Double,
    value: String,
    description: String = null
  ): ApiKey = {
    val __obj = js.Dynamic.literal(acl = acl, createdAt = createdAt, validity = validity, value = value)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ApiKey]
  }
}

