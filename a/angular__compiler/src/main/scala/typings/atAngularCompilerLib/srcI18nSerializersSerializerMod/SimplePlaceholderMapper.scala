package typings
package atAngularCompilerLib.srcI18nSerializersSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/serializer", "SimplePlaceholderMapper")
@js.native
class SimplePlaceholderMapper protected ()
  extends atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.RecurseVisitor
     with PlaceholderMapper {
  def this(message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message, mapName: js.Function1[/* name */ java.lang.String, java.lang.String]) = this()
  var internalToPublic: js.Any = js.native
  var mapName: js.Any = js.native
  var publicToInternal: js.Any = js.native
  var publicToNextId: js.Any = js.native
  var visitPlaceholderName: js.Any = js.native
  /* CompleteClass */
  override def toInternalName(publicName: java.lang.String): java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override def toPublicName(internalName: java.lang.String): java.lang.String | scala.Null = js.native
}

