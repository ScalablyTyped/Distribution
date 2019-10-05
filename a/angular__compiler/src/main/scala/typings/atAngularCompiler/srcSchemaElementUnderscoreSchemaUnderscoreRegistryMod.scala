package typings.atAngularCompiler

import typings.atAngularCompiler.srcCoreMod.SchemaMetadata
import typings.atAngularCompiler.srcCoreMod.SecurityContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/schema/element_schema_registry", JSImport.Namespace)
@js.native
object srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod extends js.Object {
  @js.native
  abstract class ElementSchemaRegistry () extends js.Object {
    def allKnownElementNames(): js.Array[String] = js.native
    def getDefaultComponentElementName(): String = js.native
    def getMappedPropName(propName: String): String = js.native
    def hasElement(tagName: String, schemaMetas: js.Array[SchemaMetadata]): Boolean = js.native
    def hasProperty(tagName: String, propName: String, schemaMetas: js.Array[SchemaMetadata]): Boolean = js.native
    def normalizeAnimationStyleProperty(propName: String): String = js.native
    def normalizeAnimationStyleValue(camelCaseProp: String, userProvidedProp: String, `val`: String): Anon_ErrorValue = js.native
    def normalizeAnimationStyleValue(camelCaseProp: String, userProvidedProp: String, `val`: Double): Anon_ErrorValue = js.native
    def securityContext(elementName: String, propName: String, isAttribute: Boolean): SecurityContext = js.native
    def validateAttribute(name: String): Anon_Error = js.native
    def validateProperty(name: String): Anon_Error = js.native
  }
  
}

