package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArangoSearchViewPropertiesOptions extends js.Object {
  var cleanupIntervalStep: js.UndefOr[scala.Double] = js.undefined
  var consolidationIntervalMsec: js.UndefOr[scala.Double] = js.undefined
  var consolidationPolicy: js.UndefOr[arangodbLib.Anon_Threshold] = js.undefined
  var links: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  ] = js.undefined
}

