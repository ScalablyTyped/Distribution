package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "SimpleChange")
@js.native
class SimpleChange protected () extends StObject {
  def this(previousValue: js.Any, currentValue: js.Any, firstChange: Boolean) = this()
  
  var currentValue: js.Any = js.native
  
  var firstChange: Boolean = js.native
  
  /**
    * Check whether the new value is the first value assigned.
    */
  def isFirstChange(): Boolean = js.native
  
  var previousValue: js.Any = js.native
}
