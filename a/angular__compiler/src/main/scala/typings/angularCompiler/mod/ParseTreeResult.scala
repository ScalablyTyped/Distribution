package typings.angularCompiler.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParseTreeResult")
@js.native
open class ParseTreeResult protected () extends StObject {
  def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  
  var errors: js.Array[ParseError] = js.native
  
  var rootNodes: js.Array[Node] = js.native
}
