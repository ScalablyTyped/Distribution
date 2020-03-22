package typings.algoliaClientCommon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethods[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */] extends js.Object {
  val methods: js.UndefOr[TMethods] = js.undefined
}

object AnonMethods {
  @scala.inline
  def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */](methods: TMethods = null): AnonMethods[TMethods] = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethods[TMethods]]
  }
}

