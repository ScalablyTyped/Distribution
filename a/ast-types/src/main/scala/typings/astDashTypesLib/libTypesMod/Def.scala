package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/lib/types", "Def")
@js.native
abstract class Def[T] protected () extends js.Object {
  def this(`type`: Type[T], typeName: java.lang.String) = this()
  var allFields: org.scalablytyped.runtime.StringDictionary[Field[_]] = js.native
  var allSupertypes: org.scalablytyped.runtime.StringDictionary[Def[_]] = js.native
  var baseNames: js.Array[java.lang.String] = js.native
  var buildParams: js.Array[java.lang.String] = js.native
  var buildable: scala.Boolean = js.native
  var fieldNames: js.Array[java.lang.String] = js.native
  var finalized: scala.Boolean = js.native
  var ownFields: org.scalablytyped.runtime.StringDictionary[Field[_]] = js.native
  var supertypeList: js.Array[java.lang.String] = js.native
  val `type`: Type[T] = js.native
  val typeName: java.lang.String = js.native
  def bases(supertypeNames: java.lang.String*): this.type = js.native
  def build(buildParams: java.lang.String*): this.type = js.native
  def check(value: js.Any): scala.Boolean = js.native
  def check(value: js.Any, deep: js.Any): scala.Boolean = js.native
  def checkAllFields(value: js.Any): scala.Boolean = js.native
  def checkAllFields(value: js.Any, deep: js.Any): scala.Boolean = js.native
  def field(name: java.lang.String, `type`: js.Any): this.type = js.native
  def field(name: java.lang.String, `type`: js.Any, defaultFn: js.Function): this.type = js.native
  def field(name: java.lang.String, `type`: js.Any, defaultFn: js.Function, hidden: scala.Boolean): this.type = js.native
  def isSupertypeOf(that: Def[_]): scala.Boolean = js.native
}

