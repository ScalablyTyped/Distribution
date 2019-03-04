package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* Key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ServiceToken: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(
    ServiceToken: java.lang.String,
    StringDictionary: /* Key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

