package typings.awsDashLambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* Key */ StringDictionary[js.Any] {
  var ServiceToken: String
}

object Anon_Key {
  @scala.inline
  def apply(ServiceToken: String, StringDictionary: /* Key */ StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

