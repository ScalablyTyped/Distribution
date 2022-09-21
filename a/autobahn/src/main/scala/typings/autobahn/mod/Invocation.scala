package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Invocation")
@js.native
open class Invocation ()
  extends StObject
     with IInvocation {
  def this(caller: Double) = this()
  def this(caller: Double, progress: Boolean) = this()
  def this(caller: Unit, progress: Boolean) = this()
  def this(caller: Double, progress: Boolean, procedure: String) = this()
  def this(caller: Double, progress: Unit, procedure: String) = this()
  def this(caller: Unit, progress: Boolean, procedure: String) = this()
  def this(caller: Unit, progress: Unit, procedure: String) = this()
  
  /* CompleteClass */
  var procedure: String = js.native
}
