package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbGeneralDashGraphMod {
  type Betweenness = Eccentricity
  type Closeness = Eccentricity
  type ClosenessOptions = ShortestPathOptions
  type CommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[arangodbLib.Anon_Id]]]
  type CountCommonNeighbors = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]]]
  ]
  type CountCommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type DiameterOptions = BetweennessOptions
  type Eccentricity = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type EccentricityOptions = ShortestPathOptions
  type Example = (js.Array[js.Object | java.lang.String]) | js.Object | java.lang.String | scala.Null
  type RadiusOptions = BetweennessOptions
}
