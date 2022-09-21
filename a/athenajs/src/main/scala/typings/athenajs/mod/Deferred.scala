package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Deferred")
@js.native
open class Deferred () extends StObject {
  
  var promise: Promise = js.native
  
  def reject(`val`: Any): Unit = js.native
  
  def resolve(`val`: Any): Unit = js.native
}
/* static members */
object Deferred {
  
  @JSImport("athenajs", "Deferred")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and immediately resolves a new deferred.
    *
    */
  inline def resolve(): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Promise]
  inline def resolve(`val`: Any): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(`val`.asInstanceOf[js.Any]).asInstanceOf[Promise]
}
