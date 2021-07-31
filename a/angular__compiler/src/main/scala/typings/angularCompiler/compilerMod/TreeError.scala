package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typings.angularCompiler.publicApiMod.TreeError {
  def this(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String) = this()
}
/* static members */
object TreeError {
  
  @JSImport("@angular/compiler/compiler", "TreeError")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(elementName: String, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserParserMod.TreeError]
  @scala.inline
  def create(elementName: Null, span: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan, msg: String): typings.angularCompiler.mlParserParserMod.TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.mlParserParserMod.TreeError]
}
