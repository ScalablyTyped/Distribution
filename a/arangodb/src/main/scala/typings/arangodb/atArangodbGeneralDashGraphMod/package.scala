package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atArangodbGeneralDashGraphMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.arangodb.Anon_Id

  type Betweenness = Eccentricity
  type Closeness = Eccentricity
  type ClosenessOptions = ShortestPathOptions
  type CommonProperties = StringDictionary[js.UndefOr[js.Array[Anon_Id]]]
  type CountCommonNeighbors = StringDictionary[js.UndefOr[js.Array[StringDictionary[js.UndefOr[Double]]]]]
  type CountCommonProperties = StringDictionary[js.UndefOr[Double]]
  type DiameterOptions = BetweennessOptions
  type Eccentricity = StringDictionary[js.UndefOr[Double]]
  type EccentricityOptions = ShortestPathOptions
  type Example = (js.Array[js.Object | String]) | js.Object | String | Null
  type RadiusOptions = BetweennessOptions
}
