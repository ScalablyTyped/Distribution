package typings.angularCompiler.serializerMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.RecurseVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/serializer", "SimplePlaceholderMapper")
@js.native
class SimplePlaceholderMapper protected ()
  extends RecurseVisitor
     with PlaceholderMapper {
  def this(message: Message, mapName: js.Function1[/* name */ String, String]) = this()
  var internalToPublic: js.Any = js.native
  var mapName: js.Any = js.native
  var publicToInternal: js.Any = js.native
  var publicToNextId: js.Any = js.native
  var visitPlaceholderName: js.Any = js.native
  /* CompleteClass */
  override def toInternalName(publicName: String): String | Null = js.native
  /* CompleteClass */
  override def toPublicName(internalName: String): String | Null = js.native
}

