package typings.angularCompiler.mod

import typings.angularCompiler.anon.Error
import typings.angularCompiler.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/compiler", "ElementSchemaRegistry")
@js.native
open class ElementSchemaRegistry () extends StObject {
  
  def allKnownElementNames(): js.Array[String] = js.native
  
  def getDefaultComponentElementName(): String = js.native
  
  def getMappedPropName(propName: String): String = js.native
  
  def hasElement(tagName: String, schemaMetas: js.Array[SchemaMetadata]): Boolean = js.native
  
  def hasProperty(tagName: String, propName: String, schemaMetas: js.Array[SchemaMetadata]): Boolean = js.native
  
  def normalizeAnimationStyleProperty(propName: String): String = js.native
  
  def normalizeAnimationStyleValue(camelCaseProp: String, userProvidedProp: String, `val`: String): Value = js.native
  def normalizeAnimationStyleValue(camelCaseProp: String, userProvidedProp: String, `val`: Double): Value = js.native
  
  def securityContext(elementName: String, propName: String, isAttribute: Boolean): SecurityContext = js.native
  
  def validateAttribute(name: String): Error = js.native
  
  def validateProperty(name: String): Error = js.native
}
