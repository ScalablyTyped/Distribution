package typings
package atAngularCompilerLib.srcI18nSerializersSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderMapper extends js.Object {
  def toInternalName(publicName: java.lang.String): java.lang.String | scala.Null
  def toPublicName(internalName: java.lang.String): java.lang.String | scala.Null
}

object PlaceholderMapper {
  @scala.inline
  def apply(
    toInternalName: js.Function1[java.lang.String, java.lang.String | scala.Null],
    toPublicName: js.Function1[java.lang.String, java.lang.String | scala.Null]
  ): PlaceholderMapper = {
    val __obj = js.Dynamic.literal(toInternalName = toInternalName, toPublicName = toPublicName)
  
    __obj.asInstanceOf[PlaceholderMapper]
  }
}

