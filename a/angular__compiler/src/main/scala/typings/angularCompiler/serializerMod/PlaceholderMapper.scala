package typings.angularCompiler.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderMapper extends js.Object {
  def toInternalName(publicName: String): String | Null
  def toPublicName(internalName: String): String | Null
}

object PlaceholderMapper {
  @scala.inline
  def apply(toInternalName: String => String | Null, toPublicName: String => String | Null): PlaceholderMapper = {
    val __obj = js.Dynamic.literal(toInternalName = js.Any.fromFunction1(toInternalName), toPublicName = js.Any.fromFunction1(toPublicName))
  
    __obj.asInstanceOf[PlaceholderMapper]
  }
}

