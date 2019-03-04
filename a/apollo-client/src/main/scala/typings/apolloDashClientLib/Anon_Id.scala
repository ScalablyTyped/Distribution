package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var __typename: java.lang.String
  var id: java.lang.String | scala.Double
}

object Anon_Id {
  @scala.inline
  def apply(__typename: java.lang.String, id: java.lang.String | scala.Double): Anon_Id = {
    val __obj = js.Dynamic.literal(__typename = __typename, id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

