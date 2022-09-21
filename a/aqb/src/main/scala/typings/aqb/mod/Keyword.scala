package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyword
  extends StObject
     with Expression
     with Instantiable1[/* value */ Any, Expression] {
  
  var _value: String = js.native
  
  var re: js.RegExp = js.native
  
  def toAQL(): String = js.native
}
