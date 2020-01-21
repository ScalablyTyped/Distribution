package typings.astTypes.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/lib/types", "Def")
@js.native
abstract class Def[T] protected () extends js.Object {
  def this(`type`: Type[T], typeName: String) = this()
  var allFields: StringDictionary[FieldType[_]] = js.native
  var allSupertypes: StringDictionary[Def[_]] = js.native
  var baseNames: js.Array[String] = js.native
  var buildParams: js.Array[String] = js.native
  var buildable: Boolean = js.native
  var fieldNames: js.Array[String] = js.native
  var finalized: Boolean = js.native
  var ownFields: StringDictionary[FieldType[_]] = js.native
  var supertypeList: js.Array[String] = js.native
  val `type`: Type[T] = js.native
  val typeName: String = js.native
  def bases(supertypeNames: String*): this.type = js.native
  def build(buildParams: String*): this.type = js.native
  def check(value: js.Any): Boolean = js.native
  def check(value: js.Any, deep: js.Any): Boolean = js.native
  def checkAllFields(value: js.Any): Boolean = js.native
  def checkAllFields(value: js.Any, deep: js.Any): Boolean = js.native
  def field(name: String, `type`: js.Any): this.type = js.native
  def field(name: String, `type`: js.Any, defaultFn: js.Function): this.type = js.native
  def field(name: String, `type`: js.Any, defaultFn: js.Function, hidden: Boolean): this.type = js.native
  def isSupertypeOf(that: Def[_]): Boolean = js.native
}

