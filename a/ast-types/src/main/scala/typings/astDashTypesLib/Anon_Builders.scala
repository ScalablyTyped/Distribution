package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Builders extends js.Object {
  var Type: Anon_Def = js.native
  var builders: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/gen/builders.builders */ js.Any = js.native
  var builtInTypes: Anon_Array = js.native
  var namedTypes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/gen/namedTypes.NamedTypes */ js.Any = js.native
  def computeSupertypeLookupTable(candidates: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def defineMethod(name: js.Any): js.Function = js.native
  def defineMethod(name: js.Any, func: js.Function): js.Function = js.native
  def eachField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): scala.Unit = js.native
  def eachField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): scala.Unit = js.native
  def getBuilderName(typeName: js.Any): js.Any = js.native
  def getFieldNames(`object`: js.Any): js.Array[java.lang.String] = js.native
  def getFieldValue(`object`: js.Any, fieldName: js.Any): js.Any = js.native
  def getStatementBuilderName(typeName: js.Any): js.Any = js.native
  def getSupertypeNames(typeName: java.lang.String): js.Array[java.lang.String] = js.native
  def someField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): scala.Boolean = js.native
  def someField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): scala.Boolean = js.native
}

