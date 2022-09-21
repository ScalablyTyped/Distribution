package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser2 extends StObject {
  
  def getTagDefinition(tagName: String): TagDefinition = js.native
  
  def parse(source: String, url: String): ParseTreeResult = js.native
  def parse(source: String, url: String, options: TokenizeOptions): ParseTreeResult = js.native
}
