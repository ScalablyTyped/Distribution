package typings.angularCompiler.mod

import typings.angularCompiler.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParseLocation")
@js.native
open class ParseLocation protected () extends StObject {
  def this(file: ParseSourceFile, offset: Double, line: Double, col: Double) = this()
  
  var col: Double = js.native
  
  var file: ParseSourceFile = js.native
  
  def getContext(maxChars: Double, maxLines: Double): After | Null = js.native
  
  var line: Double = js.native
  
  def moveBy(delta: Double): ParseLocation = js.native
  
  var offset: Double = js.native
}
