package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagPlaceholder
  extends StObject
     with Node3 {
  
  var attrs: StringDictionary[String] = js.native
  
  var children: js.Array[Node3] = js.native
  
  var closeName: String = js.native
  
  var endSourceSpan: ParseSourceSpan | Null = js.native
  
  var isVoid: Boolean = js.native
  
  var startName: String = js.native
  
  var startSourceSpan: ParseSourceSpan | Null = js.native
  
  var tag: String = js.native
}
