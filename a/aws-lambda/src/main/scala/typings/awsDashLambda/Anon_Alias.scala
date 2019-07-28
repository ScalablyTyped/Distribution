package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alias extends js.Object {
  var alias: String
  var name: String
  var version: String
}

object Anon_Alias {
  @scala.inline
  def apply(alias: String, name: String, version: String): Anon_Alias = {
    val __obj = js.Dynamic.literal(alias = alias, name = name, version = version)
  
    __obj.asInstanceOf[Anon_Alias]
  }
}

