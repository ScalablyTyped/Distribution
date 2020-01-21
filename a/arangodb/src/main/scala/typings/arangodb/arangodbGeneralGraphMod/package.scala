package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arangodbGeneralGraphMod {
  type Betweenness = typings.arangodb.arangodbGeneralGraphMod.Eccentricity
  type Closeness = typings.arangodb.arangodbGeneralGraphMod.Eccentricity
  type ClosenessOptions = typings.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
  type CommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[typings.arangodb.AnonId]]]
  type CountCommonNeighbors = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]]]
  ]
  type CountCommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type DiameterOptions = typings.arangodb.arangodbGeneralGraphMod.BetweennessOptions
  type Eccentricity = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type EccentricityOptions = typings.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
  type Example = (js.Array[js.Object | java.lang.String]) | js.Object | java.lang.String | scala.Null
  type RadiusOptions = typings.arangodb.arangodbGeneralGraphMod.BetweennessOptions
}
