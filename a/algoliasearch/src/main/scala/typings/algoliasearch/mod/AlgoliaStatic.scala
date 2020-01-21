package typings.algoliasearch.mod

import typings.algoliasearch.mod.Places.PlaceInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgoliaStatic extends AlgoliasearchInstance {
  def initPlaces(apiKey: String, applicationId: String): PlaceInterface = js.native
}

