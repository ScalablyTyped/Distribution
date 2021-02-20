package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortExpression
  extends PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* dfns (repeated) */ js.Any, PartialStatement] {
  
  var _args: js.Array[Keyword] = js.native
  
  var keywords: js.Array[String] = js.native
  
  def toAQL(): String = js.native
}
