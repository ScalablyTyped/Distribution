package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: String
  var headers: StringDictionary[js.UndefOr[String]]
}

object Anon_Data {
  @scala.inline
  def apply(data: String, headers: StringDictionary[js.UndefOr[String]]): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, headers = headers)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

