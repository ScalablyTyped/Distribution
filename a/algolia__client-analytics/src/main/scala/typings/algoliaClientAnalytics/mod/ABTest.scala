package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ABTest extends js.Object {
  /**
    * The ab test end date, if any.
    */
  val endAt: String
  /**
    * The ab test name.
    */
  val name: String
  /**
    * The ab test list of variants.
    */
  val variants: js.Array[Variant]
}

object ABTest {
  @scala.inline
  def apply(endAt: String, name: String, variants: js.Array[Variant]): ABTest = {
    val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABTest]
  }
}

