package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleReference
  extends Expression
     with Instantiable1[/* value */ String, Expression] {
  
  var _value: String = js.native
  
  var re: RegExp = js.native
  
  def toAQL(): String = js.native
}
