package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Event")
@js.native
class Event ()
  extends StObject
     with IEvent {
  def this(publication: Double) = this()
  def this(publication: Double, publisher: String) = this()
  def this(publication: Unit, publisher: String) = this()
  def this(publication: Double, publisher: String, topic: String) = this()
  def this(publication: Double, publisher: Unit, topic: String) = this()
  def this(publication: Unit, publisher: String, topic: String) = this()
  def this(publication: Unit, publisher: Unit, topic: String) = this()
  
  /* CompleteClass */
  var publication: Double = js.native
  
  /* CompleteClass */
  var topic: String = js.native
}
