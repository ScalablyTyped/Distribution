package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitExpression
  extends StObject
     with PartialStatement
     with Instantiable2[/* prev */ PartialStatement, /* offset */ js.Any, PartialStatement]
     with Instantiable3[/* prev */ PartialStatement, /* offset */ js.Any, /* count */ js.Any, PartialStatement] {
  
  def toAQL(): String = js.native
}
