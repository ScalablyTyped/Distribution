package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("athenajs", "Deferred")
@js.native
class Deferred () extends StObject {
  
  var promise: Promise = js.native
  
  def reject(`val`: js.Any): Unit = js.native
  
  def resolve(`val`: js.Any): Unit = js.native
}
/* static members */
object Deferred {
  
  /**
    * Creates and immediately resolves a new deferred.
    *
    */
  @JSImport("athenajs", "Deferred.resolve")
  @js.native
  def resolve(): Promise = js.native
  @JSImport("athenajs", "Deferred.resolve")
  @js.native
  def resolve(`val`: js.Any): Promise = js.native
}
