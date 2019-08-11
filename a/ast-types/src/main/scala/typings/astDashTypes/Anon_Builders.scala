package typings.astDashTypes

import org.scalablytyped.runtime.StringDictionary
import typings.astDashTypes.genNamedTypesMod.NamedTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Builders extends js.Object {
  var Type: Anon_Def = js.native
  var builders: typings.astDashTypes.genBuildersMod.builders = js.native
  var builtInTypes: Anon_Array = js.native
  var namedTypes: NamedTypes = js.native
  def computeSupertypeLookupTable(candidates: js.Any): StringDictionary[js.Any] = js.native
  def defineMethod(name: js.Any): js.Function = js.native
  def defineMethod(name: js.Any, func: js.Function): js.Function = js.native
  def eachField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): Unit = js.native
  def eachField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): Unit = js.native
  def getBuilderName(typeName: js.Any): js.Any = js.native
  def getFieldNames(`object`: js.Any): js.Array[String] = js.native
  def getFieldValue(`object`: js.Any, fieldName: js.Any): js.Any = js.native
  def getStatementBuilderName(typeName: js.Any): js.Any = js.native
  def getSupertypeNames(typeName: String): js.Array[String] = js.native
  def someField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): Boolean = js.native
  def someField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): Boolean = js.native
}

