package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Event")
@js.native
open class Event[TName] ()
  extends StObject
     with IEvent[TName] {
  def this(publication: Double) = this()
  def this(publication: Double, publisher: String) = this()
  def this(publication: Unit, publisher: String) = this()
  def this(publication: Double, publisher: String, topic: TName) = this()
  def this(publication: Double, publisher: Unit, topic: TName) = this()
  def this(publication: Unit, publisher: String, topic: TName) = this()
  def this(publication: Unit, publisher: Unit, topic: TName) = this()
  
  /* CompleteClass */
  var publication: Double = js.native
  
  /* CompleteClass */
  var topic: TName = js.native
}
