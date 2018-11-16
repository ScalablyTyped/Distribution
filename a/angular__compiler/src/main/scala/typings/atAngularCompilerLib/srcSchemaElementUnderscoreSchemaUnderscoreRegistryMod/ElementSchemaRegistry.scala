package typings
package atAngularCompilerLib.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/schema/element_schema_registry", "ElementSchemaRegistry")
@js.native
abstract class ElementSchemaRegistry () extends js.Object {
  def allKnownElementNames(): js.Array[java.lang.String] = js.native
  def getDefaultComponentElementName(): java.lang.String = js.native
  def getMappedPropName(propName: java.lang.String): java.lang.String = js.native
  def hasElement(tagName: java.lang.String, schemaMetas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata]): scala.Boolean = js.native
  def hasProperty(
    tagName: java.lang.String,
    propName: java.lang.String,
    schemaMetas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata]
  ): scala.Boolean = js.native
  def normalizeAnimationStyleProperty(propName: java.lang.String): java.lang.String = js.native
  def normalizeAnimationStyleValue(camelCaseProp: java.lang.String, userProvidedProp: java.lang.String, `val`: java.lang.String): atAngularCompilerLib.Anon_ErrorValue = js.native
  def normalizeAnimationStyleValue(camelCaseProp: java.lang.String, userProvidedProp: java.lang.String, `val`: scala.Double): atAngularCompilerLib.Anon_ErrorValue = js.native
  def securityContext(elementName: java.lang.String, propName: java.lang.String, isAttribute: scala.Boolean): atAngularCompilerLib.srcCoreMod.SecurityContext = js.native
  def validateAttribute(name: java.lang.String): atAngularCompilerLib.Anon_Error = js.native
  def validateProperty(name: java.lang.String): atAngularCompilerLib.Anon_Error = js.native
}

