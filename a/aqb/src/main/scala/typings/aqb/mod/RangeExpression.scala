package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeExpression
  extends Expression
     with Instantiable1[/* start */ js.Any, Expression]
     with Instantiable2[/* start */ js.Any, /* end */ js.Any, Expression] {
  
  var _end: Double = js.native
  
  var _start: Double = js.native
  
  var re: RegExp = js.native
  
  def toAQL(): String = js.native
}
