package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagDefinition extends StObject {
  
  var canSelfClose: Boolean = js.native
  
  var closedByParent: Boolean = js.native
  
  def getContentType(): TagContentType = js.native
  def getContentType(prefix: String): TagContentType = js.native
  
  var ignoreFirstLf: Boolean = js.native
  
  var implicitNamespacePrefix: String | Null = js.native
  
  def isClosedByChild(name: String): Boolean = js.native
  
  var isVoid: Boolean = js.native
  
  var preventNamespaceInheritance: Boolean = js.native
}
