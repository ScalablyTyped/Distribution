package typings.argv.argvMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait module extends js.Object {
  var description: String
  var mod: String
  var options: StringDictionary[helpOption]
}

object module {
  @scala.inline
  def apply(description: String, mod: String, options: StringDictionary[helpOption]): module = {
    val __obj = js.Dynamic.literal(description = description, mod = mod, options = options)
  
    __obj.asInstanceOf[module]
  }
}

