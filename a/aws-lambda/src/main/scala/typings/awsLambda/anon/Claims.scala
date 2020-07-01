package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Claims extends js.Object {
  var claims: StringDictionary[String | Double | Boolean | js.Array[String]]
  var scopes: js.Array[String]
}

object Claims {
  @scala.inline
  def apply(claims: StringDictionary[String | Double | Boolean | js.Array[String]], scopes: js.Array[String]): Claims = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claims]
  }
}

