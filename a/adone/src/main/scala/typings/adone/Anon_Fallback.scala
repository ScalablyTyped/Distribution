package typings.adone

import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fallback extends js.Object {
  var fallback: StringDictionary[Type[_]]
  var mapping: StringDictionary[Type[_]]
  var scalar: StringDictionary[Type[_]]
  var sequence: StringDictionary[Type[_]]
}

object Anon_Fallback {
  @scala.inline
  def apply(
    fallback: StringDictionary[Type[_]],
    mapping: StringDictionary[Type[_]],
    scalar: StringDictionary[Type[_]],
    sequence: StringDictionary[Type[_]]
  ): Anon_Fallback = {
    val __obj = js.Dynamic.literal(fallback = fallback, mapping = mapping, scalar = scalar, sequence = sequence)
  
    __obj.asInstanceOf[Anon_Fallback]
  }
}

