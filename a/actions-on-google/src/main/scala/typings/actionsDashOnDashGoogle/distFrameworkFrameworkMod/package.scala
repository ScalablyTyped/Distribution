package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFrameworkFrameworkMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject

  type FrameworkMetadata = /** @public */
  StringDictionary[js.Any]
  type Frameworks = /** @public */
  StringDictionary[Framework[js.Function]]
  type Headers = /** @public */
  StringDictionary[js.UndefOr[String | js.Array[String]]]
  type StandardHandler = js.Function3[
    /* body */ JsonObject, 
    /* headers */ Headers, 
    /* metadata */ js.UndefOr[BuiltinFrameworkMetadata], 
    js.Promise[StandardResponse]
  ]
}
