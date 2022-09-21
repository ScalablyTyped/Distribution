package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TernaryOperation
  extends StObject
     with Operation
     with Instantiable5[
      /* operator1 */ String, 
      /* operator2 */ String, 
      /* value1 */ Expression, 
      /* value2 */ Any, 
      /* value3 */ Any, 
      Operation
    ] {
  
  var _operator1: String = js.native
  
  var _operator2: String = js.native
  
  def toAQL(): String = js.native
}
