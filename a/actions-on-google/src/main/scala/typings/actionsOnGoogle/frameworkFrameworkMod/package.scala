package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frameworkFrameworkMod {
  type FrameworkMetadata = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.Any]
  type Frameworks = /** @public */
  org.scalablytyped.runtime.StringDictionary[typings.actionsOnGoogle.frameworkFrameworkMod.Framework[js.Function]]
  type Headers = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  type StandardHandler = js.Function3[
    /* body */ typings.actionsOnGoogle.commonMod.JsonObject, 
    /* headers */ typings.actionsOnGoogle.frameworkFrameworkMod.Headers, 
    /* metadata */ js.UndefOr[typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata], 
    js.Promise[typings.actionsOnGoogle.frameworkFrameworkMod.StandardResponse]
  ]
}
