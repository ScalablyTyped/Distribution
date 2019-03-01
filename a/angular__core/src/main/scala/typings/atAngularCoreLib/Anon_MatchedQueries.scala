package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MatchedQueries extends js.Object {
  var matchedQueries: org.scalablytyped.runtime.StringDictionary[atAngularCoreLib.srcViewTypesMod.QueryValueType]
  var matchedQueryIds: scala.Double
  var references: org.scalablytyped.runtime.StringDictionary[atAngularCoreLib.srcViewTypesMod.QueryValueType]
}

object Anon_MatchedQueries {
  @scala.inline
  def apply(
    matchedQueries: org.scalablytyped.runtime.StringDictionary[atAngularCoreLib.srcViewTypesMod.QueryValueType],
    matchedQueryIds: scala.Double,
    references: org.scalablytyped.runtime.StringDictionary[atAngularCoreLib.srcViewTypesMod.QueryValueType]
  ): Anon_MatchedQueries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matchedQueries")(matchedQueries)
    __obj.updateDynamic("matchedQueryIds")(matchedQueryIds)
    __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[Anon_MatchedQueries]
  }
}

