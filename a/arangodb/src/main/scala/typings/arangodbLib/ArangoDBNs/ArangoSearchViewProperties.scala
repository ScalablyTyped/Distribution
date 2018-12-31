package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewProperties extends js.Object {
  var cleanupIntervalStep: scala.Double
  var consolidationIntervalMsec: scala.Double
  var consolidationPolicy: arangodbLib.Anon_ThresholdType
  var id: java.lang.String
  var links: org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  var name: java.lang.String
  var `type`: arangodbLib.arangodbLibStrings.arangosearch
}

