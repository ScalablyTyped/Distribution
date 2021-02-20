package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a link.
  * @see XCommandProcessor
  */
@js.native
trait Link extends StObject {
  
  /** contains the destination URI of the link. */
  var Destination: String = js.native
  
  /** contains the source URI of the link. */
  var Source: String = js.native
}
object Link {
  
  @scala.inline
  def apply(Destination: String, Source: String): Link = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
