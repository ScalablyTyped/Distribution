package typings
package argvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait module extends js.Object {
  var description: java.lang.String
  var mod: java.lang.String
  var options: org.scalablytyped.runtime.StringDictionary[helpOption]
}

object module {
  @scala.inline
  def apply(
    description: java.lang.String,
    mod: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[helpOption]
  ): module = {
    val __obj = js.Dynamic.literal(description = description, mod = mod, options = options)
  
    __obj.asInstanceOf[module]
  }
}

